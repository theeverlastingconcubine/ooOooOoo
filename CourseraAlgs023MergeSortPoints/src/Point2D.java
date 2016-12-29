import java.util.Comparator;

public class Point2D implements Comparable<Point2D>{
	//compareTo defines lex order
	//comparators are ByYCoordinate and ByPolarAngle
	
	
	//this shit forces to have a class which implements Comparator
	public static final Comparator<Point2D> BY_Y_COORDINATE = new ByYCoordinate();
	public static final Comparator<Point2D> BY_POLAR_ANGLE = new ByPolarAngle();
	
	private Double x;
	private Double y;
	
	public Point2D(Double x, double y){
		
		this.x=x;
		this.y=y;
	}
	
	private static class ByYCoordinate implements Comparator<Point2D>{
		public int compare(Point2D a, Point2D b){
			return a.y.compareTo(b.y);
			}
				
	}
	
	
	private Double quadrant(){
		
		if(x>0 && y>=0) return 1.0;
		else if (x<0 && y>=0) return 2.0;
		else if (x<0 && y<0) return 3.0;
		else if (x>0 && y<0) return 4.0;
		else if(x == 0 && y>0) return 1.5; //is where tg is undefined
		else if(x == 0 && y<0) return 3.5; //is where tg is undefined
		else return 0.0;  //should only be for (0,0) point
				
	}
	
	private static class ByPolarAngle implements Comparator<Point2D>{
		public int compare(Point2D a, Point2D b){
			
			if(a.quadrant() != b.quadrant()) return a.quadrant().compareTo(b.quadrant());
						
					
		}
	}
	
	public int compareTo(Point2D that){
		
		if (this.x > that.x) {return 1;}
		else if (this.x == that.x) {return this.y.compareTo(that.y);}
		else return -1;
	}
	
	public String toString(){
		String str = "(" + x + ", " + y + ")";
		return str;
	}
	
	

}
