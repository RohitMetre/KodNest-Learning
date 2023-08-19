package com.kodNest.Object.ObjectOrientation;

public class FanApp {

	public static void main(String[] args) {
             Fan f1=new Fan();
             f1.no_of_wings =3;
             f1.cost=456;
             f1.color="Black";
             f1.brand="Usha";
             
                         
             System.out.println(f1.no_of_wings+" "+f1.cost+" "+f1.color+" "+f1.brand);
             
             f1.rotate();
             f1.blowAir();

             System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
             
             
             Fan f2=new Fan();
             f2.no_of_wings =2;
             f2.cost=763;
             f2.color="Brown";
             f2.brand="Bajaj";
           
             System.out.println(f2.no_of_wings+" "+f2.cost+" "+f2.color+" "+f2.brand);
             
             
             f2.rotate();
             f2.blowAir();
             
             System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
             
             Fan f3=new Fan();
             f3.no_of_wings=4;
             f3.cost=2386;
             f3.color="Red";
             f3.brand="Crompton";
             
                         
             System.out.println(f3.no_of_wings+" "+f3.cost+" "+f3.color+" "+f3.brand);
             
             
             f3.rotate();
             f3.blowAir();

             
             
             
	}

}
