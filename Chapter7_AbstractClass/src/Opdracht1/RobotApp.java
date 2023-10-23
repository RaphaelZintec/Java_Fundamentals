package Opdracht1;

public class RobotApp {
    public static void main(String[] args) {

        //INIT
        BendingRobot robot1 = new BendingRobot("Peter", 50);
        LiftingRobot robot2 = new LiftingRobot("Duck", 50);
        CrazyRobot robot3 = new CrazyRobot(new StringBuilder("Kilian"));

        //TEST WITH 0
        System.out.println();
        robot1.bend(0);
        robot2.lift(0);

        //TEST WITH GOOD VALUE
        System.out.println();
        robot1.bend(10);
        robot2.lift(10);

        //TEST WITH VALUE HIGHER THAN MAX
        System.out.println();
        robot1.bend(100);
        robot2.lift(100);

        //TOSTRING()
        System.out.println();
        System.out.println(robot1.toString());
        System.out.println(robot2.toString());
        System.out.println(robot3.toString());
    }
}
