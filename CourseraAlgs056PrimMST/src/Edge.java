
public class Edge implements Comparable<Edge>{
	
	private int v; 
	private int w;
	private double weight; 
	
	public Edge(int v, int w, double weight){
		this.v = v;
		this.w = w;
		this.weight = weight;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + v;
		result = prime * result + w;
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Edge other = (Edge) obj;
		if (v != other.v)
			return false;
		if (w != other.w)
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}

	public int either(){
		return v;
	}
	
	public int other(int v){
		if(v==this.v) return w;
		else return v;
	}
	
	public double weight(){
		return this.weight;
	}
	
	public String toString(){
		return v+"--"+ weight +"--"+w; 
	}
	
	public int compareTo(Edge that){
		if(this.weight<that.weight) return -1;
		else if (this.weight<that.weight) return 1;
		else return 0;
	}
	

}
