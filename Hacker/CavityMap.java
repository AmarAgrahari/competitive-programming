package com.Hacker;

import java.util.Scanner;

public class CavityMap {
	  public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	       int final1[][]=new int[n][n];
	        String[] grid = new String[n];
	        for(int grid_i=0; grid_i < n; grid_i++){
	            grid[grid_i] = in.next();
	       
	        for(int i=0;i<grid[grid_i].length();i++)
	        {
	        	final1[grid_i][i]=Character.getNumericValue(grid[grid_i].charAt(i));

	        }
	        
	        }
	        for(int k=0;k<n;k++)
	        {
	        	for(int l=0;l<n;l++)
	        	{
	        		if(k==n-1||k==0||l==n-1||l==0 )
	        			System.out.print(final1[k][l]);
	        		else if(final1[k][l]>final1[k+1][l] && final1[k][l]>final1[k-1][l] && 
	        				final1[k][l]>final1[k][l+1] &&final1[k][l]>final1[k][l-1] )
	        			System.out.print("X");
	        		else
	        			System.out.print(final1[k][l]);
	        	}
	        	System.out.println("");
	        }
	        
	        
	        
	        
	        
	        
	    }
	}
