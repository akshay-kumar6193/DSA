package com.geeks.graph;

import java.util.ArrayList;

public class DetectCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vertices = 4;

		ArrayList<ArrayList<Integer>> edges = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < vertices; i++) {
			edges.add(new ArrayList<>());
		}
		CreateGraph.createEdges(0, 1, edges);

		CreateGraph.createEdges(1, 2, edges);
		CreateGraph.createEdges(2, 3, edges);

		boolean visited[] = new boolean[4];
		// for disconnected graph
		
		System.out.println(detectCycle(edges,visited,0,-1));

	}

	public static boolean detectCycle(ArrayList<ArrayList<Integer>> edges,boolean[] visited,int source,int parent) {
		
		visited[source]=true;
		for(int v:edges.get(source)) {
			  if(visited[v]==false) {
			if (detectCycle(edges,visited,v,source)==true) return true;
			
			else if(v!=parent) return true;
			
		}
		}
		
		
		return false;
	}
	
	
}
