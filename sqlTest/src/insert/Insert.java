package insert;

import sqlTest.Student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insert {

	  public static int serialno;
	  public static String name,rolno,clg;
	  public static float cpg;
	 
	   
	
	  
	  
	  
	public static void performInsert() throws SQLException, ClassNotFoundException {
		Student.initialize();
		Scanner input=new Scanner(System.in);
		System.out.println("enter the id of the student"); 
  	  serialno=input.nextInt();
  	  System.out.println("enter the name of the student");
  	  name=input.next();
  	  System.out.println("enter the rollno of the student");
  	  rolno=input.next();
  	  System.out.println("enter the college of the student");
  	  clg=input.next();
  	  System.out.println("enter the cgpa of the student");
  	  cpg=input.nextFloat();
  	 
  	  PreparedStatement ps = Student.conn.prepareStatement("INSERT INTO student VALUES(?,?,?,?,?)");
	  ps.setInt(1, serialno);
	  ps.setString(2, name);
	  ps.setString(3,rolno);
	  ps.setString(4, clg);
	  ps.setFloat(5, cpg);
	  ps.executeUpdate();
	  System.out.println("after insert data");
	  String query = "SELECT * FROM student";
      ResultSet rss = Student.stmt.executeQuery(query);
       while (rss.next())
       {
      int serialno1 = rss.getInt("serialno");
      String name1 = rss.getString("name");
      String rollno = rss.getString("rollno");
      String college=rss.getString("college");
      Float cpga=rss.getFloat("cpga");
      System.out.format("%d	%s	%s	%s	%f\n", serialno1, name1, rollno, college, cpga);
     
     }

	}
	
}
