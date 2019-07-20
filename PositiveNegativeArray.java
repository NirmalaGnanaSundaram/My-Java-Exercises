package com.redington.java.Basics;

import java.util.Scanner;

public class PositiveNegativeArray {
	
	int[] number=new int[5];
	Scanner sc=new Scanner(System.in);
	
	void getInput()
	{   
		for(int i=0;i<5;i++)
		{
		   System.out.println("enter the number for "+ i+"th position");
		   number[i]=sc.nextInt();
		}
	}
	void PositiveNegative()
	{
		 System.out.println("=======find positive or negative=======");
	  for(int j=0;j<5;j++)
	  {
		 
		  if(number[j]>0)
		  {
			  System.out.println(number[j]+" is positive");
		  }
		  
	  }
	   for(int k=0;k<5;k++)
		   {
		   if(number[k]<0)
		  {
			  System.out.println(number[k]+" is negative");  
		  }
	  }
		
		
		
	}
	

	public static void main(String[] args) {
		
		
		PositiveNegativeArray pn=new PositiveNegativeArray();
		pn.getInput();
		pn.PositiveNegative();

	}

}
