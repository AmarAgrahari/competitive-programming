package com.Hacker;

import java.util.Arrays;
import java.util.Scanner;

public class Checkingnumbers {
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int count=0;int m1=0;
        Arrays.sort(a);
        for(int i=0;i<n-1;i++)
            {
        	if(Math.abs(a[i]-a[i+1])<=1)
        	{
        		
            for(int j=i+1;j<n;j++)
                {
                if(Math.abs(a[i]-a[j])<=1)
                   count++;
            }
        	}
            System.out.println(count);
            if(count>=m1)
                {
                m1=count;
            }
            count=0;
        }
        System.out.println(m1+1);
    }
}
