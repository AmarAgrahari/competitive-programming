package com.info;

import java.util.Arrays;
import java.util.Scanner;

public class Poles {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int number_of_poles=sc.nextInt();
    int number_of_stacks=sc.nextInt();
    int arr[]=new int[number_of_poles];
    int weight[]=new int[number_of_poles];
    int weight1[]=new int[number_of_poles];
    for(int i=0;i<number_of_poles;i++)
    {
    	arr[i]=sc.nextInt();
    	weight[i]=sc.nextInt();
    	weight1[i]=weight[i];
    }
    Arrays.sort(weight1);
    	int sum=0;
    	/*if(number_of_stacks==1)
    	{
    	for(int i=0;i<number_of_poles;i++)
    		sum=sum+(arr[i]-arr[0])*weight[i];
    	System.out.println(sum);
    	}
    	else
    	{*/
    		int sum1=0;
    		int m=number_of_poles-1;
    		int min=0;
    		int k=0;
    	while((number_of_stacks--)>1)
    	{
    		for(int i=0;i<number_of_poles;i++)
    		{
    			if(weight[i]==weight1[m])
    			{
    				min=i;
    			}
    		}
 
    	for(int j=k;j<min;j++)
    	{
    		sum1=sum1+(arr[j]-arr[k])*weight[j];
    	}
    	k=min;
    	min=0;
    	m--;
    		
    	}
    	for(int l=k;l<number_of_poles;l++)
    	{
    		sum1=sum1+(arr[l]-arr[k])*weight[l];
    	}
    		System.out.println(sum1);
    	}
    
	}

/*}*/
