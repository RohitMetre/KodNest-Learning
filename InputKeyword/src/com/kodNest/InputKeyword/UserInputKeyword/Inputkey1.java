package com.kodNest.InputKeyword.UserInputKeyword;
import java.util.Scanner;
public class Inputkey1 {

	public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.println("enter the integer");
      int a=scan.nextInt();
      System.out.println("value in a is "+a);
      System.out.println("enter a real number");
      float b=scan.nextFloat();
      System.out.println("value in b is "+b);
      System.out.println("enter another real number");
      double c=scan.nextDouble();
      System.out.println("value in c is "+c);
      System.out.println("are u married?");
       boolean d=scan.nextBoolean();
      System.out.println("value in  d is "+d);
      System.out.println("enter ur insta id");
      String e=scan.next();
      System.out.println("value in e is "+e);
      System.out.println("enter ur full name");
      scan.nextLine();
      String f=scan.nextLine();
      System.out.println("value in f is "+f);

      
	}

}
