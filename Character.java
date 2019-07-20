package com.redington.java.Basics;

import java.util.Scanner;

public class Character {
	
	char ch;
	int n;
	
	void getInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter character");
		ch=sc.next().charAt(0);
		System.out.println("enter range");
		n=sc.next().charAt(0);
		
	}
	 void process()
	 { //int i=1;
		 while(ch<=n)
		 {
			 
				
			 System.out.println(ch);
			 ch++;
			 //i++;
		 }
	 }

	public static void main(String[] args) {
		
		Character c=new Character();
		c.getInput();
		c.process();
		
	}

}
