public class DNode{

    private String _value;
    private DNode _previous, _next;


    public DNode(String value, DNode previous, DNode next){
	_value = value;
	_previous = previous;
	_next = next;
    }

    // accessor methods
    public String getValue(){
	return _value;
    }

    public DNode getNext(){
	return _next;
    }

    public DNode getPrevious(){
	return _previous;
    }

    // modifier methods
    public String setValue(String newValue){
	String ans = getValue();
	_value = newValue;
	return ans;
    }

    public DNode setNext(DNode newNext){
	DNode ans = getNext();
	_next = newNext;
	return ans;
    }

    public DNode setPrevious(DNode newPrevious){
	DNode ans = getPrevious();
	_previous = newPrevious;
	return ans;
    }





    public String toString(){
	return _value;
    }

    public static void main(String [] args){
	DNode a = new DNode("Amy", null, null);
        DNode b = new DNode("Bill", a, null);
	DNode c = new DNode("Carol",b, null);
	a.setNext(b);
	b.setNext(c);
	DNode current = a;
	while (current != null){
	    System.out.println(current);
	    current = current.getNext();
	}
	current = c;
	while (current != null){
	    System.out.println(current);
	    current = current.getPrevious();

	}
	// write the code to swap the values (not the nodes) Amy and Carol
	System.out.println(a + " " + c);
	a.setValue(c.setValue(a.getValue()));  
	System.out.println(a + " " + c);
    }




}
