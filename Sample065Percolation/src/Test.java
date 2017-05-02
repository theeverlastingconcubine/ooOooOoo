import java.util.Random;

import javax.swing.plaf.metal.DefaultMetalTheme;

public class Test {
	
	public static void main(String[] args){
		
/*		WQUF qf = new WQUF(6);
		
		qf.add(0,3);
		qf.add(2,4);
		qf.add(5,3);
		
		System.out.println(qf.isConnected(2, 5) + "   " + qf.isConnected(0, 5));*/
		
		/*int[][] cells = {{0,1,0,0,1},
						 {1,0,0,1,0},
						 {0,1,1,0,1},
						 {0,0,1,1,0},
						 {0,0,0,1,0}};*/
		
		
		int[][] cells = new int[100][100];
		int num = 0;
		int positive = 0;
		
		for(double random = 0.5; random<0.7; random += 0.001){
		
		while(num<1000){
			for(int i = 0; i<cells.length; i++){
				for(int j = 0; j<cells[0].length; j++){
					cells[i][j] = random(random);
				}
			}
			
			Percolation percolation = new Percolation(cells);
			if(percolation.percolates()) positive++;
			num++;
		}
		
		double prob = (double)positive/(double)num;
		num=0;
		positive=0;
		
		System.out.println(prob + "    " + random);
		
		if(prob>0.5) {System.out.println(prob + " winner is " + random); break;}
		
		}
				
		
		
	}
	
	private static int random(double p){
		Random rnd = new Random();
		int hi = (int) Math.round(p*100);
		
		int number = rnd.nextInt(100);
		
		if(number >=0 && number<=hi) return 1;
		else return 0;
		
		
	}
	
	

}
