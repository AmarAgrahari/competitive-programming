package com.info;

import java.util.Scanner;

public class reverseofinteger {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String s=String.valueOf(n);
	StringBuffer str=new StringBuffer(s);
	str.reverse();
	System.out.println(str);
	
	}

}
