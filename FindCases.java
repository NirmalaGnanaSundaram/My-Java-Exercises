package com.redington.java.Basics;

import java.util.Scanner;

public class FindCases {
	
	char value;
	void getInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		value=sc.next().charAt(0);
		
		
	}
	void finding()  
	{
		if(value>='A' && value<='Z')
		{
			System.out.println("upper case");
		}
		else if(value >='a'&& value <='z')
		{
			System.out.println("lower case");
		}
		else if(value>='0' && value<='9')
		{
			System.out.println("numbers");
		}else
		{
			System.out.println("special charaters");
		}
	}

}
