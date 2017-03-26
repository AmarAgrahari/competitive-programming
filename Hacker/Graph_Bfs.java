package com.info;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Graph_Bfs {
public static int V;
LinkedList<Integer> adj[];

public Graph_Bfs(int v) {
	V=v;
	adj=new LinkedList[v];
for(int i=0;i<V;i++)
{
	adj[i]=new LinkedList<>();
}
}
public void addEdge(int i, int j) {
	
	adj[i].add(j);
}
public void bfs(int s)
{
	boolean visited[]=new boolean[V];
	Arrays.fill(visited, false);
	
	Deque<Integer> queue=new ArrayDeque<>(); 
	queue.add(s);
	visited[s]=true;
	
	while(queue.size()!=0)
	{
		s=queue.poll();
		System.out.print(s+" ");
		
       Iterator<Integer> itr=adj[s].listIterator();
       while(itr.hasNext())
       {
    	   int n=itr.next();
    	   if(!visited[n])
    	   {
    		   queue.add(n);
    		   visited[n]=true;
    	   }
       }
	}
}
	public static void main(String[] args) {
		
		Graph_Bfs g=new Graph_Bfs(4);
		 g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.addEdge(1, 2);
	        g.addEdge(2, 0);
	        g.addEdge(2, 3);
	        g.addEdge(3, 3);
	        
	        System.out.println("BFS is:");
	        g.bfs(2);
	}
	

}
