import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

//we have an array of points. sort them by polar angle. 
//find with lowest y coordinate, if two such - with lowest x. this is an initial point
//shift array such that initial point in 0th place
//for each new point look two points ahead and check if it is a ccw turn
//by computing z coord of a cross (vector) product between corresponding vectors
//use stack to keep points


public class Test {
	
	public static Point2D[] points;
	
	private static void createPoints() throws FileNotFoundException{
		
		Scanner sc = new Scanner(new File("Points.txt"));
		points = new Point2D[sc.nextInt()];
		for(int i = 0; i<points.length; i++){
			
			points[i] = new Point2D(sc.nextDouble(), sc.nextDouble());
		}
		sc.close();
		
		
	}
	
	private static int ccw(Point2D point1, Point2D point3, Point2D point2){
		
		Double x1 = point1.getCoords()[0];
		Double y1 = point1.getCoords()[1];
		Double x2 = point2.getCoords()[0];
		Double y2 = point2.getCoords()[1];
		Double x3 = point3.getCoords()[0];
		Double y3 = point3.getCoords()[1];
		Double ccw = (x2-x1)*(y3-y1)-(x3-x1)*(y2-y1);
		
		if (ccw>0) return 1;
		else if (ccw<0) return -1;
		else return 0;
		
		
	}
	
	public static void main(String[] args) throws FileNotFoundException{
			
		Integer[] a = {5,5,76,43,689,5,8,3,5,8899,-10,0,-345,-3,33,100};
		
		System.out.println(Arrays.toString(a));
		System.out.println(a.length);
		System.out.println();
		
		MergeSortComparator.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println();
		createPoints();
		System.out.println(Arrays.toString(points));	
		
		for (int i=0; i<points.length-1; i++){
		System.out.println(points[i] + "  " + Point2D.BY_POLAR_ANGLE.compare(points[i], points[i+1]) + "  " + points[i+1]);
		}
		

		
		
	}

}
