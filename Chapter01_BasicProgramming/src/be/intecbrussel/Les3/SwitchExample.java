package be.intecbrussel.Les3;

public class SwitchExample {
    public static void main(String[] args) {
        int day = 4;

        switch (day) {
            case 1:
                System.out.println("Maandag");
                break;
            case 2:
                System.out.println("Dinsdag");
                break;
            case 3:
                System.out.println("Woensdag");
                break;
            case 4:
                System.out.println("Donderdag");
                break;
            case 5:
                System.out.println("Vrijdag");
                break;
            case 6:
                System.out.println("Zaterdag");
                break;
            case 7:
                System.out.println("Zondag");
                break;
            default:
                System.out.println("Dag bestaat niet");
        }


    }
}
//geen: float double boolean