package com.redington.java.HomeExercises;

import java.util.Scanner;

public class OddSeries {
	
	int n;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value :");
		n=sc.nextInt();
	}
	void findOdd()
	{
		System.out.println("The odd series for given n value is ");
		for(int i=1;i<=n;i+=2)
		{
			System.out.print(i + " ");
		}
	}

}
