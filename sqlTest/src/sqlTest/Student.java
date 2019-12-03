package sqlTest;

import java.sql.*;
import insert.*;
import java.util.Scanner;

public class Student {
   
     
	 public static Connection conn = null;
	  public static Statement stmt = null;
	  
	public static void initialize() throws ClassNotFoundException, SQLException {
			
		  final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		  final String DB_URL = "jdbc:mysql://localhost:3308/student";
		  final String USER = "root";
		  final String PASS = "admin";
		 
		  Class.forName("com.mysql.jdbc.Driver");
		  conn = DriverManager.getConnection(DB_URL, USER, PASS);
		  stmt = conn.createStatement();
		      	
	  }
	
	
   public static void main(String[] args) throws ClassNotFoundException, SQLException 
   {
	  try
	  {
	  boolean repeat = true;
      do
      {
    	  System.out.println("Enter ur choice 1.insert 2.delete 3.update 4.display 5.search 6.exit");
          Scanner input=new Scanner(System.in);
          int num=input.nextInt();
          switch(num)
      {
          case 1:
          {
        	  
        	  Insert.performInsert();
        	  break;
          }
          case 2:
          {
        	  Delete.performDelete();
        	  break;	  
          }
          case 3:
          {
        	  Update.performUpdate();
        	  break;
          }
          case 4:
          {
        	  Display.performDisplay();
        	  break;
          }
          case 5:
          {
        	  Search.performSearch();
        	  break;
          }
          case 6:
          {
        	  repeat = false;
        	  stmt.close();
        	  break;
          }
          default:
        	  System.out.println("enter valid number"); 
                    
      }
          
      }while(repeat);
          

	   }
	   catch(SQLException se)
	   {
		   System.out.println("sry the id is already exists so pls enter another id");
	       se.printStackTrace();
	   }
	   catch(Exception e)
	   {
		   System.out.println("u enter the worng option so pls enter valid one");
	      e.printStackTrace();
	   }
	   finally
	   {
	      try
	      {
	         if(stmt!=null)
	            conn.close();
	      }
	      catch(SQLException se)
	      {
	      }
	      try{
	         if(conn!=null)
	            conn.close();
	      }
	      catch(SQLException se)
	      {
	         se.printStackTrace();
	      }
	   }

      
      }
}

   