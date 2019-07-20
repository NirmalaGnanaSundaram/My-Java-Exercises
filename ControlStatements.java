package com.redington.java.Basics;

public class ControlStatements {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++)
			System.out.println(i);
		    //System.out.println(i);//if i give this through error i is not visible
		    
		    System.out.println("-------------");
		   int j;
		    for( j=1;j<=5;j++)
		    {
				System.out.println(j);
		    }
			    System.out.println(j);
			    
			    System.out.println("-------------");
			
			    for(int k=1;k<=5;k++)
			    {
					System.out.println(k);
			    }
				   // System.out.println(k);   //error k not visible
				    
				    System.out.println("-------------");
				    
				    for(int l=1;l<=5;l++)
				    {
						System.out.println(2);
				    }
					    
					    
					    System.out.println("-------------");
					    
					    for(int m=1;m<=10;m++)
					    {
					    	if(m%2 == 0)
							System.out.println(m);
					    }
						    
						    
						    System.out.println("-------------");
						
					    int n1=1;int n2=10;
					    for(;n2>1;n2--)
					    {
					    	System.out.println(n2/n1);
					    	n1++;
					    }
					
				System.out.println("-------------");
				
				
				for(int i=1;i<=10;i*=3)
				{
					System.out.println(i);
					i++;
				}   
				    
				    System.out.println("-------------");
				
	}

}
