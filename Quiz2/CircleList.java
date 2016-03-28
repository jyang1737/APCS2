public class CircleList{

    private DNode _cursor, _top;
    private int _size;

    // constructor 
    /*
    public CircleList(){
	
	_cursor = _top = new DNode();
	_size = 10;

	for (int i = 0; i < 9; i++) {
	    _cursor.setNext(new DNode());
	    advance();
	    _cursor.setPrev(_cursor.getPrev());
	}
	_cursor.setNext(_top);
	_top.setPrev(_cursor.getPrev());
    }
    */
    
    public CircleList() {
	_cursor = _top = new DNode();
	_size = 1;
	_cursor.setNext(_cursor);
	_cursor.setPrev(_cursor);
    }

    public DNode getCursor(){
	return _cursor;
    }

 
    // Adds a node after the cursor
    // If the list is empty adds at the cursor
    public void add(DNode newNode){
	DNode t;
	if (isEmpty()){
	    _cursor = newNode;
	    t = _cursor;
	}
	else{
	    t = _cursor.getNext();
	    _cursor.setNext(newNode);
	}
	newNode.setNext(t);
	_size++;
    }
    /*
    public boolean add(GameEntry entry) {
	boolean topTen = false;
	int i = 0;
	for (; i < size(); i++) {
	    if (entry.compareTo(_cursor.getValue()) > 0) {
		topTen = true;
		break;
	    }
	}
	if (!topTen) return topTen;
	
    }
    */
    public int size(){
	return _size;
    }

    public boolean isEmpty(){
	return size() == 0;
    }
    public void advance(){
	_cursor = _cursor.getNext();
    }

 
    public DNode remove(){
	if (isEmpty()) throw new IllegalStateException("empty list");
	DNode ans = _cursor.getNext();
	DNode n = ans.getNext();
	ans.setNext(null);
	if (size() == 1) _cursor = null;
	else  _cursor.setNext(n);
	--_size;
	return ans;
    }
   
    public DNode removeLast() {
	_cursor = _top;
	_cursor = _cursor.getPrev();
       	DNode a = _cursor.getPrev();
	a.setNext(_cursor.setNext(null));
	_top.setPrev(_cursor.setPrev(null));

	return _cursor;
    }
   
    public String toString(){
	String ans = "Rank \t Name \t Score\n";
	DNode t = _cursor;
	for (int i = 0; i < size(); i++){
	    ans += (i+1) + "\t" + t + "\n";
	    t = t.getNext();
	} 
	return ans;
    }
   
    public static void main(String [] args){
	
	CircleList x = new CircleList();
	System.out.println(x);
	DNode a = new DNode(new GameEntry("IAW",1337), null, null);
	System.out.println(x.removeLast());
	System.out.println(x);

    }




}
