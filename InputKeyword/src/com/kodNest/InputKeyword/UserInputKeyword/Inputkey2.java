package com.kodNest.InputKeyword.UserInputKeyword;

import java.util.Scanner;

public class Inputkey2 {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
	      System.out.println("enter student first name");
	      String fn=scan.next();
	      System.out.println("First name="+fn);
	      System.out.println("enter student last name");
	      String ln=scan.next();
	      System.out.println("Last name="+ln);
	      System.out.println("enter student age");
	      int age=scan.nextInt();
	      System.out.println("Age="+age);
	      System.out.println("is student married?");
	       boolean d=scan.nextBoolean();
	      System.out.println("value in  d is "+d);
	      System.out.println("enter student branch");
	      scan.nextLine();
	      String e=scan.nextLine();
	      System.out.println("value in e is "+e);
	      System.out.println("enter student height");
	      float f=scan.nextFloat();
	      System.out.println("value in f is "+f);
	      System.out.println("enter student weight");
	      double g=scan.nextDouble();

	}

}
