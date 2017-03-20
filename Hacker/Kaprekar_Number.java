package com.Hacker;

import java.util.Arrays;
import java.util.Scanner;

public class Kaprekar_Number {
	
public static int count=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long a=sc.nextInt();
		long b=sc.nextInt();
		
		for(long i=a;i<=b;i++)
		{
			String s=String.valueOf(i);
			int l=s.length();
		
			long square=i*i;
		
			String s1=String.valueOf(square);
			int length=s1.length();
			if(length>1)
			{
		  String sub1=s1.substring(0,length/2);
		  String sub2=s1.substring(length/2);
		  if((Long.parseLong(sub1)+Long.parseLong(sub2))==i)
		  {
			  System.out.print(i+" ");
			  count++;
		  }
		  
			}
			else
			{
				if(i==1)
				{
					System.out.print("1 ");
                    count++;							
				}
			}
		}
		if(count==0)
			System.out.println("INVALID RANGE");
		}

	}


