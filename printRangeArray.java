package com.redington.java.Basics;

import java.util.Scanner;

public class printRangeArray {
	
	int[] num =new int[10];
	Scanner sc=new Scanner(System.in);
	
	void getInput()
	{
		System.out.println("=====INPUTS=====");
		for(int i=0;i<10;i++)
		{
			num[i]=sc.nextInt();
		}
	}
	void range()
	{
		System.out.println("starting value");
		int start=sc.nextInt();
		System.out.println("starting value");
		int end=sc.nextInt();
		System.out.println("numbers in between range of"+start+" & "+end+" in given array");
		
		for(int i=start;i<=end;i++)
		{
			System.out.println(num[i]);
		}
			
	}
	

}
