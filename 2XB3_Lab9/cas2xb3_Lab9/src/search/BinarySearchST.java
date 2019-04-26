package search;

public class BinarySearchST<Key extends Comparable<Key>, Value> {
	private Key[] keys;
	private Value[] vals;
	private int N;

	public BinarySearchST(int capacity) {
	}

	public int size() {
		return N;
	}

	public Value get(Key key) {
		if (isEmpty())
			return null;
		int i = rank(key);
		if (i < N && keys[i].compareTo(key) == 0)
			return vals[i];
		else
			return null;
	}

	public int rank(Key key) {
		int lo = 0, hi = N - 1;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			int cmp = key.compareTo(keys[mid]);
			if (cmp < 0)
				hi = mid - 1;
			else if (cmp > 0)
				lo = mid + 1;
			else
				return mid;
		}
		return lo;
	}

	public void put(Key key, Value val) {
		int i = rank(key);
		if (i < N && keys[i].compareTo(key) == 0) {
			vals[i] = val;
			return;
		}
		for (int j = N; j > i; j--) {
			keys[j] = keys[j - 1];
			vals[j] = vals[j - 1];
		}
		keys[i] = key;
		vals[i] = val;
		N++;
	}

	public void delete(Key key) {
		if (isEmpty())
			return;
		int i = rank(key);
		if (i == N || keys[i].compareTo(key) != 0){
			return;
		}
		
		for (int j = i; j < N-1; j++){
			keys[j] = keys[j+1];
			vals[j] = vals[j+1];
		}
		
		N--;
		keys[N] = null;
		vals[N] = null;
		
		if (N > 0 && N == keys.length/4)
			resize(keys.length/2);
	}

	public boolean isEmpty() {
		return N==0;
	}
	
	public void resize(int capacity){
		assert capacity >= N;
		Key[] tmpk = (Key[]) new Comparable[capacity];
		Value[] tmpv = (Value[]) new Object[capacity];
		for (int i = 0; i < N; i++){
			tmpk[i] = keys[i];
			tmpv[i] = vals[i];
		}
	}
}
