package com.redington.java.HomeExercises;

import java.util.Scanner;

public class VotingAge {
	
	int age;
	
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age to check whether it's voting age r not  :");
		age=sc.nextInt();
		
	}
	
	void check()
	{
		if(age>=18 && age<=120)
		{
			System.out.println("you are elegible to vote");
		}else
		{
		System.out.println("you are not elegible to vote");
		}
	}
	

}
