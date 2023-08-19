package com.kodNest.Object.Constructor;

public class MobileApp {

	public static void main(String[] args) {
       Mobile mob=new Mobile("Samsung","Black",12500);
       System.out.println(mob.brand+" "+mob.color+" "+mob.cost);
       
       mob.allowToCall();
       mob.allowToPlay();
       
      
	}

}
