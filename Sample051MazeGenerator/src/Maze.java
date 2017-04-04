import java.util.LinkedList;
import java.util.Stack;

public class Maze{
	
	//not working draft
	
	private static boolean[][] visited;
	private static Cell[][] from;

	private static class Cell{
		
		int i;
		int j;
		
		private Cell(int i, int j){
			this.i=i;
			this.j =j;
		}
		
		public String toString(){
			return "["+i+", "+j+"]";
		}
	}
	
	
	public static void main(String[] args){
		int[][] maze = {{1,1,1},
						{1,0,1},
						{1,1,0},
						{0,1,1}};
		
		for (int row = 0; row<maze.length; row++){
			for(int col=0; col<maze[0].length; col++){
				System.out.print(maze[row][col]+ " ");
			}
			System.out.println();
		}
		
		
		System.out.println(path(maze));
		
	}
	
	private static Iterable<Cell> path(int[][] maze){
		int n = maze.length;
		int m = maze[0].length; 
		
		visited = new boolean[n][m];
		from = new Cell[n][m];
		from[0][0] = new Cell(0,0);
		
		dfs(maze,0,0);
		LinkedList<Cell> path = new LinkedList<Cell>();
		for(Cell cell = from[n][m]; cell!=from[0][0]; cell = from[cell.i][cell.j]){
			path.push(cell);
		}
		path.push(from[0][0]);
				
		
		return path;
	}
	
	private static void dfs(int[][] maze, int i, int j){
		
		if(i<0||j<0||i>maze.length-1||j>maze[0].length-1) return;
		
		if(maze[i][j]==0) return;
		
		if(visited[i][j]) return;
		
		visited[i][j] = true;
		
		dfs(maze, i+1, j);
		dfs(maze, i-1,j);
		dfs(maze, i,j+1);
		dfs(maze, i, j-1);
		from[i+1][j] = new Cell(i,j);
		from[i-1][j] = new Cell(i,j);
		from[i][j+1] = new Cell(i,j);
		from[i][j-1] = new Cell(i,j);
		
	}
	
	
		
		
	
	
	
	
	
}