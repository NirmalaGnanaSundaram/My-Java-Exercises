package com.redington.java.Basics;

public class Looping {
 //while loop--->until 5000 (n)times
	 
	public static void main(String[] args) {
		int box=1;                    //initial value check only once
		while(box<=5)                 //condi check for n times before entering into the loop
		{
			System.out.println(box);
			box++;                        //if not given loop works indefinitly.inc/dec not compulsory
			                              //for n times after executing the loop
		}
		System.out.println("--------------");
		int box1=5;
		while(box1>=1)
		{
			System.out.println(box1);
			box1--;
			
		}
		
		
	}

}
