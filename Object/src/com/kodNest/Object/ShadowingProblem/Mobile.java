package com.kodNest.Object.ShadowingProblem;

public class Mobile {

      String brand;
      String color;
      int cost;
      
      public Mobile(String brand,String color,int cost)
      {
    	  //Shadowing Problem
    	  //brand=brand;
    	  //color=color;
    	  //cost=cost;
    	  
    	  //Solution to shadowing problem
    	  
    	  this.brand=brand;
    	  this.color=color;
    	  this.cost=cost;
	}
      void allowToCall()
      {
    	  System.out.println("Tring---");
    	  
      }
      void allowToPlay()
      {
    	  System.out.println("start playing bgmi");
    	  
      }

}
