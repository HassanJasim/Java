package search;

import java.util.Vector;

public class SequentialSearchST<Key, Value> {
	private Node first; // first node in the linked list

	private class Node { // linked-list node
		Key key;
		Value val;
		Node next;

		public Node(Key key, Value val, Node next) {
			this.key = key;
			this.val = val;
			this.next = next;
		}
	}

	public Value get(Key key) {
		for (Node x = first; x != null; x = x.next)
			if (key.equals(x.key))
				return x.val; // search hit
		return null; // search miss
	} // Search for key, return associated

	public void put(Key key, Value val) {
		for (Node x = first; x != null; x = x.next)
			if (key.equals(x.key))
			{ 
				x.val = val; 
				return; 
			} // Search hit: update val.
			first = new Node(key, val, first); // Search miss: add new node.
	} // Search for key. Update value if found; grow table if new.
	
	public int size(){
		int size = 0;
		for (Node x = first; x!= null; x = x.next){
			size++;
		}
		return size;
	}
	
	public Iterable<Key> keys(){
		Vector<Key> ks = new Vector<Key>(this.size());
		for (Node x = first; x!= null; x = x.next){
			ks.add(x.key);
		}
		return ks;
	}
	
	public void delete(Key key){
		Node prev = null;
		for (Node x = first; x!= null; x = x.next){
			if (key.equals(x.key)){
				if(prev == null)
					first = x.next;
				else
					prev.next = x.next;
				return;
			}
		}
	}
}
