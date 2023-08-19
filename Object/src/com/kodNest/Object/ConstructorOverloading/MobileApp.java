package com.kodNest.Object.ConstructorOverloading;

public class MobileApp {

	public static void main(String[] args) {
          Mobile mob1=new Mobile("Samsung","purple",50000);
          System.out.println(mob1.brand+" "+mob1.color+" "+mob1.cost);
          
          Mobile mob2=new Mobile();
          System.out.println(mob2.brand+" "+mob2.color+" "+mob2.cost);
          
          Mobile mob3=new Mobile("MI");
          System.out.println(mob3.brand+" "+mob3.color+" "+mob3.cost);
          
          Mobile mob4=new Mobile(484884);
          System.out.println(mob4.brand+" "+mob4.color+" "+mob4.cost);

	}

}
