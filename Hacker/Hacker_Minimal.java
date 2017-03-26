package com.info;

import java.lang.*;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Hacker_Minimal {
	public static double pi=3.1415926535897932384626433832795028841971693993751;
public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        long min = in.nextLong();
	        long max = in.nextLong();
	        double numerator=Double.MAX_VALUE;
	        double denominator=Double.MAX_VALUE;
	       double minimum=Double.MAX_VALUE;
	       /*System.out.println(minimum);*/
	        for(long i= min;i<=max;i++)
	        {
	        	
	        long n=i*3;
	        	while((n/(double)i)<pi)
	        	{
	        		n++;
	        	}
	        
	        	double diff1=Math.abs((n/(double)i)-pi);
	        	double diff2=Math.abs(((n-1)/(double)i)-pi);
	        	int result=Double.compare(diff1, diff2);
	        	if(result>=0)
	        	{
	        		if(Double.compare(diff2, minimum)<=0)
	        		{
	        			minimum=diff2;
	        			numerator=n-1;
	        			denominator=i;
	        		}
	        	}
	        	else
	        	{
	        		if(Double.compare(diff1, minimum)<=0)
	        		{
	        			minimum=diff1;
	        			numerator=n;
	        			denominator=i;
	        		}
	        	}
	        }
	        System.out.println((long)numerator+"/"+(long)denominator);
	    }
	}