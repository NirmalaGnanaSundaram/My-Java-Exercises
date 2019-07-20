package com.redington.java.HomeExercises;

import java.util.Scanner;

public class Calculator {
	int num1,num2;
    float result; 
	
	void getinput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number 1: ");
		num1=sc.nextInt();
		System.out.println("enter number 2: ");
		num2=sc.nextInt();
	}
	
	void add()
	{
		result=num1+num2;
		System.out.println("the sum is: " + result );
	}
	
	void sub()
	{
		result=num1-num2;
		System.out.println("the difference is: "+ result );
	}
	void mul()
	{
		result=num1*num2;
		System.out.println("the product is: "+ result );
	}
	void div()
	{
		result=num1/num2;
		System.out.println("the quotient is: " + result);
	}
	void mod()
	{
		result=num1%num2;
		System.out.println("the remainder or modulo is: "+ result );
	}

}
