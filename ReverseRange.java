package com.redington.java.HomeExercises;

import java.util.Scanner;

public class ReverseRange {
	
	int start,end;
	 
	void getinput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range to Start with");
		start=sc.nextInt();
		
		System.out.println("Enter the range to end by");
		end=sc.nextInt();
	
	}
	
	void process()
	{
		for(int i=end;i>=start;i--)
		{
			System.out.print(i +" "); 
		}
	}


	public static void main(String[] args) {
		
		ReverseRange rr=new ReverseRange();
		rr.getinput();
		rr.process();

	}

}
