package com.redington.java.Basics;

public class ArrayFactorials_SirLogic {
	
	 int[] factorial=new int[10];
	 
	public int[] findFactorials(int [] ele )
	{
		
		for(int k=0;k<10;k++)
		{
			int fact=1;
			
			
			for(int j=1;j<=ele[k];j++)
			{
				fact=fact*j;
			}
			factorial[k]=fact;
		}
		return factorial;
	}

}
