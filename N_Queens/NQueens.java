public class NQueens {
    
    private int[][] _board; 
    //private String[][] _board;
    private int _size;

    public NQueens() {
	_size = 8;
	_board = new int[_size][_size];
    }

    public NQueens(int n) {
	_size = n;
	_board = new int[_size][_size];
    }
    
    public String toString() {
	String ans = "";
	int n = _board.length;
	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < n; j++) {
		ans += (_board[i][j] + "");
	    }
	    ans += "\n";
	}
	return ans;
    }
    
    public void solve() {
	int N = _board.length;
	for (int i = 0; i <= N; i++) {
	    if (solve(i)) return;
	}
    }

    public boolean solve(int x) {
	int n = _board.length;
	if (
    }

    public static void main(String[] args) {
	int N = Integer.parseInt(args[0]);
	NQueens x = new NQueens(N);
	System.out.println(x);
    }

}
