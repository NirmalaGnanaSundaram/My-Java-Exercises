package com.redington.java.Basics;

import java.util.Scanner;

public class Integer {
	int n;
	void getInput()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n value");
		n=sc.nextInt();
	}

	void odd()
	{
		if(n%2 != 0)
		{
			System.out.println("odd & wired");
		}
	}
	
	void even()
	{
		if((n%2 == 0)&&(n>=2 && n<=5))
		{
			System.out.println("even but not weird");
		}
		else if((n%2 == 0)&&(n>=6 && n<=20))
		{
			System.out.println("even but weird");
		}else if((n%2 == 0)&&(n>20))
		{
			System.out.println("even but not weird");
		}else 
		{
			System.out.println("odd and weird");
		}
	}
}
