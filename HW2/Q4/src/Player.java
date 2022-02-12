public class Player {
    private String name;
    private int score;

    //Constructor
    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // Getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
