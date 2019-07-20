package com.redington.java.HomeExercises;

import java.util.Scanner;

public class Detaills {
	
	String name;
	int rollno;
	String areaOfInterest;
	
	void getinput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		name=sc.next();
		
		System.out.println("Enter your rollnumber");
		rollno=sc.nextInt();
		
		System.out.println("Enter your field of interest");
		areaOfInterest=sc.next();
	
	}
	
	void disp()
	{
		System.out.println("Hey,I'm 	" + name +" my roll number is" + rollno +".My area of interest is"+areaOfInterest);
	}

	public static void main(String[] args) {
		
		Detaills d=new Detaills();
		d.getinput();
		d.disp();
	}

}
