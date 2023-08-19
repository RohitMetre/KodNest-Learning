package com.kodNest.ControlConstruct.LoopingConstructs;

public class LabeledWhileLoop {

	public static void main(String[] args) {
       int a=1;
       rohit:while(a<=5)
       {
    	  int j=1;
    	  metre:while(j<=5)
    	   {
    		   System.out.println("* ");
    		   j++;
    		   break rohit;
    	   }
    	   a++;
    	   System.out.println();
 	}

}
}
