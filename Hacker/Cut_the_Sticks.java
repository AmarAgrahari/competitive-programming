package com.info;

import java.util.Arrays;
import java.util.Scanner;

public class Cut_the_Sticks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		
		/*System.out.println(n);*/
		for(int j=0;j<n;j++)
		{
			int sum=0;
			int m=arr[j];
			for(int k=j;k<n;k++)
			{
				
				if(arr[k]!=0 && m!=0)
				{
				
					
					
					arr[k]=arr[k]-m;
					
					sum++;
					
					
				}
			}
			if(sum!=0)
				System.out.println(sum);
		}
	}

}
