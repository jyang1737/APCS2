import java.util.ArrayList;



public class InsertionSort{

    public static void shuffle(ArrayList<String> list){
	int N = list.size();
	for (int i = 0; i < N ; i++){
	    int j = (int) (Math.random() * (N - i)) + i;
	    swap(list,i,j);
	}
    }


    public static void swap(ArrayList<String> x, int i, int j){
	String temp = x.get(i);
	x.set(i,x.get(j));
	x.set(j,temp);
    }

    public static void insertionSort(DLinkedList list) {
	int n = list.size();
	DNode pivot = L.getFirst.getNext();
	DNode end = pivot.getNext();
	DNode cur = null;
	while (L.hasNext(pivot)) {
	    L.remove(pivot);
	    while (L.hasPrevious(cur) &&
		   cur.getValue().compareTo(pivot.getValue()) > 0) {
		cur = cur.getPrevious();
	    }
	    L.addAfter(cur,pivot);
	    pivot = end;
	    end = pivot.getNext();
	}
    }
    
    public static void main(String [] args){
	int N = Integer.parseInt(args[0]);
	ArrayList<String> list = new ArrayList<String>();
	for (int i = 0; i < N; i++)
	    list.add(i + "");
        shuffle(list);
	System.out.println("Random : " + list);

	DLinkedList dlinkedlist = new DLinkedList();
	/*	for (int i = 0; i < list.size(); i++) {
	    dlinkedlist.addLast(list.get(i));
	}
	*/
	for (int i = list.size()-1; i >= 0; i--) {
	    dlinkedlist.addFirst(list.get(i));
	}
	System.out.println(dlinkedlist);
    }



}
