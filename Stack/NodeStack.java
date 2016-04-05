public class NodeStack<E> implements Stack<E> {

    private Node<E> _stackHead;
    private int _size;

    public NodeStack() {
	_stackHead = null;
	_size = 0;
    }

    public int size() {
	return _size;
    }

    public boolean isEmpty() {
	return _size == 0;
    }

    //O(1)
    public void push(E value) {
	_stackHead = new Node<E> (value, _stackHead);
	_size++;
    }

    //O(1)
    public E top() throws EmptyStackException {
	if (isEmpty()) throw new EmptyStackException("Stack Empty");
	return _stackHead.getValue();
    }

    //O(1)
    public E pop() throws EmptyStackException {
	E ans = top();
	_stackHead = _stackHead.setNext(null);
	_size--;
	return ans;
    }

}
