public class Progression {
    protected int _first, _cur;

    public Progression(int first) {
	_first = first;
    }

    public Progression() {
	this(1);
    }

    //post: reset progression to first value and return first value
    public int firstValue() {
	_cur = _first;
	return _cur;
    }

    //post: advances progression to the next value and return it
    public int nextValue() {
	return ++_cur;
    }

    //pre: n > 0
    //post: prints the first n values
    public void printProgression(int n) {
	String ans = firstValue() + " ";
	for (int i = 1; i < n; i++)
	    ans += nextValue() + " ";
	System.out.println(ans);
    }
}
