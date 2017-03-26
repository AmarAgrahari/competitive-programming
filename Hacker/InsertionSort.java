package com.info;

import java.util.Scanner;

public class InsertionSort {

	public void InsertionSortAlgorithm(int ar[])
	{
		int length=ar.length;
		for(int i=1;i<length;i++)
		{
			int value=ar[i];
			int hole=i;
			while(hole>0 && ar[hole-1]>value)
			{
				ar[hole]=ar[hole-1];
				hole=hole-1;
			}
			ar[hole]=value;
		}
		
	}
	public void printArray(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element in an array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
       InsertionSort s=new InsertionSort();
       s.InsertionSortAlgorithm(ar);
       s.printArray(ar);
	}

}
