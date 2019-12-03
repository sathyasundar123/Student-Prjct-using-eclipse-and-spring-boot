package insert;

import java.sql.ResultSet;
import java.sql.SQLException;

import sqlTest.Student;

public class Display 
{
public static void performDisplay() throws SQLException, ClassNotFoundException
{
	Student.initialize();
	  System.out.println("display the database");
      String query = "SELECT * FROM student";
     ResultSet rss = Student.stmt.executeQuery(query);
     while (rss.next())
     {
       int serialno = rss.getInt("serialno");
       String name = rss.getString("name"); 
       String rollno = rss.getString("rollno");
       String college=rss.getString("college");
       Float cpga=rss.getFloat("cpga");
       System.out.format("%d	%s	%s	%s	%f\n", serialno, name, rollno, college, cpga);
     }
}
}
