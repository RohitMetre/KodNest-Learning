package com.kodNest.Object.Constructor;

public class Mobile {

	  String brand;
	  String color;
	  int cost;
	  
	  //Constructor
	  public Mobile(String a,String b,int c)
	  {
		  brand=a;
		  color=b;
		  cost=c;
	  }
	  void allowToCall()
	  {
		  System.out.println("Tring Tring---");
	  }
	  void allowToPlay()
	  {
		  System.out.println("Playing BGMI");
	  }
}

