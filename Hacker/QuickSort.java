package com.info;

import java.util.*;
public class QuickSort {
       
          static int partition(int[] ar,int start,int end) {
              int pIndex=end;
              int pivot=start;
              for(int i=end;i>=start;i--)
                  {
                  if(ar[i]>ar[pivot])
                      {
                      int temp=ar[i];
                      ar[i]=ar[pIndex];
                      ar[pIndex]=temp;
                      pIndex=pIndex-1;
                  }
                  
              }
             
              int temp1=ar[pivot];
              ar[pivot]=ar[pIndex];
              ar[pIndex]=temp1;
              printArray(ar, start, end);
              System.out.println("");
              return pIndex;
        
       }   
          
          static void quickSort(int ar[],int start,int end)
          {
        	  if(start<end)
        	  {
        		  int pIndex=partition(ar, start, end);
        		  System.out.println(pIndex);
        		  quickSort(ar, start, pIndex-1);
        		  
        		  /*printArray(ar, start, pIndex-1);*/
        		  /*System.out.println("");*/
        		  quickSort(ar, pIndex+1, end);
        		  
        		 /* printArray(ar, pIndex+1, end);*/
        		/*  System.out.println("");*/
        		
        	  }
        	 
          }
 
static void printArray(int[] ar,int start,int end) {
        for(int i=start;i<=end;i++)
        {
        	System.out.print(ar[i]+" ");
        }
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           quickSort(ar, 0, ar.length-1);
           printArray(ar, 0, ar.length-1);
       }    
   }
