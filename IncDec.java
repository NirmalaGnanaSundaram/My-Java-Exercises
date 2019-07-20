package com.redington.java.Basics;

public class IncDec {

	public static void main(String[] args) {
		 int a=5;int b=6;int c=7;
		 System.out.println(a++ + a++ + a++);
		 System.out.println(a);
		 System.out.println(a-- + a-- + a--);
		 System.out.println(a);
		 System.out.println(a++ + ++a + --a + a--);
		 
		 
		 System.out.println(a++ + ++a + ++b + c--);
		 
		 System.out.println(a++ + ++b + ++c);
		 
		 System.out.println(++c + ++c + c-- + --c);
		 
		 System.out.println(b++ + b++ + ++b);
		 
		 a=5;//re initialization
		 b=6;
		 
		 System.out.println(++a ==b);
		 System.out.println(--a == --b);
		 System.out.println(a++ > b++);
		 
		 
	}
	

}
