package com.kodNest.Object.ConstructorOverloading;

public class Mobile {
      String brand;
      String color;
      int cost;
      
      public Mobile(String a,String b,int c)
      {
    	  brand=a;
    	  color=b;
    	  cost=c;
      }
      public Mobile() {
    	  brand="Apple";
    	  color="Gold";
    	  cost=23000;
      }
      public Mobile(String x) {
    	  brand=x;
    	  color="white";
    	  cost=40000;
    	  
      }
      public Mobile(int c) {
    	  brand="Gionee";
    	  color="Gold";
    	  cost=c;
      }
      
      void allowToCall()
      {
    	  System.out.println("Tring Tring---");
      }
      void allowToPlay()
      {
    	  System.out.println("Start Playing BGMI");
      }
}
