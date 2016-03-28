public class GameEntry implements Comparable<GameEntry>{

    private String _name;
    private int _score;

    public GameEntry() {
	_name = "AAA";
	_score = 0;
    }


    public GameEntry(String name, int score) {
	_name = name;
	_score = score;
    }


    public int getScore() {
	return _score;
    }

    public String getName() {
	return _name;
    }


    public int compareTo(GameEntry rhs) {
	int ans = getScore() - rhs.getScore();
	if (ans == 0)
	    ans = getName().compareTo(rhs.getName());
	return ans;
    }

    public static int randomScore(int max) {
	return (int)(Math.random() * max);
    }

    public static String randomInitials(int len) {
	String ans = "";
	String letters[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T","U", "V", "W", "X", "Y", "Z"};
	for (int i = 0; i < len; i++) {
	    ans += letters[(int)(Math.random() * 26)];
	}
	return ans;
    }

    public static GameEntry randomEntry(int len, int maxScore) {
	return new GameEntry(randomInitials(len), randomScore(maxScore));
    }

    public String toString() {
	return _name + ".........." + _score;
    }


    public static void main(String [] args) {
	GameEntry a = new GameEntry("Abe" ,0);
	GameEntry b = new GameEntry();
	System.out.println("a = " + a);
	System.out.println("b = " + b);
	System.out.println("a compared to b: " + a.compareTo(b));
	GameEntry c = GameEntry.randomEntry(3,2000);
	System.out.println("c = " + c);
    }



}
