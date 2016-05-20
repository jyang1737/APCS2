public class Replace {

    public static<E> void replace(Queue<E> q, E oldValue, E newValue) {

	for (int i = 0; i < q.size(); i++) {
	    E cur = q.dequeue();
	    if (cur.equals(oldValue)) cur = newValue;
	    q.enqueue(cur);
	}

    }


}
