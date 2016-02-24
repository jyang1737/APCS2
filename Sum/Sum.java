public class Sum {
    
    //precondition: n > 0
    //postcondition: returns 1+2+3....+n

    //Explicit version
    public static int sum(int n) {
	return n * (n+1) / 2;
    }

    //Iterative version: uses loop
    public static int sumI(int n) {
	int sum = 0;
	for (int i = 1; i <= n; i++) 
	    sum += i;
	return sum;
    }

    public static int sumR(int n) {
	if (n > 1) return sumR(n-1) + n;
	return 1;
    }
    
    // precondition: a,d,n are positive ints
    // postcondition: a + (a + d) + ... (a + (n-1) d)

    public static int sum(int a, int d, int n) {
	return n * (2 * a + (n - 1) * d) / 2;
    }

    public static int sumI(int a, int d, int n) {
	int sum = 0;
	for (int i = 0; i < n; i++) {
	    sum += (a + i * d);
	}
	return sum;
    }
	
    public static int sumR(int a, int d, int n) {
	if (n == 1) return a;
	return a + (n - 1 ) * d + sumR(a,d,n-1);
    }	

    public static void main(String[] args) {
	int x, y, z;
	x = sum(1,2,3);
	y = sumI(1,2,3);
	z = sumR(1,2,3);
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
		
    }
}
