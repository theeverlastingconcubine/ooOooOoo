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

	private static void createPoints() throws FileNotFoundException {

		Scanner sc = new Scanner(new File("Points.txt"));
		points = new Point2D[sc.nextInt()];
		for (int i = 0; i < points.length; i++) {

			points[i] = new Point2D(sc.nextDouble(), sc.nextDouble());
		}
		sc.close();

	}

	private static int ccw(Point2D point1, Point2D point3, Point2D point2) {

		Double x1 = point1.getCoords()[0];
		Double y1 = point1.getCoords()[1];
		Double x2 = point2.getCoords()[0];
		Double y2 = point2.getCoords()[1];
		Double x3 = point3.getCoords()[0];
		Double y3 = point3.getCoords()[1];
		Double ccw = (x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1);

		if (ccw > 0)
			return 1;
		else if (ccw < 0)
			return -1;
		else
			return 0;

	}

	private static int indexOfLowestByY(Point2D[] pt) {

		int minIndex = 0;
		Point2D min = pt[0];

		for (int i = 0; i < pt.length; i++) {
			
			if (Point2D.BY_Y_COORDINATE.compare(min, pt[i]) > 0) {
				min = pt[i];
				minIndex++;
			}
		}

		return minIndex;

	}

	private static void shiftKEntryToZeroPosition(Object[] a, int k) {

		
		int N = a.length;
		int index, j;
		Object box = new Object();

		for (int i = 0; i < gcd(k, N); i++) {
			box = a[i];
			j = i;
			while (true) {
				index = (j + k) % N;
				if (index == i)
					break;
				a[j] = a[index];
				j = index;
			}
			a[j] = box;
		}

	}

	private static int gcd(int a, int b) {

		if (b == 0)
			return a;
		else
			return gcd(b, a % b);

	}

	public static void main(String[] args) throws FileNotFoundException {

		createPoints();
		
		System.out.println(Arrays.toString(points));
		
		MergeSortComparator.sort(points, Point2D.BY_POLAR_ANGLE);
		System.out.println();
		System.out.println(Arrays.toString(points));
		
		int m = indexOfLowestByY(points);
		System.out.println(m);
		
		shiftKEntryToZeroPosition(points, m);
		
		System.out.println();
		System.out.println(Arrays.toString(points));
		


		
		
		
		/*
		 * Integer[] a = {5,5,76,43,689,5,8,3,5,8899,-10,0,-345,-3,33,100};
		 * 
		 * System.out.println(Arrays.toString(a)); System.out.println(a.length);
		 * System.out.println();
		 * 
		 * MergeSortComparator.sort(a); System.out.println(Arrays.toString(a));
		 * System.out.println();
		 */

				
		/*  for (int i=0; i<points.length-1; i++){ System.out.println(points[i] +
		 "  " + Point2D.BY_POLAR_ANGLE.compare(points[i], points[i+1]) + "  "
		 + points[i+1]); }
		

		System.out.println();
		MergeSortComparator.sort(points, Point2D.BY_Y_COORDINATE);
		System.out.println(Arrays.toString(points));

		System.out.println();
		Integer[] tt = { 0, 1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(tt));

		System.out.println();

	 	System.out.println(gcd(27,30));

		shiftKEntryToZeroPosition(tt, 4);
		System.out.println(Arrays.toString(tt));
*/
		
		
		
	}

}
