package com.info;

import java.util.Scanner;

public class Range_Modular_queries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int j=0;j<q;j++)
		{
			int left=sc.nextInt();
			int right=sc.nextInt();
			int modulus=sc.nextInt();
			int result=sc.nextInt();
			for(int k=left;k<=right;k++)
			{
				if(arr[k]%modulus==result)
					sum++;
				}
			System.out.println(sum);
			sum=0;
		}
		
	}

}
