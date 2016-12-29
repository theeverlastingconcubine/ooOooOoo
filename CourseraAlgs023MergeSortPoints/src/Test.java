import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

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
		System.out.println(Point2D.BY_POLAR_ANGLE.compare(points[i], points[i+1]));
		}
		
		
		
	}

}
