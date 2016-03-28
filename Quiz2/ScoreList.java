public class ScoreList {

    private DNodeGame _cursor;
    private int _size;

    public ScoreList() {
	_cursor = new DNodeGame(new GameEntry(), _cursor, _cursor);
	for (int i = 0; i < 9; i++) {
	    _cursor.add(new DNodeGame(new GameEntry(), null, null));
	}
	_size = 10;
    }
    
    public DNodeGame getCursor() {
	return _cursor;
    }

    public int size() {
	return _size;
    }

    public boolean isEmpty() {
	return size() == 0;
    }

    public void advance() {
	_cursor = _cursor.getNext();
    }

    public DNodeGame remove() {
	if (isEmpty()) throw new IllegalStateException("empty list");
	DNodeGame ans = _cursor.getNext();
	DNodeGame n = ans.getNext();
	ans.setNext(null);
	if (size() == 1) _cursor = null;
	else _cursor.setNext(n);
	--_size;
	return ans;
    }

    public boolean add(GameEntry entry) {
	DNodeGame orig = _cursor;
	boolean topTen = false;
	int i = 0; 
	DNodeGame x = orig;
	for (; i < size(); i++) {
	    if (entry.compareTo(x.getValue() > 0)) {
		    topTen = true;
		    break;
	    }
	    x = x.getNext();
	}
	if (!topTen) return false;
	
    }
    public String toString() {
	String ans = "";
	return ans;
    }

    public static void main(String[] args) {
	ScoreList
    }

}
