package com.redington.java.Basics;

import java.util.Scanner;

public class PerfectNumbers {
	
	int num,sum=0;
	
	public void getInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		num=sc.nextInt();
	}
	public void findFactors()
	{
		System.out.println("the factors of "+num+" is/are ");

		for(int i=1;i<num;i++)
		{
		 if(num%i==0)
		 {
			
			System.out.println(i);
			sum=sum+i;
		 }
		}
		
		System.out.println("sum is "+sum);
	}
	
	public void findPerfectOrNot()
	{
		if(num==sum)
		{
			System.out.println(num +" is perfect number");
		}
		else
		{
			System.out.println(num +" is not perfect number");
		}
	
	}
	

}
