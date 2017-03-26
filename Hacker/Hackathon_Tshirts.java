
package com.info;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Hackathon_Tshirts {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int test_cases=sc.nextInt();
		for(int i=0;i<test_cases;i++)
		{
			int sum=0;
			int number_of_shirts=sc.nextInt();
		long ar[]=new long[number_of_shirts];
			for(int j=0;j<number_of_shirts;j++)
			{
				ar[j]=sc.nextLong();
				
			}
			
			int vendors=sc.nextInt();
			long vendors_arr[]=new long[2*vendors];
			int vendor_i=0;
			for(int k=0;k<vendors;k++)
			{
				long a=sc.nextLong();
				long b=sc.nextLong();
				vendors_arr[vendor_i]=a;
				vendors_arr[vendor_i+1]=b;
				vendor_i=vendor_i+2;
				}
			
			for(int l1=0;l1<number_of_shirts;l1++)
			{
				for(int k1=0;k1<vendors_arr.length;k1=k1+2)
				{
					if(ar[l1]!=-1 && ar[l1]>=vendors_arr[k1] && ar[l1]<=vendors_arr[k1+1])
					{
						sum++;
						ar[l1]=-1;
					}
				}
			}
			System.out.println(sum);
		}
	}
}