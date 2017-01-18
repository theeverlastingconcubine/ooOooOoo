
public class Edge implements Comparable<Edge> {

	private final int v, w;
	private final double weigth;

	public Edge(int v, int w, double weight) {

		this.v = v;
		this.w = w;
		this.weigth = weight;

	}

	public int either() {
		return v;
	}

	public int other(int vertex) {
		if (vertex == v)
			return w;
		else
			return v;
	}

	public int compareTo(Edge that) {
		if (this.weigth < that.weigth)
			return -1;
		else if (this.weigth > that.weigth)
			return 1;
		else
			return 0;
	}
	
	public String toString(){
		
		return v + "--" + weigth + "->" + w;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + v;
		result = prime * result + w;
		long temp;
		temp = Double.doubleToLongBits(weigth);
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
		if (Double.doubleToLongBits(weigth) != Double.doubleToLongBits(other.weigth))
			return false;
		return true;
	}
	
	

}
