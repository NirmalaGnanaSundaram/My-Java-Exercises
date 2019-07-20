package com.redington.java.Basics;

import java.util.Scanner;

public class ArrayAsc_Desc {
	
	int[] numbers=new int[5];
	int temp=0;
	int[] asc=new int[5];
	int[] dsc=new int[5];
	
	public void getInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		for(int i=0;i<5;i++)
		{
			numbers[i]=sc.nextInt();
			
			asc[i]=numbers[i];
			
			dsc[i]=numbers[i];
			
		}
		
		
	}
	public void ascendingOrder()
	{ 
		for(int i=0;i<5;i++)
		{
		   
			for(int j=i+1;j<5;j++)
			{
				
				
				if(asc[i]>asc[j])
				{
				temp=asc[i];
				asc[i]=asc[j];
				asc[j]=temp;
				}
				
			}
		}
	}
	public void descending()
	{
		for(int i=0;i<5;i++)
		{
		   
			for(int j=i+1;j<5;j++)
			{
				
				
				if(dsc[i]<dsc[j])
				{
				temp=dsc[i];
				dsc[i]=dsc[j];
				dsc[j]=temp;
				}
				
			}
		}
	
	}
	
	public void getoutput()
	{
		System.out.println("ascending order \t descending order");
		for(int i=0;i<5;i++)
		{
			
			System.out.println(asc[i]+"\t\t\t\t"+ dsc[i]);
		}
	}
	

}
