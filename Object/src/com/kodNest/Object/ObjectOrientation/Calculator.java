package com.kodNest.Object.ObjectOrientation;

public class Calculator {
   
	int num1;
	int num2;
	
	void add()
	{
		int res1=num1+num2;
		System.out.println("Addition Result"+res1);
	}
	void sub()
	{
		int res2=num1-num2;
		System.out.println("Subtraction Result"+res2);
		
	}
	void mul()
	{
		int res3=num1*num2;
		System.out.println("multiplication Result"+res3);
	}
	void div()
	{
		int res4=num1/num2;
		System.out.println("Division Result"+res4);
	}
}
