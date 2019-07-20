package com.redington.java.test;

import java.util.Scanner;

public class DigitCalc {
	int num,sum=0,sum1=0;
	int temp;
	void getInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("INPUT");
		num=sc.nextInt();
		temp=num;
	}
	void SumOfDigit()
	{
		while(num>0)
		{
			
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		if(sum>0 && sum<10)
		{
			if(temp%sum == 0)
			{
				System.out.println("YES");
			}else
			{
				System.out.println("NO");
			}
		
		}
		else
		{
			while(sum>0)
			{
				int rem1=sum%10;
				sum1=sum1+rem1;
				sum=sum/10;
			}    if(temp%sum1==0)
			      {
					System.out.println("YES");
			      }
				  else
				  {
				System.out.println("NO");
				  }
				
			}

		}

	

}
