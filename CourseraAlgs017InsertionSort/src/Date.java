
public class Date implements Comparable<Date> {

	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) {
		this.day = day;
		this.year = year;
		this.month = month;
	}

	public String toString() {

		return day + "." + month + "." + year;

	}

	public int compareTo(Date that) {

		if (this.year < that.year)
			return -1;
		if (this.year > that.year)
			return 1;
		if (this.month < that.month)
			return -1;
		if (this.month > that.month)
			return 1;
		if (this.day < that.day)
			return -1;
		if (this.day > that.day)
			return 1;
		else
			return 0;

	}

}
