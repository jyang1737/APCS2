public class ArrayDeque<E> implements Deque<E> { 

    private E[] _deque;
    private int _head, _tail, _size, _capacity;
    public final static int CAPACITY = 1000;

    public ArrayDeque(int capacity) {
	_deque = (E[]) new Object[capacity];
	_size = _head = 0;
	_tail = 1;
	_capacity = capacity;
    }

    public ArrayDeque() {
	this(CAPACITY);
    }

    public int size() {
	return _size;
    }

    public boolean isEmpty() {
	return size() == 0;
    }

    public E getFirst() throws EmptyDequeException {
	if (isEmpty()) throw new EmptyDequeException("Deque is empty");
	return _deque[mod(_head + 1, _capacity)];
    }

    public E getLast() throws EmptyDequeException {
	if (isEmpty()) throw new EmptyDequeException("Deque is empty");
	return _deque[mod(_tail - 1, _capacity)];
    }

    public E peekFirst() {
	if (isEmpty()) return null;
	return getFirst();
    }

    public E peekLast() {
	if (isEmpty()) return null;
	return getLast();
    }

    public void addFirst(E e) throws FullDequeException {
	if (_head == _tail) throw new FullDequeException("Deque is full");
	_deque[_head] = e;
	_head = mod(_head - 1, _capacity);
	_size++;
    }

    public void addLast(E e) {
	if (_head == _tail) throw new FullDequeException("Deque is full");
	_deque[_tail] = e;
	_tail = mod(_tail + 1, _capacity);
	_size++;
    }

    public boolean offerFirst(E e) {
	try {
	    addFirst(e);
	    return true;
	}
	catch (FullDequeException f) { 
	    return false;
	}
    }

    public boolean offerLast(E e) {
	try {
	    addLast(e);
	    return true;
	}
	catch (FullDequeException f) { 
	    return false;
	}
    }

    public E removeFirst() throws EmptyDequeException {
	E ans = getFirst();
	_deque[mod(++_head, _capacity)] = null;
	_size--;
	return ans;
    }

    public E removeLast() throws EmptyDequeException {
	E ans = getLast();
	_deque[mod(--_tail, _capacity)] = null;
	_size--;
	return ans;
    }

    public static int mod(double n, double d) {
	return (int) (n - d * Math.floor(n / d));
    }

    public String toString() {
	String ans = "[";
	for (int i = 0; i < _size; i++) {
	    ans += _deque[mod(_head-1, _size)];
	    mod(_head++, _size);
	}
	ans += "]";
	return ans;
    }


    public static void main(String[] args) {
	Deque<Integer> x = new ArrayDeque<Integer>(4);
	System.out.println(x);
	x.addFirst(1);
	System.out.println(x);
	x.offerLast(2);
	
    }
    
}
