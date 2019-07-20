package com.redington.java.HomeExercises;

import java.util.Scanner;

public class SqrCube {
	
	int number;
	int result;
	
	void getInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		number=sc.nextInt();
		
	}
	 int square()
	{
		result=number*number;
		return result;
	}
	 int cube()
	 {
		 result=number*number*number;
		 return result;
	 }
	

	public static void main(String[] args) {
		
		SqrCube sc=new SqrCube();
		sc.getInput();
		System.out.println("The square of the given number is: " + sc.square());
		System.out.println("The cube of the given number is: " + sc.cube());
		
		
		

		}

}
