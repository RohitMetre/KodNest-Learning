package com.kodNest.Object.ObjectOrientation;

public class StudentApp {

	public static void main(String[] args) {
          Student s1=new Student();
          Student s2=new Student();
          
          s1.eat();
          s2.study();
          s1.sleep();
          s2.eat();
         
          s1.id=1;
          s1.name="Balki";
          s1.age=22;
          s1.branch="cs";
          
          s2.id=2;
          s2.name="sahana";
          s2.age=20;
          s2.branch="ece";
          
          System.out.println(s1.id);
          System.out.println(s1.name);
          System.out.println(s1.age);
          System.out.println(s1.branch);
          
          System.out.println(s2.id);
          System.out.println(s2.name);
          System.out.println(s2.age);
          System.out.println(s2.branch);
	}

}
