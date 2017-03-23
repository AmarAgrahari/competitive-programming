package com.Hacker;

import java.util.Scanner;

public class MarsExploration {

	public static void main(String[] args) {
    
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int count=0;
		int length=s.length();
		int n=0;
		while(n<length)
		{
			String check=s.substring(n, n+3);
			if(!(check.charAt(0)=='S'))
			{
				count++;
			}
			if(!(check.charAt(1)=='O'))
			{
				count++;
			}
			if(!(check.charAt(2)=='S'))
			{
				count++;
			}
			n=n+3;
		}
		System.out.println(count);
	}

}
