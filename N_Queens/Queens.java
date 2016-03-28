public class Queens{

    private int [] [] _board;
    private int _size;

    public Queens(){
	_size = 8;
	_board = new int[_size][_size];
    }

    public Queens (int n){
	_size = n;
	_board = new int[_size][_size];
    }


    // post : returns true if no non-zeros are encountered
    public boolean scan(int r, int c, int dr, int dc){
	r += dr;
	c += dc;
	if (r < 0 || r >= _size) return true;
	if (c < 0 || c >= _size) return true;
	if (_board[r][c] != 0) return false;
	return scan(r,c,dr,dc);
    }

    public boolean columnSafe(int r,int c){
	return scan(r,c,-1,0);
    }
    public boolean diagonalSafe(int r, int c){
   	return  scan(r,c,-1,-1) &&  scan(r,c,-1,1) ; 
    }
    public boolean safe(int r, int c){
	return columnSafe(r,c) && diagonalSafe(r,c);
    }


    
    

    public void solve(){
	solve(0,0);
    }

    public boolean solve(int r , int c){
	try {
            Thread.sleep(100);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

	if (c >= _size) return false;
	if (r > _size - 1) return true;
	if (!safe(r,c)) return solve(r,c+1); 
	_board[r][c] = 1;
	System.out.println(this);
	if (solve(r+1,0)) return true;
	_board[r][c] = 0;
	System.out.println(this);	
	return solve(r,c+1);
    }



    public String toString(){
	String ans = "";
	for (int i = 0; i < _size; i++){
	    for (int j = 0; j < _size; j++){
		if (_board[i][j] == 0) ans += " - ";
		else ans += " Q ";

	    }
	    ans +="\n";
	}
	return ans;
    }


    public static void main (String [] args){
	int N = Integer.parseInt(args[0]);
	Queens q = new Queens(N);
	//System.out.println(q);
	q.solve();
	System.out.println(q);
    }

}
