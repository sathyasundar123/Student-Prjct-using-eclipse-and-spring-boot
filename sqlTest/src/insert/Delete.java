package insert;

import java.util.Scanner;

import sqlTest.Student;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete 
{
public static void performDelete() throws SQLException, ClassNotFoundException
{
	Student.initialize();
	Scanner input=new Scanner(System.in);
	
String query1 = "SELECT * FROM student"; 
     ResultSet rss = Student.stmt.executeQuery(query1);
     while (rss.next())
     {
       int serialno1 = rss.getInt("serialno");
       String name1 = rss.getString("name");
       String rollno = rss.getString("rollno");
       String college=rss.getString("college");
       Float cpga=rss.getFloat("cpga");
       System.out.format("%d	%s	%s	%s	%f\n", serialno1, name1, rollno, college, cpga);
 
     }
	  System.out.println("enter the id u want to delete from db");
	  int id;
	  id=input.nextInt();
	  String sql="delete from student where serialno='"+id+"'";
 
     Student.stmt.executeUpdate(sql);  
     //display the database

     ResultSet rss1 = Student.stmt.executeQuery(query1);
     while (rss1.next())
     {
       int serialno1 = rss1.getInt("serialno");
       String name1 = rss1.getString("name");
       String rollno = rss1.getString("rollno");
       String college=rss1.getString("college");
       Float cpga=rss1.getFloat("cpga");
       System.out.format("%d	%s	%s	%s	%f\n", serialno1, name1, rollno, college, cpga);
     }

}
}
