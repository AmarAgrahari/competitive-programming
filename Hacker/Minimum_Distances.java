package com.Hacker;

import java.util.Scanner;

public class Minimum_Distances {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
        	for(int j=i+1;j<n;j++)
        	{
        		if(A[i]==A[j])
        		{
        			int diff=Math.abs(i-j);
        			if(diff<min)
        				min=diff;
        		}
        	}
        }
        if(min==Integer.MAX_VALUE)
        	System.out.println("-1");
        else
        System.out.println(min);
    }
}
