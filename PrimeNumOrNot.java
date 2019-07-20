package com.redington.java.Basics;

import java.util.Scanner;

public class PrimeNumOrNot {

	int n;
	public void getInput()
	{
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the number");
		n=sc.nextInt();	
	}
	
	public void finding()
	{
		int check=0;
		
		for(int i=2;i<n;i++)
		{
			if(n%i == 0)
			{
				check=1;
				//System.out.println(n +" ,"+i+","+check);
				break;//if not give break loop will conti. 
				      //even once it satisfy the condi. ,its not prime,we dont need for further checking 
				      //so we r using break to stop & reduce iteration
			}
		}
		
		if(check==0)
		{
			System.out.println(n+" is a prime number");
		}
		else
		{
			System.out.println(n+" is not a prime number");
		}
	}
	public static void main(String[] args) {
		
		PrimeNumOrNot pn=new PrimeNumOrNot();
		pn.getInput();
		pn.finding();
		
	}

}
