package com.redington.java.Basics;

import java.util.Scanner;

public class AarryPerfect {
	
	int[] numbers=new int[5];
	int[] elements=new int[5];
	//int[] total=new int[5];
	int sum=0;
	public void getInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		for(int i=0;i<5;i++)
		{
		numbers[i]=sc.nextInt();
		//elements[i]=numbers[i];
		}
	}
	public void findFactors()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=1;j<5;j++)
			{
				if(numbers[i]%j==0)
				{
				//System.out.println(j);
				sum=sum+j;
				
				}
			}
			elements[i]=sum;
		}
		
		for(int l=0;l<5;l++)
		{
			System.out.println(elements[0]);
		}
		/*for(int k=0;k<5;k++)
		{
			if(numbers[k]==elements[k])
			{
				System.out.println(numbers[k]+"is perfect number");
			}
			else
			{
				System.out.println(numbers[k]+"is not perfect");
			}
		}*/
	}
	
}
