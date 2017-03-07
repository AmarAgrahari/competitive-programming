package com.Hacker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListHacker {


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int t=sc.nextInt();
			
		/*	System.out.println(t);*/
			ArrayList<Integer> list1=new ArrayList<Integer>();
			for(int j=0;j<t;j++)
			{
				int number=sc.nextInt();
				/*System.out.println(number);*/
				list1.add(number);
				
			}
			
			list.add(list1);
			
		}
		
		int query=sc.nextInt();
		for(int k=0;k<=query;k++)
		{
			
				int a=sc.nextInt();
				int b=sc.nextInt();
				/*System.out.println(a);
				System.out.println(b);*/
				if(a<=list.size())
				{
					if(b<=list.get(a-1).size())
					{
						int output=list.get(a-1).get(b-1);
						/*System.out.println(output);*/
					}
					else
					{
						System.out.println("ERROR!");
					}
				}
				else
				{
					System.out.println("ERROR!");
				}
				}

	}

}
