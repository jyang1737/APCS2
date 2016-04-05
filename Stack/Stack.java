public interface Stack<E> {
    
    //place an element on at the top of the stack
    public void push(E element);

    //return and removes the top of the stack
    public E pop() throws EmptyStackException;

    //return the top of the stack
    public E top() throws EmptyStackException;

    //returns height of the stack
    public int size();

    //return true if the stack is empty; false otherwise
    public boolean isEmpty();

}
