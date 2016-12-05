package pkg.middle;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.lang.reflect.Method;




import pkg.RogueSession.*;
public class Delegator 
{
	String __JBName;
	String __Method;
	public Delegator(){};
	public Map Delegation(Map mp)
	{
		__JBName=mp.get("JBName").toString();
		__Method="add";
		Map mapping=null;
		try{
			Context cx = new InitialContext();
			ServiceRemote remObj=(ServiceRemote)cx.lookup(__JBName);				
		    Class<?>[] ClassTypes = new Class<?>[] { Map.class };
			Method remMethod = remObj.getClass().getMethod(__Method, ClassTypes);
			Object[] map_param = new Object[] { mp };
			mapping = (Map) remMethod.invoke(remObj, map_param);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return mapping;
	}
}
