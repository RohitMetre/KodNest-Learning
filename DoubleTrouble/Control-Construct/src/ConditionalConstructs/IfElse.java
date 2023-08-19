package ConditionalConstructs;

import java.util.Scanner;

public class IfElse {

	
		public static void main(String[] args) {
	        Scanner scan=new Scanner(System.in);
	        System.out.println("Enter your Age");
	       int age=scan.nextInt();
	        
	       IfElse ie=new IfElse();
	        ie.checkeligibility(age);
	        scan.close();
	        
		}
	   void checkeligibility(int age)
	  {
		  
		if(age>=18)
		  {
			  System.out.println("You are eligible for voting");
			  
		  }
		else
		{
			System.out.println("You are not eligible for voting");
		}
	  }
	

	}


