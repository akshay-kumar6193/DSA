package com.geeks.graph;

import java.util.ArrayList;

public class DirectedGraphDetectCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	}

	public boolean detectCycle(ArrayList<ArrayList<Integer>> edges, boolean[] visited, int source, boolean[] recStack) {

		visited[source] = true;
		recStack[source] = true;

		for (int v : edges.get(source)) {
			if (visited[v] == false && detectCycle(edges, visited, source, recStack)) 
				visited[v] = true;

			else if (recStack[v])
				return true;
		}

		recStack[source] = false;
		return false;

	}

}
