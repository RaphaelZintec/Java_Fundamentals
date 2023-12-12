package Project1;

public class Main {
    public static void main(String[] args) {

        //ik maak emojis en kleuren om better te zien

        //1. 🙍 Jerry, 90 years, age limit 100 years, cursed number 13, color green
        Person person = new Person("Jerry", 95, 2000, "🙍", 100, 13, "\u001B[42m");
        person.startLife();
        //2. 💁‍♀️ Marta, 85 years, age limit 101 years, cursed number 6, color pink
        Person person2 = new Person("Marta", 90, 1500, "💁‍♀️", 101, 6, "\u001B[45m");
        person2.startLife();
        //3. 🤠️ Billy, 32 years, age limit 45 years, cursed number 7, color blue
        Person person3 = new Person("Billy", 32, 2500, "🤠️️", 45, 7, "\u001B[44m");
        person3.startLife();
        //4. 🐻️ Misha, 8 years, age limit 20 years, cursed number 1, color yellow
        Person person4 = new Person("Misha", 8, 1700, "🐻️️", 20, 1, "\u001B[43m");
        person4.startLife();
    }
}
