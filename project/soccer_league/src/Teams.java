public class Teams {
    private String teamName;
    private int score;
    private int points;

    public Teams(String teamName, int score) {
        this.teamName = teamName;
        this.score = score;
    }
    public String getTeamName() {
        return teamName;
    }
    public int getScore() {
        return score;
    }
    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
