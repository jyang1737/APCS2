public class ArrayStack<E> implements Stack<E>{


    private E[] _stack;
    private int _capacity;
    private int _top;

    private final static int CAPACITY = 1000;

    public ArrayStack(int capacity){
	_capacity = capacity;
	_stack = (E[]) new Object[_capacity];  // compiler warning message
	_top = -1;
    }
    
    public ArrayStack(){
	this(CAPACITY);
    }
    // O(1)
    public E top() throws EmptyStackException{
	if (isEmpty())
	    throw new EmptyStackException("Stack Empty");
	return _stack[_top];
    }
    // O(1)
    public void push(E element) throws FullStackException{
	if (size() == _capacity)
	    throw new FullStackException("Full Stack");
	_stack[++_top] = element;
    }

    // O(1)
    public E pop() throws EmptyStackException{
	if (isEmpty())
	    throw new EmptyStackException("Stack Empty");
	E ans = top();
	_stack[_top--] = null;
	return ans;
    }
    // O(1)
    public int size(){
	return _top + 1;
    }
    // O(1)
    public boolean isEmpty(){
	return size() == 0;
    }


    public String toString(){
	String ans ="[";
	if (size() > 0) ans += _stack[0];
	if (size() > 1) 
	    for (int i = 1; i < size(); i++)
		ans += ", " + _stack[i];
	ans += "]";
	return ans;
    }

    public void transferTo(ArrayStack<E> rhs){
	/*	int max = rhs._capacity;
	for (int i = max - rhs.size(); i < max; i++){
	    if (isEmpty()) return;
	    rhs.push(pop());
	}
	*/
	while (!this.isEmpty() && rhs.size() < rhs._capacity)
	    rhs.push(this.pop());
	
    }




    public static void main(String[] args){
	ArrayStack<Integer> A = new ArrayStack<Integer>(100);
	ArrayStack<Integer> B = new ArrayStack<Integer>(5);
	ArrayStack<Integer> C = new ArrayStack<Integer>(3);

	for (int i = 0; i < 100; i++){
	    A.push(i);
	}
	System.out.println("A: " + A.size() + " B: " + B.size() + " C: " + C.size());
	A.transferTo(B);  // 95 - 5 - 0
	B.transferTo(C);  // 95 - 2 - 3
	C.transferTo(A);  // 98 - 2 - 0
	B.transferTo(C);  // 98 - 0 - 2
	A.transferTo(B);  // 93 - 5 - 2
	B.transferTo(C);  // 93 - 4 - 3
	System.out.println("A: " + A.size() + " B: " + B.size() + " C: " + C.size());
    }


   

}
