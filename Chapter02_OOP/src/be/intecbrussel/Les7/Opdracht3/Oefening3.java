package be.intecbrussel.Les7.Opdracht3;

import java.util.Random;

public class Oefening3 {
    public static void main(String[] args) {
        int myExperience = 0;
        int monsterXpPoint = 0;
        int numberOfKilledMonsters = 0;
        Random random = new Random();

        for(int i = 1; i<=10 && myExperience <= 15; ++i){
            monsterXpPoint = random.nextInt(3)+1;
            switch (monsterXpPoint){
                case 1:
                    break;
                case 2:
                    myExperience += monsterXpPoint;
                    break;
                case 3:
                    myExperience += monsterXpPoint;
                    break;
            }
            numberOfKilledMonsters =i;
        }

        System.out.println("Congradulation you reached the level "+myExperience);
        System.out.println("You killed "+numberOfKilledMonsters+" monsters");

    }
}
