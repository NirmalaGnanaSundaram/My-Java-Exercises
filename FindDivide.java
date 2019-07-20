package com.redington.java.Basics;

import java.util.Scanner;

public class FindDivide {
     int n;
     
     void getinput()
     {
    	 System.out.println("TO FIND NUMBER DIVISIBLE BY 5 & 11 OR NOT");
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("ENTER THE NUMBER");
    	 n=sc.nextInt();
     }
     
     void divide()
     {
    	 if(n%5==0 && n%11==0)
    	 {
    		 System.out.println(n +" is divisible by 5&11");
    	 }else
    	 {
    		 System.out.println(n +" is not divisible by 5&11");
    	 }
    	 
     }
	public static void main(String[] args) {
	
		FindDivide fd=new FindDivide();
		fd.getinput();
		fd.divide();
		
		
	}
	

}
