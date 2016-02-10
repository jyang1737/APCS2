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

    public static void main(String[] args) {
	int x, y, z;
	x = sum(3);
	y = sumI(3);
	z = sumR(3);
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
		
    }
}
