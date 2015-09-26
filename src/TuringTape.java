
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
			System.out.println("new left node");
		}
		else{
			head = head.prev;
			System.out.println("left node exists");
		}
		
	}
	
	void moveRight(){ // moves the tape head one cell to the right
		if(head.next == null){
			head.next = new Node();
			head.next.value = 0;
			head.next.prev = head;
			head = head.next;
			System.out.println("new right node");
		}
		else{
			head = head.next;
			System.out.println("right node exists");
		}
		
	}
	
	int read(){ // returns the value contained by active cell
		return head.value;
		
	}
	
	void write(int a){ // writes the value to the active cell.
		head.value = a;
	}
	
	
	
	}
