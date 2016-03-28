public class Node {
    
    private String _value;
    private Node _next;
    
    public Node(String value, Node next) {
	_value = value;
	_next = next;
    }

    //accessor methods
    public String getValue() {
	return _value;
    }

    public Node getNext() {
	return _next;
    }

    //modifier methods
    public String setValue(String str) {
	String ans = getValue();
	_value = str;
	return ans;
    }
    
    public Node setNext(Node t) {
	Node ans = getNext();
	_next = t;
	return ans;
    }

    public String toString() {
	return getValue();
    }

    public static void main(String[] args) {
	Node a = new Node("Sue", new Node("Mary", new Node("Bill", null)));
	System.out.println(a);
	System.out.println(a.getNext());
	System.out.println(a.getNext().getNext());
    }
}
