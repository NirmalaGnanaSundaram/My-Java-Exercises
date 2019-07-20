package com.redington.java.Basics;

import java.util.Scanner;

public class FibNumPatterns

{  
	int n,f=0,s=1;
	void getValue()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter range");
		n=sc.nextInt();
	}
	
	void findFib()
	{
		//System.out.println(f +" ");
		//System.out.print(s+" ");
		for(int a=1;a<=n;a++)
		{
				
			
			for(int b=1;b<=a;b++)
			{ 
				
				f=s+f;
	        	s=f-s;
	        	System.out.print(s+" ");
	        	
		
	         }
			//a++;
			System.out.println( );
		}

  }
	public static void main(String[] args)
	{
		FibNumPatterns fn=new FibNumPatterns();
		fn.getValue();
		fn.findFib();

	}

}

