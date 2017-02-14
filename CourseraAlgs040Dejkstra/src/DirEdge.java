
public class DirEdge {

	private int v;
	private int w;
	private double weigth;

	public DirEdge(int v, int w, double weight) {

		this.v = v;
		this.w = w;
		this.weigth = weigth;
	}

	public int from() {
		return v;

	}

	public int to() {
		return w;
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
		DirEdge other = (DirEdge) obj;
		if (v != other.v)
			return false;
		if (w != other.w)
			return false;
		if (Double.doubleToLongBits(weigth) != Double.doubleToLongBits(other.weigth))
			return false;
		return true;
	}

	public double weigth() {
		return weigth;
	}
	
	public String toString(){
		return v + " --> " + w + " " + weigth;
	}

}
