package insert;

import java.util.Scanner;

import sqlTest.Student;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Search {

	public static void performSearch() throws SQLException, ClassNotFoundException
	{
		Student.initialize();
		Scanner input=new Scanner(System.in);

		System.out.println("enter the field u want to serach 1.id 2.name 3.rollno 4.college 5.cgpa 6.cgpa operation");
  	  int chioce=input.nextInt();
					        	           switch(chioce)
					        	               {
					                      	  case 1:
					        	               {
					          		           System.out.println("enter the id u want to search");  
					        	            	 int id1=input.nextInt();
					                           String q="Select * from student where serialno='"+id1+"'";
					              			   ResultSet rs=Student.stmt.executeQuery(q);
					              			   if(rs.next())
					              			    {
					              				do{
					              					System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4)+","+rs.getFloat(5));
					              				}while(rs.next());
					              			    }
					              			    else
					              			   {
					              				System.out.println("sry!! Record Not Found...");
					              			    }
					                          
					              			    break;
					        	                } 
					        	             
					                      	  case 2:
					                      	  {
					                      		 System.out.println("enter the name u want to search");
					                      		 String name=input.next();
					                             String q="Select * from student where name='"+name+"'";
					                			   ResultSet rs=Student.stmt.executeQuery(q);
					                			   if(rs.next())
					                			    {
					                				do{
					                					System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4)+","+rs.getFloat(5));
					                				}while(rs.next());
					                			    }
					                			    else
					                			   {
					                				System.out.println("sry!!Record Not Found...");
					                			    }
					                			break;
					                      		 
					                      	  }
					                      	case 3:
					                    	  {
					                    		 System.out.println("enter the rollno u want to search");
					                    		 String rollno=input.next();
					                           String q="Select * from student where rollno='"+rollno+"'";
					              			   ResultSet rs=Student.stmt.executeQuery(q);
					              			   if(rs.next())
					              			    {
					              				do{
					              					System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4)+","+rs.getFloat(5));
					              				}while(rs.next());
					              			    }
					              			    else
					              			   {
					              				System.out.println("sry !!Record Not Found...");
					              			    }
					              			break;
					                    		 
					                    	  }
					                      	case 4:
					                    	  {
					                    		 System.out.println("enter the college u want to search");
					                    		 String clg=input.next();
					                           String q="Select * from student where college='"+clg+"'";
					              			   ResultSet rs=Student.stmt.executeQuery(q);
					              			   if(rs.next())
					              			    {
					              				do{
					              					System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4)+","+rs.getFloat(5));
					              				}while(rs.next());
					              			    }
					              			    else
					              			   {
					              				System.out.println("sry !!Record Not Found...");
					              			    }
					              			break;
					                    		 
					                    	  }
					                      	case 5:
					                      	{
					                      		int count = 0;
					                    		 System.out.println("enter the cgpa u want to search");
					                    		 float cpga=input.nextFloat();
					                    		Student. stmt = Student.conn.createStatement();
					              			      ResultSet rs=Student.stmt.executeQuery("Select * from student");
					              			      while(rs.next())
					              			      {
					              			    	  String str1 = rs.getString("cpga");
					              			    	  if(str1.equals(String.valueOf(cpga)))
					              			    	  {
					                    					System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4)+","+rs.getFloat(5));
					                    					count =1;
					              			             }
					              			    	 
					              			      }
					              			      if(count == 0) {
					              			    	 System.out.println("sry !! cpga not found");
					              			      }
					              			   
					              			      break;
					                    		 
					                      	}
					        	               
					 case 6:
                	{

             		 System.out.println("enter the cgpa opeation 1.greater than 2.less than 3.equal");
             		 int choi=input.nextInt();
									                   		 switch(choi)
									                   		 {
									                   		 case 1:
									                   		 {
									                   			 System.out.println("enter the cgpa u want to search");
									                   			 float cg=input.nextFloat();
									                             String q="Select * from student where cpga>='"+cg+"'";
									                			   ResultSet rs=Student.stmt.executeQuery(q);
									                			   if(rs.next())
									                			    {
									                				do{
									                					System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4)+","+rs.getFloat(5));
									                				}while(rs.next());
									                			    }
									                			    else
									                			   {
									                				System.out.println("sry!! Record Not Found...");
									                			    }
									                			break;	
									                         	 
									                   		 }
									                   		 case 2:
									                   		 {
									                   			 System.out.println("enter the cgpa u want to serach");
									                   			 float cg=input.nextFloat();
									                             String q="Select * from student where cpga<='"+cg+"'";
									                			   ResultSet rs=Student.stmt.executeQuery(q);
									                			   if(rs.next())
									                			    {
									                				do{
									                					System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4)+","+rs.getFloat(5));
									                				}while(rs.next());
									                			    }
									                			    else
									                			   {
									                				System.out.println("sry !! Record Not Found...");
									                			    }
									                			break;	
									                         	
									                   		 }
									                   		  
									                   		 case 3:
									                   		 {
									                   			int count = 0;
									                    		 System.out.println("enter the cgpa u want to search");
									                    		 float cpga=input.nextFloat();
									                    		 Student.stmt = Student.conn.createStatement();
									              			      ResultSet rs=Student.stmt.executeQuery("Select * from student");
									              			      while(rs.next())
									              			      {
									              			    	  String str1 = rs.getString("cpga");
									              			    	  if(str1.equals(String.valueOf(cpga)))
									              			    	  {
									                    					System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4)+","+rs.getFloat(5));
									                    					count =1;
									              			             }
									              			    	 
									              			      }
									              			      if(count == 0) {
									              			    	 System.out.println("sry !! cpga not found");
									              			      }
									              			   	break;	
									                         	
									                   		 }
			                   		                         default:System.out.println("enter the valid operation");
			                   		                          }
									                   		 break;
             		  }
					        	               
                    default:
                  	  System.out.println("enter the valid id number");
  	               
	
	}
	}
}
