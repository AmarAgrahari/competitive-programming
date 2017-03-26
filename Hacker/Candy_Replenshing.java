package com.info;

import java.util.Scanner;

public class Candy_Replenshing {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int t = in.nextInt();
	        int[] c = new int[t];
	        int sum=0;int candyleft=n;
	        for(int c_i=0; c_i < t; c_i++){
	            c[c_i] = in.nextInt();
	            
	        }
	        
	        for(int i=0;i<t;i++)
	        {
	        	candyleft=candyleft-c[i];
	        	if(candyleft<5 && i!=t-1)
	        	{
	        		sum=sum+(n-candyleft);
	        		candyleft=n;
	        	}
	        	
	        }
	      System.out.println(sum);  
	}

}
