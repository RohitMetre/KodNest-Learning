package com.julyprogramming.ControlConstructs.GreatestCommonDivisor;

	import java.util.Scanner;

	public class Main {
	          
		public static void findGCD(int a,int b )
		{
			
			while(b!=0)
			{
				int rem=a%b;
				a=b;
				b=rem;
		}
			int gcd=a;
		   	System.out.println(gcd);
		}
		public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int a=36;
	        int b=60;
	        
	        findGCD(36,60);
	        
	       
		}

	}


