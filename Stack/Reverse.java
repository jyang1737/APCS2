import java.util.*;

public class Reverse {

    public static<E> boolean inStack(Stack<E> stack, E value) {
	Stack<E> aux = new NodeStack<E>();
	boolean ans = false;
	while (!stack.isEmpty()) {
	    if (value.equals(stack.top())) {
		ans = true;
		break;
	    }
	    aux.push(stack.pop());
	}
	while (!aux.isEmpty()) 
	    stack.push(aux.pop());
	return ans;
    }


    //O(N) if L is an ArrayList
    //O(N^2) if L is a LinkedList
    public static<E> void reverse(List<E> L) {
	Stack<E> stack = new ArrayStack<E>(L.size());
	for (int i = 0; i < L.size(); i++) 
	    stack.push(L.get(i)); //O(1) for an ArrayList
	                          //O(N) for LinkedList
	int counter = 0;
	while (!stack.isEmpty()) {
	    L.set(counter,stack.pop());//O(1) for ArrayList
	    counter++;
	}
    }

    public static void main(String[] args) {
	ArrayList<Integer> L = new ArrayList<Integer>();
	for (int i = 0; i < 10; i++) {
	    L.add(i);
	}
	System.out.println(L);
	reverse(L);
	System.out.println(L);
    }

}
