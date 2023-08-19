package com.julyprogramming.julypracticeMethod.TempreatureConvwesion;

import java.util.Scanner;

public class TempratureConversion {

	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome to the Temperature Conversion Tool");
        
        System.out.println("Enter the coice 1 or 2");
        int choice=scan.nextInt();
        
    	if(choice==1) {
        System.out.println("1 Coversion of fahrenheit to celsius : ");
        double f=scan.nextDouble();
        System.out.println(farToCel(f));
        scan.close();
    	}
    	else if(choice==2)
    	{
        System.out.println("2 Conversion of celsius to fahrenheit");
        double c=scan.nextDouble();
        System.out.println(celToFar(c));
      
    	}
        
        else
        {
        	System.out.println("invalid");
        }
	}
	public static double farToCel(double f)
	{
		return (f-32)*5/9;
	}
	public static double celToFar(double c)
	{
		return (9/5*c)+32;
	}
}