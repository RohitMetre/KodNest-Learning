package com.kodNest.ControlConstruct.ConditionalConstructs;

import java.util.Scanner;

public class SimpleIf {

	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
       int marks=scan.nextInt();
        System.out.println("Welcome To Kodnest");
        checkeligibility(marks);
        scan.close();
        
	}
  public static void checkeligibility(int marks)
  {
	  
	if(marks<=80)
	  {
		  System.out.println("welcome to tech club");
		  
	  }
  }
}
