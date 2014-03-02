import java.sql.*;
import java.util.ArrayList;

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
	
	public static ArrayList<Student> GetStudents()
	{
		ArrayList<Student> students = new ArrayList<Student>();
		String query = "SELECT * FROM students";
		
		try
		{
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(query);
			
			while (result.next())
			{
				Student student = new Student();

				student.recordBookId = result.getInt("RecordBookId");
				student.firstName = result.getString("FirstName");
				student.secondName = result.getString("SecondName");
				student.middleName = result.getString("MiddleName");
				// student.birthDate = result.getDate("BirthDate");
				
				students.add(student);
			}
			
			statement.close();
		}
		catch (SQLException e) 
		{
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			return null;
		}
		
		return students;
	}
}
