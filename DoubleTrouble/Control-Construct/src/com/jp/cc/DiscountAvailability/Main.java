package com.jp.cc.DiscountAvailability;

import java.util.Scanner;

public class Main {

		public static void checkDiscount(double purchaseAmount) {
			if(purchaseAmount>100)
			{
				System.out.println("Dicount Applicable");
			}
		}
		
		public static void main(String[] args){
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the purcshase amount");
			double purchaseAmount=scan.nextDouble();
	         
			
			checkDiscount(purchaseAmount);
	}
	}
	


