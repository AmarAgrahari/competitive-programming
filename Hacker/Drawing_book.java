package com.info;

import java.util.Scanner;

public class Drawing_book {
public static int min=Integer.MAX_VALUE;
public static int  min1(int a,int b)
{
	return a<b?a:b;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=sc.nextInt();
		int start=1;
		int j=n;int end=0;
			int i=2;
		while(i>=1)
		{
			if(p==(i+1)||p==(i))
				break;
            start++;
			i=i+2;
		}
		j=n;
		while(j>=1)
		{
			if(j%2!=0)
			{
			 if(p==j|| p==j-1)
			 {
				
				 break; 
			 }
				
			
				end++;
			j=j-2;
			}
			else
			{
				if(p==j)
				
					break;
				end++;
				j=j-1;
			}
		}
		
		
		if(p==1 ||p==n)
		{
			System.out.println("0");
		}
		else
		{
     System.out.println(min1(start,end));
		}
	}

}
