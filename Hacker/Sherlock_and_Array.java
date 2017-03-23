package com.Hacker;

import java.util.Scanner;

public class Sherlock_and_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int query=sc.nextInt();
		for(int i=0;i<query;i++)
		{
			int t=0;
			int n=sc.nextInt();
			int a[]=new int[n];
			int right=0;
			int left=0;
			for(int ab=0;ab<n;ab++)
			{
				a[ab]=sc.nextInt();
				right+=a[ab];
			}
			for(int j=0;j<n;j++)
			{
			
			
			right-=a[j];
				if(right==left)
				{
					t++;
					System.out.println("YES");
					break;
				}
				left+=a[j];
				
			}
			if(t==0)
				System.out.println("NO");
		
	}
	}
}
