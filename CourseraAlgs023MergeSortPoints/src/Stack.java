import java.util.Iterator;

public class Stack<T> implements Iterable<T>{

	// resizable array implementation

	private T[] a;
	int N; // size of a stack

	public Stack() {

		a = (T[]) new Object[2];
		N = 0;
	}

	public Stack(int initialCapacity) {

		a = (T[]) new Object[initialCapacity];
		N = 0;
	}
	
	public boolean isEmpty(){
		
		return N==0;
	}
	
	public int size(){
		
		return N;
	}

	private void resize(int capacity) {
		assert capacity >= N;
		
		T[] tmp = (T[]) new Object[capacity];
		for (int i = 0; i < N; i++) {
			tmp[i] = a[i];
		}
		a = tmp;
	}

	public void push(T item) {

		if(N==a.length) resize (2*a.length);
		a[N] = item;
		N++;
	}
	
	public T pop(){
		if (isEmpty()) throw new Error("Nothing to pop");
		T item = a[N-1];
		a[N-1] = null;
		N--;
		if(N>0 && N==a.length/4) resize(a.length/2);
		return item;
	}
	
	public Iterator<T> iterator(){
		return new StackIterator();
	}
	
	private class StackIterator implements Iterator<T>{
		
		int i;
		public StackIterator(){
			i=N-1;
		}
		
		public boolean hasNext(){
			return i>0;
		}
		
		public T next(){
			if(!hasNext()) throw new Error("We're reached the bottom");
			T tmp = a[i];
			i--;
			return tmp;
			
		}
		
		
	}

}
