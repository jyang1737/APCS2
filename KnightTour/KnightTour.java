public class KnightTour{

    private int[][] _board;
    private int _n;

    public KnightTour(){
	_board = new int[8][8];
	_n = 0;
    }
    
    public KnightTour(int n){
	_board = new int[n][n];
	_n = 0;
    }

    public void solve(){
	int N = _board.length;
	for (int i = 0; i <= N / 2; i++)
	    for (int j = 0; j <= N / 2; j++)
		if (solve(i,j)){
		    // System.out.println(this);
		    return;
		    //	    _board = new int[N][N];
		    // _n = 0;
		}
	
    }
    // precondition: _n < N*N
    public boolean solve(int x, int y){
	try {
	    Thread.sleep(10);                 //1000 milliseconds is one second.
	} catch(InterruptedException ex) {
	    Thread.currentThread().interrupt();
	}
	int N = _board.length;
	// check if out of bounds
	if (x < 0 || y < 0) return false;
	if (x >= N || y >= N) return false;
	// check if position is occupied
	if (_board[x][y] != 0) return false;
	// occupy position
	_board[x][y] = ++ _n;
	// is it solved?
	if (_n  == N*N) return true;
	System.out.println(this);
	// if not solved, continue down each path
	if (solve(x-2, y-1)) return true;
	if (solve(x-2, y+1)) return true;
	if (solve(x-1, y+2)) return true;
	if (solve(x+1, y+2)) return true;
	if (solve(x+2, y+1)) return true;
	if (solve(x+2, y-1)) return true;
	if (solve(x+1, y-2)) return true;
	if (solve(x-1, y-2)) return true;
	
	// No solution found, back track
	_board[x][y] = 0;
       	System.out.println(this);	
	_n--;
	return false;
    }

    public String toString(){
	String ans = "";
	int N = _board.length;
	for (int i = 0; i < N; i++){
	    for (int j = 0; j < N; j++){
		ans += (_board[i][j] + "  ").substring(0,("N*N".length()));
	    }
	    ans += "\n";
	}
	return ans;
    }

    public static void main(String [] args){
	int N = Integer.parseInt(args[0]);
	//	for (int i = 1; i <= N; i++){
	KnightTour t = new KnightTour(N);
	// System.out.println(t);
	t.solve();
	System.out.println(t);
	//}

    }


    
}
