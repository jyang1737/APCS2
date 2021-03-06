public interface Deque<E>{
    
   
    public int size();
    public boolean isEmpty();
 
    //returns the first element in the deque
    public E getFirst() throws EmptyDequeException;
    //returns the last element in the deque
    public E getLast() throws EmptyDequeException;
    
    //inserts e at the head of the deque
    public void addFirst(E e);
    //inserts e at the tail of the deque
    public void addLast(E e);
    
    //removes and returns the first element in the deque
    //throws exception if empty
    public E removeFirst() throws EmptyDequeException;
    //removes and returns the last element in the deque
    //throws exception if empty
    public E removeLast()  throws EmptyDequeException;
    
    public boolean offerFirst(E e);
    public boolean offerLast(E e);

    public E peekFirst();
    public E peekLast();


}
