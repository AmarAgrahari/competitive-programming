package com.info;

import java.util.Scanner;

public class ServiceLane {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int t = in.nextInt();
	        int width[] = new int[n];
	        for(int width_i=0; width_i < n; width_i++){
	            width[width_i] = in.nextInt();
	        }
	        for(int a0 = 0; a0 < t; a0++){
	            int i = in.nextInt();
	            int j = in.nextInt();
	            int min=Integer.MAX_VALUE;
	            for(int l=i;l<=j;l++)
	            {
	            	if(min>width[l])
	            		min=width[l];
	            }
	            if(min==1)
	            	System.out.println("1");
	            if(min==2)
	            	System.out.println("2");
	            if(min==3)
	            	System.out.println("3");
	        }
	    }
	}
