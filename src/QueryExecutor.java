import java.sql.*;
import org.sqlite.*;

public class QueryExecutor 
{
	private static Connection connection = null;
	
	public static void Connect()
	{
	    try 
	    {
	      Class.forName("org.sqlite.JDBC");
	      connection = DriverManager.getConnection("jdbc:sqlite:data/students.db");
	    } 
	    catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    
	    System.out.println("Opened database successfully");
	}
}
