import java.util.ArrayList;

public class AllSubsets {
	
	public static void main(String[] args){
		
		ArrayList<Integer> set = new ArrayList<Integer>();
		set.add(0);set.add(3);set.add(5);
		//set.add(2);set.add(4);set.add(1);set.add(6);
		
		ArrayList<ArrayList<Integer>> allSubsets = allSubsets(set,0);
		
		for(ArrayList<Integer> subset: allSubsets) System.out.println(subset);
		
		
	}
	
	
	public static ArrayList<ArrayList<Integer>> allSubsets(ArrayList<Integer> set, int index){
		
		ArrayList<ArrayList<Integer>> allSubsets;	
		
		if(set.size()==index) {
			allSubsets = new ArrayList<ArrayList<Integer>>();
			allSubsets.add(new ArrayList<Integer>());
		}
		
		else {
			allSubsets = allSubsets(set, index+1);
			int item = set.get(index);
			ArrayList<ArrayList<Integer>> moreSets = new ArrayList<ArrayList<Integer>>();
			for(ArrayList<Integer> subset: allSubsets){
				ArrayList<Integer> newSubset = new ArrayList<Integer>();
				newSubset.addAll(subset);
				newSubset.add(item);
				moreSets.add(newSubset);
			}
			allSubsets.addAll(moreSets);
			
		}
		return allSubsets;
		
		
	}

}
