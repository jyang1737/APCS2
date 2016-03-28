/*

kids: Abe, Cal, Jen, Eve, Pam, Vern, Joe, Quin, Yuki
it: Jen
kids: Cal, Eve, Pam, Vern, Joe, Quin, Yuki, Abe 
Duck : Cal      
Duck : Eve
Duck: Pam
Goose: Vern
Race between Jen and Vern
kids:  Pam, Jen, Joe, Quin, Yuki, Abe, Cal, Eve
it : Vern

and the game continues.

Write the class DuckDuckGoose started below.
//********************************************************************
*/
import java.util.ArrayList;

public class DuckDuckGoose{

    private CircleList _circle;

    // *** Question 4 ****
    // Transfer the names from the ArrayList into a CircleList.
    public DuckDuckGoose(ArrayList<String> names){
	_circle = new CircleList();
	for (String name: names)
	    _circle.add(new Node(name, null));
	
    }



    // *** Question 5 ****
    // Returns a randomly selected child to be it.
    // The child is removed from the circle and its node is returned.
    public Node chooseIt(){
	int N = _circle.size();
	int r = (int) (Math.random() * N);
	for (int i = 0; i < r; i++)
	    _circle.advance();
	return _circle.remove();
    }



    public String toString(){
	return _circle.toString();
    }

    public void play(int n) {
	
	Node it = chooseIt();
	
	for (int i = 0; i < n; i++) {
	    System.out.println("kids: [" + _circle + "]");
	    System.out.println("It: " + it);
	    
	    Node goose = null;
	    while (goose == null) {
		_circle.advance();
		double x = Math.random();
		if (x > .25) System.out.println("Duck: " + _circle.getCursor());
		if (x < .25) {
		    x = Math.random();
		    goose = _circle.getCursor();
		    System.out.println("Goose: " + goose);
		    System.out.println("Race between: " + it + " and " + goose);
		    if (x < .5) 
			System.out.println(goose +  " wins race.");
		    if (x > .5) {
			System.out.println(it + " wins race.");
			_circle.remove();
			_circle.add(it);
			it = goose;
		    }
		}
	    }
	}
	
    }


    public static void main(String [] args){
	String [] n = {"Abe","Cal","Jen","Eve","Pam","Vern", "Joe", "Quin", "Yuki"};
	ArrayList<String> L = new ArrayList<String>();
	for (int i = 0; i < n.length; i++)
	    L.add(n[i]);
       	DuckDuckGoose game = new DuckDuckGoose(L);
	game.play(5);
    }



}

