package Les3;

public class LevelApp {
    public static void main(String[] args) {
        Level lvl = Level.MEDIUM;

        switch (lvl){
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
    }
}
