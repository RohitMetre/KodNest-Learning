package com.julyprogramming.ControlConstructs.FibonacciSeries;

	import java.util.Scanner;

	public class Main {
		public static void printFibonacciSeies(int n)
		{
			int fib1=0;
			int fib2=1;
			if(n==1)
			{
			System.out.print(fib1);
			}
			else if(n==2)
			{
				System.out.println(fib1+" "+fib2);
			}
			else
			{
				System.out.println(fib1+" "+fib2);
				for(int i=3;i<=n;i++)
				{
					int nextfib=fib1+fib2;
					System.out.print(nextfib+" ");
					fib1=fib2;
					fib2=nextfib;
				}
				
			}
		}

		public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the number");
	        int n=sc.nextInt();
	        
	        printFibonacciSeies(n);
	        }

	}


