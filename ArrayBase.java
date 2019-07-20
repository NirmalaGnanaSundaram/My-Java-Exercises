package com.redington.java.Basics;

import java.util.Scanner;

public class ArrayBase {
	
	 int n=6;
	int[] marks=new int[n];
	
	void getinput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers");
		
		for(int i=0;i<n;i++)
		{
			marks[i]=sc.nextInt();
			
		}
		
	}
	void output()
	{
		for(int i=0;i<n;i++){
		
		System.out.println(marks[i]);
		}
	}

	public static void main(String[] args) {
		
		ArrayBase ab=new ArrayBase();
		ab.getinput();
		ab.output();
	}

}
