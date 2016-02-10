import java.util.ArrayList;

public class RomanApp {
    //precondition: size > 0, 
    //postcondition: returns a list with size elements
    //each element is a random roman object whose value is in [lower, upper)
    public static ArrayList<Roman> populate(int size, int lower, int upper) {
	ArrayList<Roman> x = new ArrayList<Roman>();
	for (int i = 0; i < size; i++) {
	    int r = (int) (Math.random() * (upper-lower)) + lower;
	    x.add(new Roman(r));
	}
	return x; 
	
    }

    public static Roman min(ArrayList<Roman> L) {
	int pos = 0;
	for (int i = 1; i < L.size(); i++) {
	    if (L.get(pos).compareTo(L.get(i)) > 0) 
		pos = i;
	}
	return L.get(pos);
    }

    public static Roman sum(ArrayList<Roman> L) {
	int ans = 0;
	for (Roman x: L)
	    ans += x.intValue();
	return new Roman(ans);
    }
    
    public static ArrayList<Roman> filterEvens(ArrayList<Roman> L) {
	ArrayList<Roman> even = new ArrayList<Roman>();
	for (Roman x: L) {
	    if (x.intValue() % 2 == 0) even.add(x);
	}
	return even;
    }

    public static void mapAdd(int n, ArrayList<Roman> L) {
	for (int i = 0; i < L.size(); i++) {
	    L.set(i, new Roman((L.get(i)).intValue() + n));
	} 
    }

    public static void main(String[] args) {
	ArrayList<Roman> romans = populate(5,2,10);
	System.out.println(romans);
	Number minValue = min(romans);
	System.out.println("min: " + minValue + " int: " + minValue.intValue());
	Number total = sum(romans);
	System.out.println("sum: " + total + " int: " + total.intValue());
	ArrayList<Roman> something = filterEvens(romans);
	System.out.println(something);
	System.out.println(romans);
	mapAdd(1,romans);
	System.out.println(romans);
    }
}
