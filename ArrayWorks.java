package com.redington.java.Basics;

import java.util.Scanner;

public class ArrayWorks {
     int[] num=new int[5];
     int sum=0;
     int min=0,max=0;
     Scanner sc= new Scanner(System.in);
     
     void getInput()
     {
    	 for(int i=0;i<5;i++)
         {
         	System.out.println("enter number for position:"+i);
     	    num[i]=sc.nextInt();
         }
    	 
     }
     
     void print()
     {
    	 
      System.out.println("***the numbers in array***");
        for(int j=0;j<5;j++)
        {
        	System.out.println(num[j]);
        }
        
     }  
     void sum()
     {
     
        for(int k=0;k<5;k++)
        {
        	sum=sum+num[k];
        	
        }
        System.out.println("sum of numbers in array is: "+sum);
        
     }  
     
     void finding()
     {
        int number,check=0,count=0;
        System.out.println("enter num to find");
        number=sc.nextInt();
       int l;
       
      
        for( l=0;l<5;l++)
        {
        	
			if(number==num[l])
        	{
				check=1;
				count++;
				System.out.println(number +"is in position "+ l);
			}
        
			
           
        }
        System.out.println(number + " is found " + count+ " times" );

       if(check ==0)
        	{
        		System.out.println(number+"not in array");
        	}
			
        	      }
     void findMax()
     { 
    	 for(int m=0;m<5;m++)
    	 {
    	    if(max<num[m])
    	 {
    		 max=num[m];
    		 
        	 
    		 }
    	 
    	 }
    	 System.out.println("the greater num in array is "+ max);
    	 
     }
     void findMin()
     {
    	 for(int m=0;m<5;m++)
    	 { min=max;
    		if(min>num[m]) 
    		{
    			min=num[m];
    		}
    	 }
    	 System.out.println("the smallest num in array is "+ min);

     }
     
     
        
 }
     
	
	

