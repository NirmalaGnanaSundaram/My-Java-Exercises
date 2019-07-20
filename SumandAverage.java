package com.redington.java.test;

import java.util.Scanner;

public class SumandAverage {
	float num;
	float sum=0;
	float average;
	
	void summing()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		int count=0;
		for(int i=0;i<num;i++)
		{
			sum=sum+num;
			 count=count+1;
			System.out.println("do u want to continue(c/q): ");
			char ch=sc.next().charAt(0);
			if(ch=='q')
			{
				System.out.println("QUIT");
				break;
			}
			System.out.println("enter the number");
			 num=sc.nextInt();
				
		}
			
			System.out.println("sum is: "+sum);
			average=sum/count;
			System.out.println("average is: "+average);
			
		
		
	}

}
