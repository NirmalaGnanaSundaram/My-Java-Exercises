package com.redington.java.Basics;

import java.util.Scanner;

public class ArrayFactorials_SirLogic_Test {
	
    

	public static void main(String[] args) {
		 
		 ArrayFactorials_SirLogic af=new ArrayFactorials_SirLogic();
		 int[] elements=new int[10];
		 
		 int n;
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter n value");
		 n=sc.nextInt();
		
		 
		 for(int j=0;j<n;j++)
		 {
			 System.out.println("enter elements");
			 elements[j]=sc.nextInt();
		 }
		 
		
		 int [] result=af.findFactorials(elements);
		 
		 for(int i=0;i<n;i++)
		 {
			 System.out.println(result[i]);
		 }
		 
		 
	}

}
