package com.geeks.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPath {
	public static void main(String[] args) {

		int vertices = 5;

		ArrayList<ArrayList<Integer>> edges = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < vertices; i++) {
			edges.add(new ArrayList<>());
		}
		CreateGraph.createEdges(0, 1, edges);

		CreateGraph.createEdges(1, 2, edges);
		CreateGraph.createEdges(1, 3, edges);
		CreateGraph.createEdges(3, 4, edges);
		CreateGraph.createEdges(2, 4, edges);

		boolean visited[] = new boolean[5];
		int hoops[] = new int[5];
		// for disconnected graph
		
				findPath(edges,0 ,visited,hoops);

		

	}
//	0--1--2--\
//	   |      4
//	   3-----/
	
	public static void findPath(ArrayList<ArrayList<Integer>> edges,int source,boolean[] visited,int[] hoops) {
		
		Queue<Integer> q=new LinkedList<>();
		q.add(source);
		visited[source]=true;
		hoops[source]=0;
		
		while(!q.isEmpty()) {
			
			int u= q.poll();
			for(int v:edges.get(u)) {
				
				if(visited[v]==false) {
					hoops[v]=hoops[u]+1;
					visited[v]=true;
					q.add(v);
				}
				
			}
			
		}
		Arrays.stream(hoops).forEach(System.out::println);
		
	}
	
}
