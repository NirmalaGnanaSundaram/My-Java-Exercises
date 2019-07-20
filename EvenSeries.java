package com.redington.java.HomeExercises;

import java.util.Scanner;

public class EvenSeries {
	int n;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value :");
		n=sc.nextInt();
	}
	void findEven()
	{
		System.out.println("The even series for given n value is ");
		for(int i=0;i<=n;i+=2)
		{
			System.out.print(i + " ");
		}
    }
	
}
	
