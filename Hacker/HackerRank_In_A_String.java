package com.Hacker;

import java.util.Scanner;

public class HackerRank_In_A_String {

	
	public int max(int a,int b)
	{
		return a>b?a:b;
	}
	public int LCS(String s1,String s2)
	{
		int l1=s1.length();
		int l2=s2.length();
		int l[][]=new int[l1+1][l2+1];
		for(int i=0;i<=l1;i++)
		{
			for(int j=0;j<=l2;j++)
			{
				if(i==0||j==0)
					l[i][j]=0;
				else if(s1.charAt(i-1)==(s2.charAt(j-1)))
					l[i][j]=1+l[i-1][j-1];
				else
					l[i][j]=max(l[i-1][j],l[i][j-1]);
			}
		}
		return l[l1][l2];
	}
	
	public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  String s1="hackerrank";
  String s2=sc.next();
  HackerRank_In_A_String hs=new HackerRank_In_A_String();
  int t=hs.LCS(s1,s2);
 if(t==s1.length())
	 System.out.println("YES");
 else
	 System.out.println("NO");
	}

}
