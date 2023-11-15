package Project4_Streams.Project2;

public class ScoreInfo {
    private int score;
    private Student student;

    public ScoreInfo(int score, Student student) {
        this.score = score;
        this.student = student;
    }

    public int getScore() {
        return score;
    }

    public Student getStudent() {
        return student;
    }

    @Override
    public String toString() {
        return "ScoreInfo{" +
                "score=" + score +
                ", student=" + student +
                '}';
    }
}
