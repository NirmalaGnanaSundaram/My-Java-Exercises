package com.redington.java.Basics;

import java.util.Scanner;

public class SalaryCalc {
	 double basicsal;
	 double gross;
	 
	 void getinput()
	 {
		 System.out.println("*******GROSS PAY CALCULATION*******");
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter basis salary in Rs. ");
		 basicsal=sc.nextDouble();
	 }
	 
	 void logicCalc()
	 {
		 if(basicsal<=10000)
		 {
			 double hra=(basicsal*20)/100;
			 System.out.println("HRA for u is Rs. "+hra);
			 double da=(basicsal*80)/100;
			 System.out.println("DA for u is Rs. "+da);
				gross=basicsal+hra+da;
				System.out.println("GROSS PAY for u is Rs. "+gross);
				
			}
		  if(basicsal>10000 && basicsal<=20000)
		 {
			 double hra=(basicsal*25)/100;
			 System.out.println("HRA for u is Rs. "+hra);
			 double da=(basicsal*90)/100;
			 System.out.println("DA for u is Rs. "+da);
				gross=basicsal+hra+da;
				System.out.println("GROSS PAY for u is Rs. "+gross);
				
			}
		  if(basicsal>20000)
			 {
				 double hra=(basicsal*30)/100;
				 System.out.println("HRA for u is Rs. "+hra);
				 double da=(basicsal*90)/100;
				 System.out.println("DA for u is Rs. "+da);
					gross=basicsal+hra+da;
					System.out.println("GROSS PAY for u is Rs. "+gross);
					
				}
			
	 }

	public static void main(String[] args) {
		
		SalaryCalc sc=new SalaryCalc();
		sc.getinput();
		sc.logicCalc();

	}

}
