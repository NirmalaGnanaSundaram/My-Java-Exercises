package com.redington.java.test;

import java.util.Scanner;

public class Factors {
	int num;
	void getinput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number To Find Its Factor");
		num=sc.nextInt();
	}
	void findFactors()
	{
		for(int i=1;i<num;i++)
		{
			if(num%i ==0)
			{
				System.out.println(i);
			}
		}
	}
	

}
