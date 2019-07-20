package com.redington.java.sivaSirPrograms;

public class ArrayBasics {

	public static void main(String[] args) {
		
		int[] a={1,2,3,4};
		int[] b=new int[a.length];
		
		b=a;
		a[0]=20;
		System.out.println(b[0]);
		
		
	}

}
