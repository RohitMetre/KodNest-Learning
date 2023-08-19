package com.kodNest.Object.ObjectOrientation;

public class Fan {
     int no_of_wings;
     int cost;
     String color;
     String brand;
     
     void rotate()
     {
    	 System.out.println("fan can rotate in "+color+ " color and " +brand+ " brand and has "+no_of_wings+" no.of wings and the cost of is "+cost);
     }
     void blowAir()
     {
    	 System.out.println("fan will blow air in "+color);
     }
}
