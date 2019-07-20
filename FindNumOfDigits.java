package com.redington.java.Basics;

import java.util.Scanner;

public class FindNumOfDigits {
 int n;
     
     void getinput()
     {
    	 System.out.println("TO FIND NUMBER OF DIGITS");
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("ENTER THE NUMBER");
    	 n=sc.nextInt();
     }
     void findDigit()
     {
    	 if(n>=0 && n<10)
    	 {
    		 System.out.println(n +" is one digit number");
    	 }
    	 else if(n==10 && n<100)
    	 {
    		 System.out.println(n +" is two digit number");
    	 }
    	 else if(n==100 && n<1000)
    	 {
    		 System.out.println(n +" is three digit number");
    	 }
    	 else if(n==1000 && n<10000)
    	 {
    		 System.out.println(n +" is four digit number");
    	 }
     }
     
     void findUsingLoop()
     {
    	 int count=0;
    	 int sum=0;
    	 while(n>0)
    	 { 
    		 n=n/10;
    		 //n=n%10;
    		 //System.out.println();
    		// sum=sum+n;
    		 count=count+1;
    		// n=n/10;
    		 
    		 
    	 }
    	// System.out.println(sum);
    	 System.out.println("no of digits for a given number is"+count);
     }
    
	public static void main(String[] args) {
		FindNumOfDigits fn=new FindNumOfDigits();
		fn.getinput();
		//fn.findDigit();
		fn.findUsingLoop();
		 
	}

}
