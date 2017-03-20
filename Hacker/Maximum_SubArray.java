package com.Hacker;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_SubArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int ar[]=new int[n];
			for(int j=0;j<n;j++)
			{
				ar[j]=sc.nextInt();
			}
			Arrays.sort(ar);
	
			int sum=0;int count=0;int c=0;
			for(int k=n-1;k>=0;k--)
			{
				
				if(ar[k]>=0)
				{
					sum=sum+ar[k];
					count=count+ar[k];
				}
				else
				{
					count=count+ar[k];
					c++;
				}
				if(c==1)
					break;
			}
			System.out.println(count+" "+sum);
				
		}

	}

}
