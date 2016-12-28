
import java.util.Arrays;
import java.util.Random;
import javax.swing.JFrame;

public class Test {
	
	public static Vector[] vectors;
	
	private static void generateVectors(){
		Random rnd = new Random();
		vectors = new Vector[5];
		for(int i=0; i<vectors.length; i++){
			vectors[i] = new Vector(rnd.nextInt(150), rnd.nextInt(150));
		}
				
	}
	
	public static void main(String[] args){
				
		generateVectors();
		
		System.out.println(Arrays.toString(vectors));
		
		System.out.println();
		
		Quick3Sort.sort(vectors, Vector.BY_X_COORDINATE);
		
		System.out.println(Arrays.toString(vectors));
		
		Quick3Sort.sort(vectors, Vector.BY_LENGTH);
		
		System.out.println(Arrays.toString(vectors));
				
	JFrame window = new JFrame();
		window.setSize(640, 480);
		window.setTitle("Vectors");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		DrawingComponent DC = new DrawingComponent();
		window.add(DC);
				
		
		
		
	}
	

}
