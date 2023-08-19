package com.julyprogramming.julypracticeMethod.MethodOverloadingCalculator;


import java.util.Scanner;

public class MethodOverloadingCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scan.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scan.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scan.next().charAt(0);
        scan.close();

        
        switch (operator) {
        case '+':
      	  System.out.println("Result :" +(num1+num2));
      	  break;
      	  
        case '-':
      	  System.out.println("Result :" +(num1-num2));
      	  break;

        case '*':
      	  System.out.println("Result :" +(num1*num2));
      	  break;

        case '/':
      	  System.out.println("Result :" +(num1/num2));
      	  break;
      	  default:
      		  System.out.println("Invalid operator");
        }
    }

    // Method for addition
    public static double calculate(double num1, double num2) {
        return num1 + num2;
    }

    // Method for subtraction
    public static double calculate(double num1, double num2, char operator) {
        return num1-num2;
    }

    // Method for multiplication
    public static double calculate2(double num1, double num2, char operator) {
        return num1*num2;
    }

    // Method for division
    public static double calculate3(double num1, double num2, char operator) {
       return num1/num2;
        }
    
    }
