public class StackQ<E> implements Stack<E> {

    private Queue<E> _main, _temp;

    public StackQ() {
	_main = new NodeQueue<E>();
	_temp = new NodeQueue<E>();
    }

    //O(1)
    //precondition: _main represents stack, _temp is empty
    public E top() throws EmptyStackException {
	if (isEmpty()) throw new EmptyStackException("Stack empty");
	return _main.front();
    }

    //O(1)
    //precondition: _main represents stack, _temp is empty
    public E pop() throws EmptyStackException {
	E ans = top();
	return _main.dequeue();
    }

    //O(N)
    public void push (E val) {
	while (!_main.isEmpty()) {
	    _temp.enqueue(_main.dequeue());
	}
	_main.enqueue(val);
	while (!_temp.isEmpty()) {
	    _main.enqueue(_temp.dequeue());
	}
    }
    
    //O(1)
    public int size() {
	return _main.size();
    }
    
    public boolean isEmpty() {
	return size() == 0;
    }

    
    
	
}
