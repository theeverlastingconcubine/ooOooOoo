package ice010bidirecionalBFS;

import java.util.ArrayList;

public class Graph {
	
	private int V;
	private ArrayList<Integer>[] adj;
	
	public Graph(int V){
		this.V = V;
		adj = (ArrayList<Integer>[]) new ArrayList[V];
		for(int i = 0; i<V; i++){
			adj[i] = new ArrayList<Integer>();
		}
		
	}
	
	
	public void add(int p, int q){
		adj[p].add(q);
		adj[q].add(p);
	}
	
	public int V(){
		return V;
		}
	
	public ArrayList<Integer> adj(int p){
		return adj[p];
	}
	
	public String toString(){
		String s = V + " " + "\n";
		
		for(int i = 0; i < V; i++){
			s = s + i + " :" + "[ ";
			for(int v:adj(i)) s = s + v + " ";
			s = s + "]" + "\n";
		}
		
		return s;
		
	}

}
