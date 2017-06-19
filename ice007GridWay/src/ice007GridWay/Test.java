package ice007GridWay;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

public class Test {
	
	public static void main(String[] args){
		
		boolean[][] grid = {{true, true, true, false},
							{false, true, true, true},
							{true, false, true, false},
							{false, true, true, true}};
							
		Iterable<Point> path = path(new Point(0,0), new Point(3,3), grid);
		for(Point p:path) System.out.println(p);
		
		System.out.println();
		Iterable<Point> path1 = search(grid);
		for(Point p:path1) System.out.print(p+", ");
		
		
		
		
		
	}
	
	public static Iterable<Point> search(boolean[][] grid){
		ArrayList<Point> path = new ArrayList<Point>();
		HashSet<Point> failed = new HashSet<Point>();
		search(path, failed,grid,grid.length-1,grid[0].length-1);
		return path;
		
	}
	
	
	public static Iterable<Point> path(Point start, Point end, boolean[][] grid){
		boolean[][] marked = new boolean[grid.length][grid[0].length];
		Point[][] from = new Point[grid.length][grid[0].length];
		DFS(start, grid, marked, from);
		Stack<Point> path = new Stack<Point>();
		
		Point current = end;
		
		while(current!=start){
		path.push(current);
		current = from[current.first][current.last];
		}
		
		path.push(start);
		
		return path;
			
	}
	
	
	private static void DFS(Point start, boolean[][] grid, boolean[][] marked, Point[][] from){
		
		marked[start.first][start.last] = true;
		
		for(Point p: adj(grid, start)){
			if (!marked[p.first][p.last]) {
				DFS(p, grid, marked, from);
				from[p.first][p.last] = start;
			}
		}
		
	}
	
	
	
	private static Iterable<Point> adj (boolean[][] grid, Point p){
		int row1 = p.first+1;
		int column1 = p.last;
		int row2 = p.first;
		int column2 = p.last+1;
		ArrayList<Point> adj = new ArrayList<Point>();
		if (row1>=0 && row1<grid.length && column1>=0 && column1<grid[0].length && grid[row1][column1])
			adj.add(new Point(row1, column1));
		if (row2>=0 && row2<grid.length && column2>=0 && column2<grid[0].length && grid[row2][column2])
			adj.add(new Point(row2, column2));
		return adj;
		
	}
	
	private static boolean origin(Point p){
		return p.first==0 && p.last==0;
	}
	
	
	
	private static boolean search(ArrayList<Point> path, HashSet<Point> failed, boolean[][] grid, int r, int c){
		
	if(r<0 || c<0 || grid[r][c]==false) return false;
	
	Point p = new Point(r,c);
	if(failed.contains(p)) return false;
	
	if (origin(p) || search(path,failed,grid,r-1,c) || search(path,failed,grid,r,c-1)){
		path.add(p);
		return true;
	}
	
	failed.add(p);
	return false;
	
	
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static class Point{
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + first;
			result = prime * result + last;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Point other = (Point) obj;
			if (first != other.first)
				return false;
			if (last != other.last)
				return false;
			return true;
		}

		int first;
		int last;
		
		public Point(int first, int last){
			this.first = first;
			this.last = last;
		}
		
		public String toString(){
			return "[" + first + ", " + last + "]";
		}
	}

}
