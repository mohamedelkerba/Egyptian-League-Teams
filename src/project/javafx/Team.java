package project.javafx;

public class Team {
    private String name;
    private int rank;
    private int points;
    private int matchesPlayed;
    private String imagePath;

    public Team(String name, int rank, int points, int matchesPlayed, String imagePath) {
        this.name = name;
        this.rank = rank;
        this.points = points;
        this.matchesPlayed = matchesPlayed;
        this.imagePath = imagePath;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    public int getPoints() {
        return points;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public String getImagePath() {
        return imagePath;
    }
}
