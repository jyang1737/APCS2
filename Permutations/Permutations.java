public class Permutations {
    
    //precondition : str != null
    //postcondition: permutations("abc")
    //abc
    //acb
    //bac
    //bca
    //cab
    //cba
    //Interface
    public static void permutations(String str) {
	pH(str,"");
    }

    private static void pH(String str, String ans) {
	if (str.length() == 0) System.out.println(ans);
	else {
	    for (int i = 0; i < str.length(); i++) {
		pH(str.substring(0,i) + str.substring(i+1), ans + str.substring(i,i+1));
	    }
	}
    }
    
    public static void main(String[] args) {
	permutations(args[0]);
    }
}
