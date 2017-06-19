package ice010bidirecionalBFS;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BiBFS {
	
	public HashMap<Integer, Integer> from1 = new HashMap<Integer, Integer>();
	public HashMap<Integer, Integer> from2 = new HashMap<Integer, Integer>();;
	private String log;
	
	public BiBFS(Graph G, int source, int destination){
		
		
		BFS(G, source, destination);
		
	}
	
	
	private void BFS(Graph G, int source, int destination){
		
		from1.put(source, null);
		from2.put(destination, null);
		
		Queue<Integer> queue1 = new LinkedList<Integer>();
		Queue<Integer> queue2 = new LinkedList<Integer>();
		
		queue1.add(source);
		queue2.add(destination);
		
		while(!queue1.isEmpty() && !queue2.isEmpty()){
			
			int v = queue1.poll();
			for(int other: G.adj(v)) if(!from1.containsKey(other)){
				from1.put(other, v);
			}
			
			int w = queue2.poll();
			for(int other: G.adj(w)) if(!from2.containsKey(other)){
				from2.put(other, w);
				if(from1.containsKey(other)) {
					log = other + ", " + from1.get(other) + " | " + from2.get(other);
					return;
				}
				
			}
			updateQueue(G,v,queue1,from1);
			updateQueue(G,w,queue2,from2);
							
		}
		
		
	}
	
		
	private void updateQueue(Graph G, int v, Queue<Integer> queue, HashMap<Integer, Integer> from){
		for(int p: G.adj(v)) 
			for (int p1: G.adj(p)) if(!from.containsKey(p1)) queue.add(p1);
			
	}
	
	public String getLog(){return log;}
	
}
