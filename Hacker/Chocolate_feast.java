package com.Hacker;

import java.util.Scanner;

public class Chocolate_feast {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for(int a0 = 0; a0 < t; a0++){
	            int dollars = in.nextInt();
	            int  cost_of_one= in.nextInt();
	            int wrapper= in.nextInt();
	            int total_chocolate=dollars/cost_of_one;
	            int count=total_chocolate;
               while(total_chocolate>=wrapper)
                   {
                   count=count+(total_chocolate/wrapper);
                   total_chocolate=(total_chocolate/wrapper)+(total_chocolate%wrapper);
               }
	            	System.out.println(count);
	        }
	    }
	}