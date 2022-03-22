package com.geeks.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//For connected / disconnected graph

//Time Complexity:O(V+E)->disconnected graph to run for each edges vertices for disconnected graph verices

public class bfsGraph {

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
				printGraph(i, edges, visited);

		}

	}

	public static void printGraph(int source, ArrayList<ArrayList<Integer>> edges, boolean[] visited) {

		Queue<Integer> q = new LinkedList<>();

		q.add(source);
		visited[source] = true;
		while (!q.isEmpty()) {
			int u = q.poll();
			System.out.print(u + " ");
			for (int v : edges.get(u)) {
				if (visited[v] == false) {
					visited[v] = true;
					q.add(v);

				}
			}

		}

	}

}
