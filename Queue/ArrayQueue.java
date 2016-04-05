public class ArrayQueue<E> implements Queue<E> {

    private E[] _queue;
    private int _front, _size, _rear;
    
    public static final int CAPACITY = 1000;
    
    public ArrayQueue() {
	_queue = (E[]) new Object[capacity];
	_capacity = capacity;
	_front = 0;
	_size = 0;
	_rear = 0;
    }

    public int size() {
	return _size;
    }

    public boolean isEmpty() {
	return size() == 0;
    }

    //O(1)
    public void enqueue(E e) throws FullQueueException {
	if (size() == _queue.length) throw new FullQueueException("Queue is Full");
	_queue[_rear] = e;
	_rear = (_rear + 1) % _queue.length;
	_size++;
    }

    public E front() throws EmptyQueueException {
	if (isEmpty()) throw new EmptyQueueException("Queue is empty");
	return _queue[_front];
    }

    public E dequeue() throws EmptyQueueException {
	E ans = front();
	_queue[_front] = null;
	_size--;
	_front = (_front + 1) % _queue.length;
	return ans;
    }

    public String toString() {
	String ans = "";
	for (int i = _front; i < _queue.length; i++) {
	    if (i > 
	}
    }

}

