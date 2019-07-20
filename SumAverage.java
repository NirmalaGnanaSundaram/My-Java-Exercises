package com.redington.java.HomeExercises;

import java.util.Scanner;

public class SumAverage {

	int num1,num2;
	float result;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1 : ");
		num1=sc.nextInt();
		
		System.out.println("enter num2 : ");
		num2=sc.nextInt();
	
	}
	float add()
	{
	result=num1+num2;
	return result;
	}
	float average()
	{
		result= result/2;
		return result;
	}
	
	public static void main(String[] args) {
		
		SumAverage sa=new SumAverage();
		sa.input();
		System.out.println("the sum of 2 numbers is " + sa.add());
		System.out.println("the average of 2 numbers is " + sa.average());

		
	}

}
