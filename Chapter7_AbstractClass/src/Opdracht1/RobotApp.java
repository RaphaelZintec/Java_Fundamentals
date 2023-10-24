package Opdracht1;

public class RobotApp {
    public static void main(String[] args) {

        //INIT
        BendingRobot bendingRobot = new BendingRobot("Wall-E", 360);
        LiftingRobot liftingRobot = new LiftingRobot("R2-D2", 50);
        CrazyRobot   crazyRobot   = new CrazyRobot(new StringBuilder("C-3PO"));

        //TEST WITH GOOD VALUE
        System.out.println();
        bendingRobot.bend(90);
        liftingRobot.lift(40);

        //TEST WITH VALUE HIGHER THAN MAX
        System.out.println();
        bendingRobot.bend(360);
        liftingRobot.lift(100);

        //TOSTRING()
        System.out.println();
        System.out.println(bendingRobot.toString());
        System.out.println(liftingRobot.toString());
        System.out.println(crazyRobot.toString());
    }
}
