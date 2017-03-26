package com.info;

import java.util.Scanner;

public class Triangles {
	public static int n;

	public void multiply(int A[][], int B[][], int C[][])
	{
	    for (int i = 0; i < n; i++)
	    {
	        for (int j = 0; j < n; j++)
	        {
	            C[i][j] = 0;
	            for (int k = 0; k < n; k++)
	                C[i][j] += A[i][k]*B[k][j];
	        }
	    }
	}
	 
	//  Utility function to calculate trace of a matrix (sum of
	//  diagnonal elements)
	public int getTrace(int graph[][])
	{
	    int trace = 0;
	    for (int i = 0; i < n; i++)
	        trace += graph[i][i];
	    return trace;
	}
	 
	//  Utility function for calculating number of triangles in graph
	public int triangleInGraph(int graph[][])
	{
	    int aux2[][]=new int[n][n];  // To Store graph^2
	    int aux3[][]=new int[n][n]; // To Store graph^3
	 
	    //  Initialising aux matrices with 0
	    for (int i = 0; i < n; ++i)
	        for (int j = 0; j < n; ++j)
	            aux2[i][j] = aux3[i][j] = 0;
	 
	    // aux2 is graph^2 now  printMatrix(aux2);
	    multiply(graph, graph, aux2);
	 
	    // after this multiplication aux3 is
	    // graph^3 printMatrix(aux3);
	    multiply(graph, aux2, aux3);
	    for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(aux3[i][j]+" ");
			}
			System.out.println("");
		}
	 
	    int trace = getTrace(aux3);
	    return trace / 6;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
		int graph[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				graph[i][j]=sc.nextInt();
			}
		}
		Triangles t=new Triangles();
		int t1=t.triangleInGraph(graph);
		System.out.println(t1);
	}

}
