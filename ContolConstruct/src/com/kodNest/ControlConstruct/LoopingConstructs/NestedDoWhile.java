package com.kodNest.ControlConstruct.LoopingConstructs;

public class NestedDoWhile {

	public static void main(String[] args) {
		int m=1;
		do
		{
			int n=1;
		    do
			{
					System.out.print("Kodnest ");
					n++;
				}while(n<=5);
			
			System.out.println();
			m++;
		}while(m<=5);
		System.out.println("Technologies");
	}

}
