package pkg.RogueSession;

import pkg.Connector.DBConector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import pkg.utils.Calculator;
@Stateless
@LocalBean
public class Service implements ServiceRemote {
	Calculator c;
	Connection con=null;
	ResultSet rs=null;
	PreparedStatement stmt=null;
	String SQL="";
    public Service() {
    	c= new Calculator();       
    }
	@Override
	public Map LoginCheck(Map map) {
		
		long a=Long.parseLong(map.get("n1").toString());
		long b= Long.parseLong(map.get("n2").toString());
		String uid=map.get("UID").toString();
		String pass=map.get("PASS").toString();
		map.clear();
		DBConector db= new DBConector();
		try{
		    con=db.GetConnection();
			SQL="SELECT UI.USER_ID FROM USERINFO UI "
					+ "  WHERE UI.USER_NAME='"+uid+"'"
					+ "  AND UI.USER_PASS='"+ pass+"'";
			
			stmt=con.prepareStatement(SQL);
			rs=stmt.executeQuery();
			if(rs.next())
			{
				map.put("RES","lOGIN SUCESSFULLY DONE FOR ID: "+rs.getString("USER_ID"));
			}
			else
			{
				map.put("RES","lOGIN NOT SUCESSFULLY DONE FOR ID: "+rs.getString("USER_ID"));	
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
			map.put("RES","Error in Login check method");
		}		
		return map;		
	}    
}
