package com.redington.java.sivaSirPrograms;

import java.util.Scanner;

public class CharacterSort {


	char[] sort= new char[10];
	char[] character= new char[10];
	char temp;
	
	public void get()
	{
		get();
	}
	public void getInput()
	{
		System.out.println("enter characters to sort");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<sort.length;i++)
		{
			sort[i]=sc.next().charAt(0);
			//character[i]=sort[i];
		}
		
	}
	public void sorting()
	{ System.out.println("ascending sort of charaters");
		for(int i=0;i<sort.length;i++)
		{
			for(int j=i+1;j<sort.length;j++)
			{
				if(sort[i]>sort[j])
				{
					temp=sort[i];
					sort[i]=sort[j];
					sort[j]=temp;
				}
				
			}System.out.print(sort[i]+ " ");
			
		}
	}
	
	public static void main(String[] args) {
		
		CharacterSort cs= new CharacterSort();
		//cs.get(); stack overflow
		cs.getInput();
		cs.sorting();
		
	}

}
