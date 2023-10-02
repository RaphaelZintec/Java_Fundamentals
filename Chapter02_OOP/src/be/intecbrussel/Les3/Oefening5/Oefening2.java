package be.intecbrussel.Les3.Oefening5;
import java.util.Random;
public class Oefening2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] tabNumbers = {0,0,0,0,0,0};
        int number = 0;

        for(int i = 0; i<tabNumbers.length; ++i){
            number = random.nextInt(46);
            if(tabNumbers[0] != number && tabNumbers[1] != number && tabNumbers[2] != number && tabNumbers[3] != number && tabNumbers[4] != number && tabNumbers[5] != number){
                tabNumbers[i] = number;
                System.out.println((i+1)+". "+tabNumbers[i]);
            }
            else{
                --i;
            }
        }
    }
}
