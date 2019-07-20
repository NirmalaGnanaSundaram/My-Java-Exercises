package com.redington.java.HomeExercises;

import java.util.Scanner;

public class RangeBetween {
	
	int start,end;
	 
	void getinput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range to Start with");
		start=sc.nextInt();
		
		System.out.println("Enter the range to end by");
		end=sc.nextInt();
	
	}
	
	void process()
	{
		for(int i=start;i<=end;i++)
		{
			System.out.print(i +" "); 
		}
	}

}
