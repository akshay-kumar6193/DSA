package com.geeks.graph;

import java.util.ArrayList;
import java.util.Iterator;

public class CreateGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vertices=5;
		
		ArrayList<ArrayList<Integer>> edges=new ArrayList<ArrayList<Integer>>();
		
		
		for (int i = 0; i < vertices; i++) {
			edges.add(new ArrayList<>());
		}
		
		createEdges(1,2,edges);
		createEdges(2,3,edges);
		createEdges(1,3,edges);
		createEdges(3,4,edges);
		createEdges(2,4,edges);
		
		
		
	}
	
	public static void createEdges(int u,int v,ArrayList<ArrayList<Integer>> edges) {
		
		edges.get(u).add(v);
		edges.get(v).add(u);
		
		
	}


}
