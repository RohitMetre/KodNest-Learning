package com.kodNest.methodsInJava.MethodTypes;

public class Type4Method {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int res=add(a,b);
		System.out.println(res);
	}
	public static int add(int x,int y) {
		int z=x+y;
		System.out.println(z);
		return z;

	}

}
