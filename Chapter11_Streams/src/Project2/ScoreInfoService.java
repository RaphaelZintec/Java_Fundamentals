package Project2;

import java.util.Arrays;

public class ScoreInfoService {
    private ScoreInfo[] scoreData;
    public long numberOfStudents;

    public ScoreInfoService(){}

    public void addScoreInfo(ScoreInfo[] scoreData){
        this.scoreData = scoreData;
    }
    public int getNumberOfStudents(){
        return (int)Arrays.stream(scoreData).count();
    }
    public void calculateAverageScore(){}
    public long filterScore(){return 0;}
    private String[] getFailedStudents(){return null;}
    public void printFailingStudents(){}
    public void getDataSortedByLastName(){}
    public void getDataSortedByScore(){}
}
