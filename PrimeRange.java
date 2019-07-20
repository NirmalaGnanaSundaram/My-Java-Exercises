package com.redington.java.Basics;

import java.util.Scanner;

public class PrimeRange {

	int n, m;

	public void getInput() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the starting number");
		m = sc.nextInt();

		System.out.println("Enter the end number");
		n = sc.nextInt();

	}

	public void finding() {
			for (int i = m; i <= n; i++) {
					
				int check=0;

			for (int j = 2; j < i; j++) {
				
				if (i% j == 0) 
				{
					check=1;
					break;      						
				}
			}
					
					if(check==0)
					{
						System.out.println(i+" is a prime number");
					}
					/*else
					{
						System.out.println(i+" is not a prime number");
					}*/
				
			}
		}
					

	public static void main(String[] args) {

		PrimeRange pr = new PrimeRange();
		pr.getInput();
		pr.finding();

	}

}
