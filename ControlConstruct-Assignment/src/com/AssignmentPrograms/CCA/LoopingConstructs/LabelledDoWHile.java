package com.AssignmentPrograms.CCA.LoopingConstructs;

public class LabelledDoWHile {

	public static void main(String[] args) {
       int a=1;
       rohit:do
       {
    	   int b=1;
    	   metre:do
    	   {
    		   System.out.print("* ");
    		   b++;
    		   break rohit;
    	   }while(b<=5);
       }while(a<=5);
    		
	}


}