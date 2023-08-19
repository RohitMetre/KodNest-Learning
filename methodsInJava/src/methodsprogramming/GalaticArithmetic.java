package methodsprogramming;

import java.util.Scanner;

public class GalaticArithmetic {

	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        long num1=scan.nextLong();
        
        System.out.println("enter the second number");
        long num2=scan.nextLong();
        
       System.out.println(galacticAddition(num1, num2));
        
        		
        	
	}
	public static long galacticAddition(long num1,long num2 ) {
		
		return num1+num2;
	}

}
