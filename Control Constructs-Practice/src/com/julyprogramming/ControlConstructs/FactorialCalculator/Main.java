package com.julyprogramming.ControlConstructs.FactorialCalculator;

import java.util.Scanner;

public class Main {
	public static void calculatorFactorial(int n)
	{
		int fact=1;
		for(int i=5;i>0;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number ");
      int n=sc.nextInt();
      calculatorFactorial(n);
     
	}

}
