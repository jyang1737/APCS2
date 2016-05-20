public class HotPotato {

    private Queue<String> q;
    
    
    public HotPotato() {
	q = new NodeQueue<String>();
        q.enqueue("Yes");
	q.enqueue("Same");
	q.enqueue("Smae");
	q.enqueue("Sam-E");
    }

    public void play() {
	while (q.size() > 1) {
	    boolean potato = false;
	    while (!potato) {
		double x = Math.random();
		String e = q.dequeue();
		q.enqueue(e);
		if (x > .5) potato = true;
	    }
	    String z = q.dequeue();
	    System.out.println("Potato: " + z);
	}
	String p = q.dequeue();
	System.out.println("Survivor:" + p);
	
    }

    public static void main(String[] args) {
	HotPotato x = new HotPotato();
	x.play();
	
	
    }



}
