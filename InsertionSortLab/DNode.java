public class DNode {
    
    private String _value;
    private DNode _previous, _next;

    public DNode(String value, DNode previous, DNode next) {
	_value = value;
	_previous = previous;
	_next = next;
    }
    
    public String getValue() {
	return _value;
    }

    public DNode getPrevious() {
	return _previous;
    }

    public DNode getNext() {
	return _next;
    }

    public String setValue(String newValue) {
	String ans = newValue;
	_value = newValue;
	return ans;
    }

    public DNode setPrevious(DNode newPrevious) {
	DNode ans = getPrevious();
	_previous = newPrevious;
	return ans;
    }

    public DNode setNext(DNode newNext) {
	DNode ans = getNext();
	_next = newNext;
	return ans;
    }

    public String toString() {
	return _value;
    }

    public static void main(String[] args) {
	DNode a = new DNode("Amy", null, null);
	DNode b = new DNode("Bill", a, null);
	DNode c = new DNode("Carol", b, null);
	a.setNext(b);
	b.setNext(c);
	DNode current = a;
	while (current != null) {
	    System.out.println(current);
	    current = current.getNext();
	}
	current = c;
	while (current != null) {
	    System.out.println(current);
	    current = current.getPrevious();
	}
	c.setValue(a.setValue(c.getValue()));
	    
    }


}
