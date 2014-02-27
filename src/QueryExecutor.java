import java.sql.*;
import org.sqlite.*;

import structures.*;

public class QueryExecutor 
{
	private static Connection connection = null;
	
	public static void Connect()
	{
		try 
	    {
	    	Class.forName("org.sqlite.JDBC");
	    	connection = DriverManager.getConnection("jdbc:sqlite:data/data.db");
	    	
	    	System.out.println("Opened database successfully");     
	    }
	    catch (Exception e) {
	    	System.err.println(e.getClass().getName() + ": " + e.getMessage());
	    	System.exit(0);
	    }
	}
	
	public static boolean AddStudent(Student student)
	{
		//gfutfuyft
		String query =	"INSERT INTO students (name, age, course, groupId)" +
						"VALUES ('" + 
						student.name + "', " +
						student.age + ", " +
						student.course + ", " +
						student.groupId + ");";
		
		try
		{
			Statement statement = connection.createStatement();
			statement.executeUpdate(query);
			statement.close();
			
			return true;
		}
		catch (SQLException e) 
		{
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
	    	return false;
		}
	}
	
	private static void CreateTable(String query)
	{
		/*String query ="CREATE TABLE students " +
						"(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
						"name TEXT NOT NULL, " + 
						"age INT NOT NULL, " + 
						"course INT NOT NULL, " + 
						"groupId INT NOT NULL)"; */
		
		try
		{
			Statement statement = connection.createStatement();
			statement.executeUpdate(query);
			statement.close();
		}
		catch (SQLException e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
	    	System.exit(0);
		}
	}
}
