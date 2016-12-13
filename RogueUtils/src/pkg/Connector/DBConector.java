package pkg.Connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import pkg.jbnames.DBinfo;
import oracle.jdbc.driver.OracleDriver;
public class DBConector {
	public Connection GetConnection()
	{
		Connection con =null;
	    try {
	           Class.forName(DBinfo._DBCLASS);
	           con = DriverManager.getConnection
	        		   (
		        		   DBinfo._DBURL,
		        		   DBinfo._DBUSER,
		        		   DBinfo._DBPASS
	        		   );
	    	}catch (ClassNotFoundException e) {
	           e.printStackTrace();
	    	}catch (SQLException e){
	           e.printStackTrace();
	    	}
	    return con;
	}
}
