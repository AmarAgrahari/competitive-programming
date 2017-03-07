package com.Hacker;

import java.util.Scanner;

public class ACM_IPCM {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String topic[] = new String[n];
        for(int topic_i=0; topic_i < n; topic_i++){
            topic[topic_i] = in.next();
        }
        int max=Integer.MIN_VALUE;
        int sum=0;int number=0;
        for(int i=0;i<n;i++)
        {
        	for(int j=i+1;j<n;j++)
        	{
        		for(int k=0;k<m;k++)
        		{
        			if(topic[i].charAt(k)=='1' || topic[j].charAt(k)=='1')
        			{
        				sum++;
        			}
        		}
        		if(sum>max)
        		{
        			max=sum;
        			number=1;
        		}
        		else if(sum==max)
        			number++;
        			
        		sum=0;
        	}
        }
        System.out.println(max);
        System.out.println(number);
	}

}
