public class NodeQueue<E> implements Queue<E>{

    private Node<E> _front, _rear;
    private int _size;

    public  NodeQueue(){
	_front = _rear = null;
	_size = 0;
    }
    // O(1)
    public E front() throws EmptyQueueException{
	if (isEmpty())
	    throw new EmptyQueueException("Empty queue.");
	return _front.getValue();
    }
    // O(1)
    public E dequeue() throws EmptyQueueException{
	if (isEmpty())
	    throw new EmptyQueueException("Empty queue.");
	E ans = front();
	_front = _front.setNext(null);
	_size--;
	if (isEmpty()) _rear = null;
	return ans;
    }

    // O(1)
    public void enqueue(E val){
	Node<E> newRear = new Node<E>(val,null);
	if (isEmpty()){
	    _front = _rear = newRear;
	}
	else{
	    _rear.setNext(newRear);
	    _rear = newRear;
	}
	_size++;
    }


    public int size(){
	return _size;
    }

    public boolean isEmpty(){
	return size() == 0;
    }

    public String toString(){
	String ans = "[ ";
	if (size() > 0) {
	    ans += front();
	}
	if (size() > 1){
	    Node<E> current = _front.getNext();
	    while (current != null){
		ans += ", " + current.getValue();
		current = current.getNext();
	    }
	}
	ans += "]";
	return ans;
    }

    public static void main(String [] args){
	Queue<Integer> q = new NodeQueue<Integer>();
	System.out.println(q);

	for (int i = 0; i < 5 ; i++){
	    q.enqueue(i);
	    System.out.println("enqueue : " + i + " q: " + q);
	}

	while (!q.isEmpty()){
	    if (Math.random() < 0.75)
		System.out.println("dequeue " + q.dequeue() + " q: " + q);
	    else {
		int x = (int)(Math.random() * 100) ;
		q.enqueue(x);
		System.out.println("enqueue : " + x + " q: " + q);
	    }
	}

    }

}
