package com.julyprogramming.julypracticeMethod.BitwiseBitCounter;

import java.util.Scanner;

public class BitwiseBitCounter {

	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an Integer");
        int a=scan.nextInt();
        
		System.out.println(countSetBits(a));
	}

	public static int countSetBits(int a) {
		int count = 0;
		while(a>0)
		{
			count +=a & 1;
			a>>=1;
		}
		return count;
		
        
	}

}
