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
	
	public Double[] getCoords(){
		
		Double[] point = new Double[2];
		point[0] = x;
		point[1] = y;
		return point;
	}
	
	
	private static class ByYCoordinate implements Comparator<Point2D>{
		public int compare(Point2D a, Point2D b){
			if (a.y != b.y) return a.y.compareTo(b.y);
			else return a.x.compareTo(b.x);
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
	
	//in odd quadrants tg is increasing, in even decreasing
	//generally we're moving in ccw direction
	private static class ByPolarAngle implements Comparator<Point2D>{
		public int compare(Point2D a, Point2D b){
			
			if(a.quadrant() != b.quadrant()) return a.quadrant().compareTo(b.quadrant());
			else if(a.x==0.0 && a.y ==0.0 && b.x == 0.0 && b.y == 0.0) return 0;
			else if(a.quadrant() == 1.5 && b.quadrant() == 1.5) return 0;
			else if(a.quadrant() == 3.5 && b.quadrant() == 3.5) return 0;
			else if(a.quadrant() == 1 && b.quadrant() == 1) {Double tg1 = (a.y/a.x); Double tg2 =(b.y/b.x); return tg1.compareTo(tg2);}
			else if(a.quadrant() == 3 && b.quadrant() == 3) {Double tg1 = (a.y/a.x); Double tg2 =(b.y/b.x); return tg1.compareTo(tg2);}
			else if(a.quadrant() == 2 && b.quadrant() == 2) {Double tg1 = (a.y/a.x); Double tg2 =(b.y/b.x); return tg2.compareTo(tg1);}
			else /*if(a.quadrant() == 4 && b.quadrant() == 4)*/ {Double tg1 = (a.y/a.x); Double tg2 =(b.y/b.x); return tg2.compareTo(tg1);}
			
			
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
