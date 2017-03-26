package com.info;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Substring {
	public static List<Integer> list=new ArrayList<>();
	public void printSubstrings1(String text,int length) {
		
	    Set<String> set = new HashSet<String>();
	    for(int i=0; i < text.length() - length + 1; i++) {
	        String sub = text.substring(i,length+i);
	        if(sub.startsWith("0"))
	        	continue;
	        	else
	        set.add(sub);
	    }
	    Set<String> sorted = (Set)new TreeSet<String>(set);
	    String[] findsorted=sorted.toArray(new String[sorted.size()]);
	    int flag=0;
	    for(int i=0;i<findsorted.length;i++)
	    {
	    	int m=Integer.parseInt(findsorted[i]);
	    	list.add(m);
	    	
	    }
	    
	}
	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
	        int q = in.nextInt();
	        for(int a0 = 0; a0 < q; a0++){
	            String s = in.next();
	            // your code goes here
	        char[] arr=s.toCharArray();
	        int flag=0;
	        /*for(int j=1;j<arr.length;j++)
	        {
	        	if((arr[j]-arr[j-1])==1)
	        	{
	        		System.out.println("YES "+arr[0]);
	        		flag++;
	        	break;
	        	}
	        }*/
	        
	        if(flag==0)
	        {
		for(int i=1;i<=5;i++)
		{
		Substring s1=new Substring();
		s1.printSubstrings1(s,i);
		}
	        }
	        	}
	        for(Integer i:list)
	        {
	        	System.out.println(i);
	        }
	        }
	}



