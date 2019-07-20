package OwnProgram;

import java.util.Scanner;

public class Students {
String name;
int n;
int m1,m2,m3,m4,m5;
int sum;
float average;
 
void studentList()
{
	System.out.println("enter no of students ");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
    System.out.println("*****students list*****");
    //System.out.println("enter student name");
   for(int i=1;i<=n;i++)
    {
	System.out.println("enter student name");
	name=sc.next();
	System.out.println(i+"."+name);
	System.out.println("enter marks of student "+name); 
	m1=sc.nextInt();
	m2=sc.nextInt();
	m3=sc.nextInt();
	m4=sc.nextInt();
	m5=sc.nextInt();
	
	   sum = m1+m2+m3+m4+m5;
	   System.out.println("Total mark of "+name+" is "+sum);
	   average = sum/5;
	   System.out.println("The average is:"+average);
	   System.out.println("--------------------------");
	   
	   if((m1>80&&m1<=100) && (m2>80 && m2<=100) && (m3>80 && m2<=100) && (m4>80 && m4<=100) && (m5>80 && m5<=100))
	   {
		   System.out.println(name +"is TOPPER");
	   }
	     else if((m1<80 && m1 >50) && (m2<80 && m2 >50) && (m3<80 && m3 >50) && (m4<80 && m4 >50) && (m5<80 && m5 >50))
	       {
             System.out.println(name +"is an AVERAGE STUDENT");
	       }
       else if(( m1>=35&&m1<=50) && ( m2>=35&&m2<=50) && ( m3>=35&&m3<=50) && ( m4>=35&&m4<=50) && ( m5>=35&&m5<=50) )
		      {
			   System.out.println(name + " is a SLOW LEARNER");
		      }
	            else if(m1<35 && m2<35 && m3<35 && m4<35 && m5<35)
		        {
			   System.out.println(name +"is FAIL");
		        }else
		        {
		        System.out.println("IN BETWEEN SLOW & AVERAGE");	
		        }
		        	
	    }
   }

}