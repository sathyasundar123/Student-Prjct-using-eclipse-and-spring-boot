package insert;

import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import sqlTest.Student;

public class Update
{
  public static void performUpdate() throws SQLException, ClassNotFoundException
  {
		Student.initialize();
		Scanner input=new Scanner(System.in);
	  System.out.println("enter the id u want to update from db");
	  int id1,choice;
	  id1=input.nextInt();
	  System.out.println("enter the field u want to update 1.name 2.rollono 3.college name 4.cpga");
	  choice=input.nextInt();
	  switch(choice)
	  {
	  case 1:
		  {
			  System.out.println("enter the new name u want to change");
			  String newname;
			  newname=input.next();
			    PreparedStatement pstmt = null;
			  String query = "update student set name = ? where serialno = ? ";
		      pstmt = Student.conn.prepareStatement(query); 
		      pstmt.setString(1, newname); 
		      pstmt.setInt(2, id1); 
		      pstmt.executeUpdate(); 
		      //display the database
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
	        //  stmt.close();
	          break;
		  }
		  
	  case 2:
	  {
		System.out.println("enter the new rollno u want to change");
		String newroll;
		newroll=input.next();
		 PreparedStatement pstmt = null;
		  String query = "update student set rollno = ? where serialno = ? ";
	      pstmt = Student.conn.prepareStatement(query); 
	      pstmt.setString(1, newroll); 
	      pstmt.setInt(2, id1); 
	      pstmt.executeUpdate(); 
	      //display the database
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
        //  stmt.close();
	      break;	
	  }
	  
	  case 3:
	  {
		  System.out.println("enter the new college u want to change");
  		String newclg;
  		newclg=input.next();
  		 PreparedStatement pstmt = null;
			  String query = "update student set college = ? where serialno = ? ";
		      pstmt = Student.conn.prepareStatement(query); 
		      pstmt.setString(1, newclg);
		      pstmt.setInt(2, id1); 
		      pstmt.executeUpdate();
		    //display the database
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
       //   stmt.close();
		      break;
	  }
	  
	  case 4:
	  {

		  System.out.println("enter the new cpga u want to change");
  		Float newcgp;
  		newcgp=input.nextFloat();
  		 PreparedStatement pstmt = null;
			  String query = "update student set cpga = ? where serialno = ? ";
		      pstmt = Student.conn.prepareStatement(query);
		      pstmt.setFloat(1, newcgp); 
		      pstmt.setInt(2, id1); 
		      pstmt.executeUpdate();
		    //display the database
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
         // stmt.close();
		      break;
	  }
	  default:System.out.println("enter the valid number");
	  }
  }
}
