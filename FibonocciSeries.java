package com.redington.java.Basics;

public class FibonocciSeries {

	public static void main(String[] args) {
		int f=0,s=1;
		
		System.out.print(f +" ");
		System.out.print(s+" ");
		int times=5;
		while(times>0)
		{
			int t=f+s;
			System.out.print(t +" ");
			f=s;
			s=t;
			times --;
		}
		//System.out.println("------------------------");
		
		
		int n=10;f=0;s=1;
		System.out.print(f +" ");
		System.out.print(s+" ");
		for(int i=1;i<=n;i++)
		{
			//swaping concept without temp.
			//System.out.print((f+s)+ " ");  //can give this or print s value
			s=s+f;
			f=s-f;
			System.out.print(s+" ");
			
		}
	}

}
