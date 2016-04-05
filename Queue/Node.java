public class Node{

    private String _value;
    private Node _next;

   
    public Node (String val, Node next){
	_value = val;
	_next = next;
    }

    public String getValue(){
	return _value;
    }

    public Node getNext(){
	return _next;
    }

    public Node setNext(Node t){
	Node ans = _next;
	_next = t;
	return ans;
    }

    public String setValue(String newValue){
	String ans = _value;
	_value = newValue;
	return ans;
    }


    public String toString(){
	return _value;
    }

    public static void main(String [] args){
	Node a = new Node("Bob", null);
	Node b = new Node("Sam",a);
	System.out.println(a);
	System.out.println(b);
	System.out.println(a.getNext());
	System.out.println(b.getNext());
    }

}
