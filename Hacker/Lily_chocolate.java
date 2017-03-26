package com.info;

import java.util.Scanner;

public class Lily_chocolate {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int ar[]=new int[n];
	for(int i=0;i<n;i++)
	{
		ar[i]=sc.nextInt();
	}
	int m=sc.nextInt();
	int d=sc.nextInt();
	int total=0;
	for(int j=0;j<n-d+1;j++)
	{
		int sum=0;
		for(int k=0;k<d;k++)
		{
			sum=sum+ar[j+k];
		}
		if(sum==m)
			total++;
	}
System.out.println(total);
	}

}
