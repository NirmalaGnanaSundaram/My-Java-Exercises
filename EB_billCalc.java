package com.redington.java.Basics;

import java.util.Scanner;

public class EB_billCalc {
	float unit;
	float amount;
	 void getinput()
	 {
		 System.out.println("*******EB BILL CALCULATION*******");
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter unit used by you ");
		 unit= sc.nextFloat();
		 
	 }
	 
	 void logics()
	 {
		 if(unit >=1 && unit<=100)
		 {
			amount=unit*5;
			System.out.println("amount for ur used unit"+unit+" is Rs."+amount);
		 }
		 if(unit >100 && unit<=200)
		 {
			amount=((unit-100)*7 )+ (100*5);
			System.out.println("amount for ur used unit"+unit+" is Rs."+amount);
		 }
		 if(unit >200 && unit<=300)
		 {
			amount=((unit-200)*10 )+(100*7)+(100*5);
			System.out.println("amount for ur used unit"+unit+" is Rs."+amount);
		 }if(unit>300)
		 {
				amount=((unit-300)*15 )+(100*10)+(100*7)+(100*5);
				System.out.println("amount for ur used unit"+unit+" is Rs."+amount);
			
		 }
		 

	 }
	

	public static void main(String[] args) {
		
		EB_billCalc eb=new EB_billCalc();
		eb.getinput();
		eb.logics();
		
	}

}
