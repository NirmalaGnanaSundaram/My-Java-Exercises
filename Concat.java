package com.redington.java.HomeExercises;

import java.util.Scanner;

public class Concat {
	 String s1;
	 String s2;
	 
	 void getinput()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter string 1: ");
		    s1=sc.next();
		    
			System.out.println("enter string 2: ");
			s2=sc.next();
		}
	 
	 void disp()
	 {
		 System.out.println(s1 +" "+s2);
	 }

	public static void main(String[] args) {
		
		Concat c=new Concat();
		c.getinput();
		c.disp();
		
		
	}

}
