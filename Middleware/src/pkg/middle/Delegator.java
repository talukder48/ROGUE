package pkg.middle;
import java.util.Map;
import javax.naming.Context;
import javax.naming.InitialContext;
import pkg.RogueSession.*;
public class Delegator 
{
	String __JBName;
	public Delegator(){};
	public void Delegation(Map mp)
	{
		__JBName=mp.get("JBName").toString();
		try{
			Context cx = new InitialContext();
			ServiceRemote SL=(ServiceRemote)cx.lookup(__JBName);
			SL.add(10, 20);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
