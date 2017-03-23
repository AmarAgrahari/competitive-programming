package com.Hacker;

import java.util.HashSet;
import java.util.Scanner;

class Name
{
	String name1;
	String name2;
	
	Name(String name1,String name2)
	{
		this.name1=name1;
		this.name2=name2;
	}
}

public class Java_HashSet {
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     HashSet<Name> set=new HashSet<>();
     int count=0;
     for(int i=0;i<n;i++)
     {
    	 String name1=sc.next();
    	 String name2=sc.next();
    	 Name nm=new Name(name1, name2);
    	 if(!(set.contains(nm.name1)&&(set.contains(nm.name2))))
    	 {
    		 set.add(nm);
    		 count++;
    		 System.out.println(count);
    	 }
     }
	}

}
