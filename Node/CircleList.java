public class CircleList {
    
    private Node _cursor;
    private int _size;

    public CircleList() {
	_cursor = null;
	_size = 0;
    }

    public int size() {
	return _size;
    }
    
    public boolean isEmpty() {
	return _size == 0;
    }

    public Node getCursor() {
	return _cursor;
    }

    public void add(Node newNode) {
	if (isEmpty()) { 
	    _cursor = newNode;
	    _cursor.setNext(_cursor);
	}
	else {
	    newNode.setNext(_cursor.getNext());
	    _cursor.setNext(newNode);
	}
	_size++;
    }

    public void advance() {
	_cursor = _cursor.getNext();
    }

    public Node remove() {
	if (size() == 0) throw new IllegalStateException();
	Node ans = _cursor.getNext();
	_cursor.setNext(ans.getNext());
	ans.setNext(null);
	_size--;
	return ans;
    }

    public String toString() {
	if (size() == 0) return "";
	Node t = _cursor;
	String ans = t.toString();
	for (int i = 1; i < size(); i++) {
	    t = t.getNext();
	    ans += ", " + t;
	}
	return ans;
    }

    public static void main(String[] args) {
	CircleList x = new CircleList();
	Node a = new Node("Yes",null);
	Node b = new Node("Same",null);
	x.add(a);
	x.add(b);
	System.out.println(x);
	x.remove();
	System.out.println(x);
	x.remove();
	System.out.println(x);
    }
}


