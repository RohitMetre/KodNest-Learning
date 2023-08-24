package com.julyprogramming.ControlConstructs.SumOfNaturalNumbersCalculator;

import java.util.Scanner;

public class Main {
	public static void calculateSum(int n)
	{
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);


		
	}

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the natural numbers");
      int n=sc.nextInt();
      calculateSum(n);
      
	}

}
