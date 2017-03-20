package com.Hacker;

import java.util.Scanner;

public class Time_In_Words {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int h = in.nextInt();
	        int m = in.nextInt();
	        String time[]=new String[]{"zero","one","two","three","four","five","six","seven","eight",
	        		"nine","ten","eleven","twelve","thirteen","forteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty",
	        		"twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine"};
	        if(m==0)
	        	System.out.println(time[h]+" o' clock");
	        else if(m==15)
	        	System.out.println("quarter past "+time[h]);
	        	
	        else if(m<30)
	        	System.out.println(time[m]+" minutes past "+time[h]);
	        else if(m==30)
	        	System.out.println("half past "+time[h]);
	        else if(m==45)
	        	System.out.println("quarter to "+time[h+1]);
	        else
	        	System.out.println(time[60-m]+" minutes to "+time[h+1]);
	        	
	        	
	}

}
