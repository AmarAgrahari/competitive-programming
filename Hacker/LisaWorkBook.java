package com.info;

import java.util.Scanner;

public class LisaWorkBook {
public static int page=0;
public static int count_special=0;
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	int ar[]=new int[n];
	for(int i=0;i<n;i++)
	{
		ar[i]=sc.nextInt();
	}
	int m=0;
    while(m<n)
    {
    	int number_of_question=ar[m];
    	int ques_no=0;
    	while(ques_no<number_of_question)
    	{
    		page++;
    		if(ques_no+k<=number_of_question)
    		{
    			if(page>ques_no && page<=ques_no+k)
    				count_special++;
    		
    	}
    		else
    		{
    			if(page>ques_no && page<=ques_no+k)
    				count_special++;
    		}
    		ques_no+=k;
    	}
    		
	m++;
	}
    System.out.println(count_special);
}
}
