package com.Hacker;

import java.util.Arrays;
import java.util.Scanner;

public class GameofThrone {
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int ar[]=new int[26];
		Arrays.fill(ar, 0);
		for(int i=0;i<s.length();i++)
		{
			ar[s.charAt(i)-97]++;
		}
		int count=0;
		for(int j=0;j<26;j++)
		{
			if(ar[j]%2!=0)
				count++;
		}
		System.out.println(count>1?"NO":"YES");
	}

}
