package com.redington.java.Basics;

import java.util.Scanner;

public class ArrayFactorial {
	
	int[] element =new int[5];
	int[] factorial=new int[5];
	Scanner sc=new Scanner(System.in);
	
	
	void getInput()
	{
		
		
		for(int i=0;i<5;i++)
        {
        	System.out.println("enter number for position:"+i);
    	    element[i]=sc.nextInt();
        }
		
	}
	void findFactorial()
    {
   	 int fact=1;
   
       for(int j=1;j<5;j++)
       {
    	   fact=fact*j;
       }
   	System.out.println(fact);
    
       
    }  
   

}
