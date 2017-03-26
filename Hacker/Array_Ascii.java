package com.info;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Ascii {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int r = in.nextInt();
	        int c = in.nextInt();
           char ar[][]=new char[3*r][5*c];
           for(int k1=0;k1<3*r;k1++)
           {
        	   for(int l1=0;l1<5*c;l1++)
        	   {
        		  ar[k1][l1]='.';
        	   }
           }
          
           int i=1;int j=2;
          while(i<(3*r))
          {
        	  while(((j-2)<(5*c))||(j<(5*c)))
        	  {
        		  ar[i][j]='o';
        		  ar[i][j-2]='O';
        		  ar[i][j+2]='O';
        		  ar[i-1][j]='O';
        		  ar[i+1][j]='O';
        		  j=j+5;
        	  }
        	  i=i+3;
        	  j=2;
          }
           for(int k=0;k<3*r;k++)
           {
        	   for(int l=0;l<5*c;l++)
        	   {
        		   System.out.print(ar[k][l]);
        	   }
        	   System.out.println("");
           }
	}

}
