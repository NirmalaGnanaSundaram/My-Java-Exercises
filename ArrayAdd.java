package com.redington.java.Basics;

import java.util.Scanner;

public class ArrayAdd {
   int n=3;
	int[] mark=new int[n];
	
	int sum=0;
	float average;
	
	int getinput()
	{
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter number for" +i+" :");
		  mark [i]=sc.nextInt();
		  
		 sum=sum+mark[i];
		  
		}
		System.out.println(sum);
   return sum;
}
	
	void average()
	{
		
	average=sum/n;
	System.out.println(average);
	
	}
	
	public static void main(String[] args)
	{
		ArrayAdd aa=new ArrayAdd();
		aa.getinput();
		aa.average();
	}
	
}
