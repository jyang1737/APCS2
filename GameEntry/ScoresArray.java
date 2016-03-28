import java.util.ArrayList;

public class ScoresArray {
    

    private GameEntry[] _entries;
    
    public ScoresArray(int n) {
	_entries = new GameEntry[n];
	for (int i = 0; i < n; i++)
	    _entries[i] = new GameEntry();
    }

    public ScoresArray() {
	_entries = new GameEntry[10];
    }

    public int numScores() {
	return _entries.length;
    }
    
    public GameEntry topEntry() {
	return _entries[0];
    }

    public boolean add(GameEntry entry) {
	boolean topTen = false;
	int i = 0;
	for (; i < numScores(); i++) {
	    if (entry.compareTo(_entries[i]) > 0) {
		topTen = true;
		break;
	    }
	}
	if (!topTen) return false;
	_entries[numScores() - 1] = null;
	for (int j = numScores() - 2; j >= i; j--) {
	    _entries[j+1] = _entries[j];
	}
	_entries[i] = entry;
	return true;
    }

    public String toString() {
	int ctr = 1;
	String ans = "";
	ans += "Rank" + "\t" + "Initials" + "\t" + "Score" + "\n";
	for (int i = 0; i < numScores(); i++) {
	    ans += (i+1) + ".\t" + _entries[i] + "\n";
	}
	return ans;
    }

    public static void main(String[] args) {
	ScoresArray scores = new ScoresArray();
	for (int i = 0; i < 10; i++) {
	    scores.add(GameEntry.randomEntry(3,100));
	}
	System.out.println(scores);
    }

}
