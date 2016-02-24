public class SLinkedList {
    
    private Node _head, _tail;
    private int _size;

    public SLinkedList() {
	_head = _tail = null;
	_size = 0;
    }
   
    public int size() {
	return _size;
    }

    //O(1)
    public void addFirst(String value) {
	_size++;
	_head = new Node(value, _head);
	if (_size == 0) {
	    _tail = _head;
	}
    }

    public void addLast(String value) {
	Node newLast = new Node(value, null);
	if (_size == 0) _head = _tail = newLast;
	else {
	    _tail.setNext(newLast);
	    _tail = newLast;
	}
	_size++;
    }
 
    public String removeFirst() {
	Node first = _head;
	if (_size == 0) throw new IllegalStateException();
	if (_size == 1) _head = _tail = null;
	else {
	    _head = first.getNext();
	}
	_size--;
	return first.getValue();
    }

    public String removeLast() {
	_size--;
	Node current = _head;
	String ans = _tail.getValue();
        if (_size <= 1) return removeFirst();
	while (current.getNext() != _tail) {
	    current = current.getNext();
	}
	current.setNext(null);
	_tail = current;
	return ans;
    }

    public String toString() {
	Node cur = _head;
	String ans = "";
	while (cur != null) {
	    ans += cur.getValue() + " ";
	    cur = cur.getNext();
	}
	return ans;
    }
    
    public static void main(String[] args) {
	SLinkedList L = new SLinkedList();
	L.addLast("Bill");
	System.out.println(L);
	L.addLast("Mary");
	System.out.println(L);
	L.addLast("Yes");
	System.out.println(L);
	L.removeFirst();
	System.out.println(L);
	
    }

}
