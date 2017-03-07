package com.Hacker;

/*
 * Good Question
*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Icecream {

	public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int testCases=sc.nextInt();
  for(int i=0;i<testCases;i++)
  {
	  int cost=sc.nextInt();
	  int n=sc.nextInt();
	 int price[]=new int[n];
	  for(int j=0;j<n;j++)
	  {
       price[j]=sc.nextInt();
	  }
	  Map<Integer, Integer> map=new HashMap<>();
    map.put(price[0], 1);
     for(int k=1;k<n;k++)
     {
    	 Integer ab=map.get(cost-price[k]);
    	 if(ab==null)
    		 map.put(price[k], k+1);
    	 else
    	 {
    		 System.out.println(ab+" "+(k+1));
    	 break;
    	 }
     }
  
  }
	}

}
