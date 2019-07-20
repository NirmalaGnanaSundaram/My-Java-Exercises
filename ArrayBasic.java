package com.redington.java.Basics;

import java.util.Scanner;

public class ArrayBasic {
	
	int n;
	public int[] initialize()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n value for array memory allocation ");
     n=sc.nextInt();
     int[] marks=new int[n];
     return marks;
	}

	
	
	public void input()
	{
		int[] demo = initialize();
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter marks");
	   
		for( int i=0;i<n;i++)
		{
			demo[i] =sc.nextInt();
			//System.out.println( demo[i]);
			System.out.println( i +"th place "+demo[i]);
		}
		
	}
	
/*public void output()
{
	int[] result=new int[i];
for(int i=0;i<n;i++)//if i give i<=10 in output it through error if we give 11th input,but here it terminate properly
{
	System.out.println( i +" place "+demo[i]);
}
}*/
	public static void main(String[] args) {
		
		ArrayBasic ab= new ArrayBasic();
		//ab.initialize();
		ab.input();
		//ab.output();
		
	}

}
