package com.kodNest.ControlConstruct.ConditionalConstructs;

import java.util.Scanner;

public class NestedIfElse2 {

	public static void main(String[] args) {
          Scanner scan=new Scanner(System.in);
          System.out.println("Enter the Movie Ticket Price");
          int ticket=scan.nextInt();
          scan.close();
          
          NestedIfElse2App vc2=new NestedIfElse2App();
          vc2.CheckAmount(ticket);
	}
     
     }

