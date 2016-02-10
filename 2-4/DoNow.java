public class DoNow {

    public static String withCommas(int n) {
	String lastThree = n + "";
	if (n < 1000) return lastThree;
	lastThree = lastThree.substring(lastThree.length()-3);
     	return withCommas(n/1000) + "," + lastThree;
    }

    public static void main(String[] args) {
	int n = 1034;
	System.out.println(withCommas(n));
	
    }


    
}
