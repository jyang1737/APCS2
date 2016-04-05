public class ArrayStackList<E> implements Stack<E> {
    
    private ArrayList<E> _stack;
    private int _top;

    public ArrayListStack() {
	_stack = new ArrayList<E> _stack;
	_top = -1;
    }

    public int size() {
	return _top + 1;
    }

    public boolean isEmpty() {
	return size() == 0;
    }

    //O(1)
    public void push(E value) {
	_stack.add(value);
	_top++;

    }
    
    //O(1)
    public E top() throws EmptyStackException() {
	if (isEmpty()) throw new EmptyStackException("Empty Stack");
	return _stack.get(_top);
    }

    //O(1)    
    public E pop() throws EmptyStackException() {
	E ans = top();
	_stack.remove(_top--);
	return ans;
    }
   

    public String toString() {
	return _stack.toString();
    }

}
