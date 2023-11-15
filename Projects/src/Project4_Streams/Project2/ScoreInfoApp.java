
package Project4_Streams.Project2;

public class ScoreInfoApp {
    public static void main(String[] args) {
        //CREATE STUDENTS
        Student student1 = new Student("Marc",  "Jacobs");
        Student student2 = new Student("Hugo",  "Boss");
        Student student3 = new Student("Ralph", "Lauren");
        Student student4 = new Student("Tom",   "Ford");
        Student student5 = new Student("Calvin","Klein");
        Student student6 = new Student("Tommy", "Hilfiger");
        Student student7 = new Student("Max",   "Mara");

        //CREATE SCORE FOR STUDENTS
        ScoreInfo studentWithScore1 = new ScoreInfo(91, student1);
        ScoreInfo studentWithScore2 = new ScoreInfo(89, student2);
        ScoreInfo studentWithScore3 = new ScoreInfo(95, student3);
        ScoreInfo studentWithScore4 = new ScoreInfo(98, student4);
        ScoreInfo studentWithScore5 = new ScoreInfo(82, student5);
        ScoreInfo studentWithScore6 = new ScoreInfo(55, student6);
        ScoreInfo studentWithScore7 = new ScoreInfo(28, student7);

        System.out.println("###SHOW STUDENTS WITH ID NAME AND SCORE WITH toString()###\n"+studentWithScore1+"\n"+studentWithScore2+"\n"+studentWithScore3+"\n"+studentWithScore4+"\n"+studentWithScore5+"\n"+studentWithScore6+"\n"+studentWithScore7);

        //ADD STUDENTS AND SCORES HERE
        ScoreInfoService scoreInfoService = new ScoreInfoService();
        scoreInfoService.addScoreInfo(studentWithScore1);
        scoreInfoService.addScoreInfo(studentWithScore2);
        scoreInfoService.addScoreInfo(studentWithScore3);
        scoreInfoService.addScoreInfo(studentWithScore4);
        scoreInfoService.addScoreInfo(studentWithScore5);
        scoreInfoService.addScoreInfo(studentWithScore6);
        scoreInfoService.addScoreInfo(studentWithScore7);

        /*STREAMS*/
        System.out.println("\n---NUMBER OF STUDENTS---");
        System.out.println(scoreInfoService.getNumberOfStudents());

        System.out.println("\n---AVERAGE SCORE---");
        scoreInfoService.calculateAverageScore();

        System.out.println("\n---NUMBER OF STUDENTS WITH SCORE +90---");
        System.out.println(scoreInfoService.filterScore());

        System.out.println("\n---NAMES OF STUDENTS WITH SCORE -60---");
        scoreInfoService.printFailingStudents();

        System.out.println("\n---SORT * STUDENTS WITH NAME AND SCORE : ORDER LAST NAME ASC---");
        scoreInfoService.getDataSortedByLastName();

        System.out.println("\n---SORT * STUDENTS WITH NAME AND SCORE : ORDER SCORE ASC---");
        scoreInfoService.getDataSortedByScore();


    }
}
