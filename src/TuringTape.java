
public class TuringTape {
	
	private Node head;
	int [] inputs;

	private class Node{
		public Node prev;
		public Node next;
		public int value;
	}
	

	public TuringTape(){ // creates a TuringTape with cells initialized to 0
		head  = new Node();
		head.value = 0;
		head.next = null;
		head.prev = null;
	}
	
	void moveLeft(){ // moves the tape head one cell to the left
		if(head.prev == null){
			head.prev = new Node();
			head.prev.value = 0;
			head.prev.next = head;
			head = head.prev;
		}
		else{
			head = head.prev;
		}
		
	}
	
	void moveRight(){ // moves the tape head one cell to the right
		if(head.next == null){
			head.next = new Node();
			head.next.value = 0;
			head.next.prev = head;
			head = head.next;
		}
		else{
			head = head.next;
		}
		
	}
	
	int read(){ // returns the value contained by active cell
		return head.value;
		
	}
	
	void write(int a){ // writes the value to the active cell.
		head.value = a;
	}
	
	public String toString(){
		Node n = head;
		while(n.prev != null){
			n = n.prev;
		}
		String s = "";
		while(n != null){
			s = s + n.value;
			n = n.next;
		}
		return s;
		
	}
	
	}
