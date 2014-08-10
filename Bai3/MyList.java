
public class MyList<T> implements Item {

	private Node start;
	private Node end;
	
	public MyList() {
		start = null;
		end = null;
	}
	
	public void append(Item data) {
		Node node = new Node(data.clone(), null);
		if (start == null) {
			start = node;
			end = node;
		}
		else {
			end.next = node;
			end = node;
			end.next = null;
		}
	}
	
	public void appendList(MyList aL) {
		Node node = aL.start;
		while (node != null) {
			this.append(node.data.clone());
			node = node.next;
		}
	}
	
	public Item clone() {
		MyList list = new MyList();
		Node node = this.start;
		while (node != null) {
			list.append(node.data.clone());
			node = node.next;
		}
		return list;
	}
	
	public String toString() {
		String rsString = "(";
		Node node = this.start;
		while (node != end) {
			rsString = rsString + node.data.toString() + ", ";	
			node = node.next;
		}
		rsString = rsString + node.data.toString() + ")";
		return rsString;
	}
	
	public int length() {
		int length = 0;
		Node node = this.start;
		while (node != null) {
			length++;
			node = node.next;
		}
		return length;
	}
	
	public boolean equals(Item item) {
		return this.toString().equals(item.toString());
	}
	
	public Item find(Item key) {
		String keyString = key.toString();
		Node node = this.start;
		while ((node != null) && (node.data.toString().equals(keyString))) {
			node = node.next;
		}
		return node.data;
	}

	private void addInvert(Node head) {
	  if (head != null) {
	     addInvert(head.next);
		 append(head.data);
	  }
    }
	
	public void invert() {
	    Node head = start;
		start = end = null;
		addInvert(head);
	}
}


