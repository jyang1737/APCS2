public class NodeQueue<E> implements Queue<E> {

    private Node<E> _queueHead;
    private int _size;

    public NodeQueue() {
	_queueHead = null;
	_size = 0;
    }

    public int size() {
	return _size;
    }
    
    public boolean isEmpty() {
	return size() == 0;
    }

    public void enqueue(E e) {
	if (isEmpty()) {
	    _queueHead = new Node(e, null);
	}
	else {
	    _queueHead.setNext(new Node(e, null));
	    _size++;
	}
    }

    public E front() throws EmptyQueueException {
	if (isEmpty()) throw new EmptyQueueException("Queue is empty");
	return _queueHead.getValue();
    }

    public E dequeue() throws EmptyQueueException {
	E ans = front();
	_queueHead = _queueHead.getNext();
	_size--;
	return ans;
    }
    

}
