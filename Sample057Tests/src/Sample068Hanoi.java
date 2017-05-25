import java.util.LinkedList;

public class Sample068Hanoi {
	
	public static void main(String[] args){
		
		int n = 3;
		
		Tower[] towers = new Tower[n];
		for(int i = 0; i<n; i++){
			towers[i] = new Tower(i);
		}
		
		for(int i = n-1; i>=0; i--){
			towers[0].add(i);
		}
		
		System.out.println(towers[0]);
		
		towers[0].moveDisks(n, towers[2], towers[1]);
		
		System.out.println(towers[2]);
		
		
		
		
		
		
		
	}
	

private static class Tower{

	private LinkedList<Integer> disks;
	private int index;
	public Tower(int i){
		disks = new LinkedList<Integer>();
		this.index = i;
		
	}
	
	public int index() {return this.index;}
	
	public void add(int d){
		if(!disks.isEmpty() && disks.peek() <=d){
			System.out.println("Error placing disk " + d);
		}
		else disks.push(d);
	}
	
	public void moveTopTo(Tower t){
		int top = this.disks.pop();
		t.add(top);
	}
	
	public void moveDisks(int n, Tower target, Tower buffer){
		
		if(n>0) {
			this.moveDisks(n-1, buffer, target);
			moveTopTo(target);
			buffer.moveDisks(n-1, target, this);
						
		}
		
	}
	
	public String toString(){
		LinkedList tmp = disks;
		String s = "";
		while(!tmp.isEmpty()){
			s = tmp.pop() + "\n";
		}
		return s;
	}
	
}
}
