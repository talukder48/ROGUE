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
	public Map add(Map map) {
		
		long a=Long.parseLong(map.get("n1").toString());
		long b= Long.parseLong(map.get("n2").toString());
		map.clear();
		map.put("RES",c.Sumation(a,b));
		DBConector db= new DBConector();
		try{
		    con=db.GetConnection();
			
			SQL="select USER_ID from users";
			stmt=con.prepareStatement(SQL);
			rs=stmt.executeQuery();
			if(rs.next())System.out.println(" data found");
			else System.out.println("No data found");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return map;
		
	}
    
}
