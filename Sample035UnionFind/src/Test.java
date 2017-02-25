import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
	
public static void main(String[] args) throws FileNotFoundException{
	
	Scanner sc = new Scanner(new File("uftest.txt"));
	
	UF uf = new UF(sc.nextInt());
	while(sc.hasNextInt()){
		uf.union(sc.nextInt(), sc.nextInt());
	}
	sc.close();
	Scanner scc = new Scanner(System.in);
	
	uf.union(2, 5);
	System.out.println(uf.isConnected(scc.nextInt(), scc.nextInt()));
	scc.close();
	
}

}
