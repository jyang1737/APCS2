public class Roman {
    private int _n;
    private String _numeral;
    
    //constructor
    public Roman(int n) {
	if (n <= 0 || n > 4000)
	    throw new ArithmeticException();
       	_n = n;
	_numeral = toRoman(n);
    }
    
    public String toString() {
	return _numeral;
    }

    public static String toRoman(int n) {
	
	if (n == 9) return "IX";
	if (n > 5) return "V" + toRoman(n-5);
	if (n == 4) return "IV";
	if (n <= 0) return "";
	return "I" + toRoman(n-1);
	    
    }

    public static void main(String[] args) {
	System.out.println(toRoman(3));
	System.out.println(toRoman(6));
	Roman z = new Roman(9);
	System.out.println(z);
    }
}
