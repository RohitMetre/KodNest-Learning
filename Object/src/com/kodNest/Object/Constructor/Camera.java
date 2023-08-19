package com.kodNest.Object.Constructor;

public class Camera {

	  String color;
	  String brand;
	  int cost;
	  
	  void captureImage()
	  {
		  System.out.println("the image is captured which is "+color+" in color of "+brand +"company of "+cost+" rupees");
	  }
	  void displayImage()
	  {
		  System.out.println("the image is displayed which is "+color+" in color of "+brand +"company of "+cost+" rupees");  
	  }
	  
	  //Constuctor
	  
	  public Camera(String x,String y,int z)
	  {
		  color=x;
		  brand=y;
		  cost=z;

	  
	  	 	  }
}


	 