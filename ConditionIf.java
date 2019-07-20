package com.redington.java.Basics;

public class ConditionIf {

	public static void main(String[] args) {
		int p=10;
		 if(p>=10)
		 {
			 System.out.println("hi");
		 }
		 
		 int d=5;
		 if(d++ == 5)
		 {
			 System.out.println("hello");
		 }
		
		 int e=10;
		 if(!(e==100))
		 {
			 System.out.println("eee...");
		 }
		
		 int a=5;int b=6;
		 boolean result=a>b;
		 if(result)
		 
			 System.out.println("a is greater");
		 
		 else
		 
			 System.out.println("b is greater");
		 
		 
		 
		 if(true)//always take as true
		 {
			 System.out.println("iiii");
		 }
		 
		 if(false)//false so no output, bcoz always take true
		 
			 System.out.println("kkkkkk");
		 
		//for if ,else is not compulsorily required. 
		//for block of statement only '{}' need.not for single line execution.
		 
		 a=10;
		 if(a==10)
		 {
			 System.out.println(a);
		 }
		 
		 
			
	}
	
	

}
