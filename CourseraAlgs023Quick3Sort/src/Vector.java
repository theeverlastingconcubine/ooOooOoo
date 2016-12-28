import java.util.Comparator;

public class Vector{
	
	public static final Comparator<Vector> BY_X_COORDINATE = new ByXCoordinate();
	public static final Comparator<Vector> BY_LENGTH = new ByLength();
	
	private int x;
	private int y;
	
	
	public Vector(int x, int y){
		this.x = x;
		this.y = y;
	}
	
		
	public double xcoord(){
		return x;
	}
	
	public double ycoord(){
		return y;
	}
	
	private static class ByXCoordinate implements Comparator<Vector>{
		
		public int compare(Vector u, Vector v){
			if (u.x < v.x) return -1;
			else if(u.x == v.x) return 0;
			else return 1;
			
		}
		
	}
	
	private static class ByLength implements Comparator<Vector>{
		
		public int compare(Vector u, Vector v){
			
			Double lu = Math.sqrt(u.x*u.x + u.y*u.y);
			Double lv = Math.sqrt(v.x*v.x + v.y*v.y);
			return lu.compareTo(lv);
			
		}
	}
	
	
	public String toString(){
	
	return "(" + x + "," + y + ")";
	
	}
	
	

}
