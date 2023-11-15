package Project4_Streams.Project2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ScoreInfoService {
    private List<ScoreInfo> scoreData = new ArrayList<>();
    public long numberOfStudents;

    public ScoreInfoService(){}

    public void addScoreInfo(ScoreInfo scoreData){
        this.scoreData.add(scoreData);
    }
    public long getNumberOfStudents(){
        return numberOfStudents = this.scoreData.stream().count();
    }
    public void calculateAverageScore(){
        System.out.println(
                scoreData.stream()
                        .mapToInt(n->n.getScore())
                        .average()
                        .orElse(0.0)
        );
    }
    public long filterScore(){
        return scoreData.stream()
                .filter(n->n.getScore()>=90)
                .count();
    }
    private String[] getFailedStudents(){
        return scoreData.stream()
                .filter(n->n.getScore()<60)
                .map(n->n.getStudent().getName()+" "+n.getStudent().getLastName())
                .toArray(String[]::new);
    }
    public void printFailingStudents(){
        Arrays.stream(getFailedStudents()).forEach(System.out::println);
    }
    public void getDataSortedByLastName(){
        scoreData.stream()
                .sorted(Comparator.comparing(n->n.getStudent().getLastName()))
                .map(n->n.getStudent().getName()+" "+n.getStudent().getLastName()+" "+n.getScore())
                .forEach(System.out::println);
    }
    public void getDataSortedByScore(){
        scoreData.stream()
                .sorted(Comparator.comparing(n->n.getScore()))
                .map(n->n.getStudent().getName()+" "+n.getStudent().getLastName()+" "+n.getScore())
                .forEach(System.out::println);
    }
}
