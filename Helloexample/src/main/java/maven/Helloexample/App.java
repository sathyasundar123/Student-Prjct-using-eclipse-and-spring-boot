package maven.Helloexample;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
    	String name;
		Scanner input=new Scanner(System.in);
    	System.out.println("enter your name");
    	name=input.next();
    	System.out.format( "Welcome to the maven project %s",name);
   
    }
}
