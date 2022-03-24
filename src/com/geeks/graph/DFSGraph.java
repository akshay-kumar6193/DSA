package com.geeks.graph;

import java.util.ArrayList;

// connect / disconnect graph using DFS algo
public class DFSGraph {

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
		// for disconnected graph
		for (int i = 0; i < visited.length; i++) {
			if (visited[i] == false)
				printGraph(edges,i ,visited);

		}

	}
//	0--1--2--\
//	   |      4
//	   3-----/
	
	public static void printGraph(ArrayList<ArrayList<Integer>> edges,int source,boolean []visited) {
		System.out.println(source);
		visited[source]=true;

		for(int v:edges.get(source)) {
			if(visited[v]==false) {
				printGraph(edges,v,visited);
			}
		}
		
	}
	
}
