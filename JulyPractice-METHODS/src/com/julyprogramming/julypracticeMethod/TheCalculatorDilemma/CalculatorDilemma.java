package com.julyprogramming.julypracticeMethod.TheCalculatorDilemma;

import java.util.Scanner;

public class CalculatorDilemma {

	public static void main(String[] args) {
          Scanner scan=new Scanner(System.in);
          System.out.println("Enter the two numbers");
          
          double num1=scan.nextDouble();
          double num2=scan.nextDouble();
          
          System.out.println("Enter the case");
          int c=scan.nextInt();
          scan.close();
         
          
          switch(c)
          {
          
          case 1:
        	  System.out.println("Addition :" +(num1+num2));
        	  break;
        	  
          case 2:
        	  System.out.println("Subraction :" +(num1-num2));
        	  break;

          case 3:
        	  System.out.println("Multiplication :" +(num1*num2));
        	  break;

          case 4:
        	  System.out.println("Division Quotient :" +(num1/num2));
        	  break;
        	  
          case 5:
        	  System.out.println("Division :" +(num1%num2));
        	  break;

          default:
        	  System.out.println("Invalid Choice");
        	  
          }
          
	}

}
