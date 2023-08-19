package com.julyprogramming.julypracticeMethod.TaxCalculator;

import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.println("Calculation Of Total Tax Amount");
       
       System.out.println("Enter the Purchase Amount and Tax Rate");
       double purchase=scan.nextDouble();
       double taxRate=scan.nextDouble();
       scan.close();
       
       System.out.println(calculateTotalWithTax(purchase,taxRate));
       
       
	}

	public static double calculateTotalWithTax(double purchase, double taxRate) {
		return (purchase*taxRate)+purchase;
	}

}
