package com.info;

import java.util.Scanner;

public class Poles1 {

	public static void main(String[] args) {
		int sum=0;
		int sum1=0;
		int minimum=Integer.MAX_VALUE;
		int index=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int stack=sc.nextInt();
		int ar[]=new int[n];
		int weight[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
			weight[i]=sc.nextInt();
		}
		int k=0;int min=0;int sum2=0;int min1=0;
		if(stack==1)
		{
			for(int i=0;i<n;i++)
			{
				sum=sum+(ar[i]-ar[0])*weight[i];
			}
			System.out.println(sum);
		}
		while(stack-->1)
		{
			int m=0;
			for(int l=min1;l<n;l++)
			{
			for(int i=min;i<n;i++)
			{
				sum1=sum1+(ar[i]-ar[min])*weight[i];
			}
             
			
			for(int j=m;j<min;j++)
			{
				sum2=sum2+(ar[j]-ar[m])*weight[j];
			}
			
		    int t=sum1+sum2;
		    if(t<minimum)
		    {
		    	minimum=t;
		    	index=min;
		    }
			
			min++;
			
			sum1=0;
			sum2=0;
		}
			min=minimum;
			min1=minimum;
		}
		System.out.println(minimum);
		/*for(int j=0;j<n;j++)
		{
			sum=sum+(ar[j]-ar[0])*weight[j];
		}*/
	}

}
