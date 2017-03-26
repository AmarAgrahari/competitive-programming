package com.info;

import java.util.Scanner;

public class LongestCommonSubsequence {

	public int LCS(char[] a, char[] b, int l1, int l2) {
		int L[][]=new int[l1+1][l2+1];
		int result=0;
		for(int i=0;i<=l1;i++)
		{
			for(int j=0;j<=l2;j++)
			{
				if(i==0||j==0)
					L[i][j]=0;
				else if(a[i-1]==b[j-1])
				{
					L[i][j]=1+L[i-1][j-1];
					result=max(result,L[i][j]);
				}
				else
				{
					L[i][j]=0;
				}
			}
		}
		return result;
		
	}
	public int max(int a,int b)
	{
		return (a>b)?a:b;
	}
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int q=sc.nextInt();
	   String[] ar=new String[n];
	   for(int i=0;i<n;i++)
	   {
		   ar[i]=sc.next();
		   
	   }
	   for(int j=0;j<q;j++)
	   {
		   int a=sc.nextInt();
		   int b=sc.nextInt();
		   char a1[]=ar[a].toCharArray();
		   char b1[]=ar[b].toCharArray();
		   
		LongestCommonSubsequence lts=new LongestCommonSubsequence();
		int count=lts.LCS(a1,b1,a1.length,b1.length);
		System.out.println(count);
	   }
	}

	

}