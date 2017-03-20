package com.Hacker;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pairs {

	 static int pairs(int[] a,int k) {
		 int counter =0;
		// Sort first ,  whatever the sorting algorithm used 
		Arrays.sort(a);   
		//check the differences
		for(int i =a.length-1  ; i>=0; i--){
		    for(int j =i-1;j>=0 && a[i]- a[j] <= k ; j--){
		        if (a[i]-a[j] == k){
		            counter++;
		        }   
		    }
		}
		return counter;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int res;
	        
	        String n = in.nextLine();
	        String[] n_split = n.split(" ");
	        
	        int _a_size = Integer.parseInt(n_split[0]);
	        int _k = Integer.parseInt(n_split[1]);
	        
	        int[] _a = new int[_a_size];
	        int _a_item;
	        String next = in.nextLine();
	        String[] next_split = next.split(" ");
	        
	        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
	            _a_item = Integer.parseInt(next_split[_a_i]);
	            _a[_a_i] = _a_item;
	        }
	        
	        res = pairs(_a,_k);
	        System.out.println(res);
	    }
	}
