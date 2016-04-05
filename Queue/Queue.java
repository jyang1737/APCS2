public interface Queue<E> {
    
    //inserts element e at rear of queue
    public void enqueue(E e);
    
    //removes and returns element at the front of the queue
    public E dequeue() throws EmptyQueueException;
    
    //returns the length
    public int size();
    
    //returns true if queue is empty
    public boolean isEmpty();
    
    //returns the element at the front
    public E front() throws EmptyQueueException;
}
