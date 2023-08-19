package com.kodNest.methodsInJava.methodOverLoading;

public class DisneyChai {

	public static void main(String[] args) {
          teaBill();
          teaBill("Ginger");
          teaBill(10);
          teaBill(10,"Ginger");
          
	}
	public static void teaBill() {
		System.out.println("Bill for tea is 10 rs");
		
	}
	public static void teaBill(int n) {
		System.out.println("Bill for "+n+" tea is "+(n*10)+"rs");
	}
	public static void teaBill(String type) {
		System.out.println("Bill for "+type+"tea is 15 rs");
	}
	public static void teaBill(int n,String type) {
		System.out.println("Bill for "+n+" "+type+" tea is "+(n*15)+"rs");
	}

}
