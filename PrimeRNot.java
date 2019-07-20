package com.redington.java.Basics;

public class PrimeRNot {

	public static void main(String[] args) {
		System.out.println("***PRIME OR NOT***");
		  
		   int n=15;
		   
		   int i=2;
		   boolean ifentry=false;
		  // while(i<n)
		   //while(i<n/2)  TO reduce iteration if n/2 is 0 then till n is 
			   while( i< Math.sqrt(n) )  //for big num till iteration is high so we use math.sqrt(n)
		   {
			   if(n%i == 0)
			   {
				   System.out.println(n+" is not a prime");
				   ifentry=true;
				 break;  
			   }
			   i++;
			  }
		   if(ifentry == false)
		   {
		  System.out.println(n+" is prime");

		   }
		   
		   System.out.println("----------------------");

	}

}
