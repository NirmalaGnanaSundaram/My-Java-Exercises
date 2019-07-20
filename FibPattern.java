package com.redington.java.Basics;

import java.util.Scanner;

public class FibPattern {
	int num;
	int f1=0,f2=1,f3;
	int range;
	void getValue()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter range");
		num=sc.nextInt();
		
		range=2*num;
	}
	void fib()
	{ 
		for(int i=0;i<=num;i++)
		{

		    for(int j=0;j<=i;j++)
		   {
		    	if(range>num)
		    	{
			f3=f1+f2;
			System.out.print(" "+f1);
			f1=f2;
			f2=f3;
			num++;
		    	}
			//i++;
		   }	
		    System.out.println( );
	    }
	}

	public static void main(String[] args) {
		
		FibPattern fb=new FibPattern();
		fb.getValue();
		fb.fib();


	}

}
