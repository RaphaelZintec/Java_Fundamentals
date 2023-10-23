package Oefening2Planeten;

public class Zon extends Planet{
    public Zon(double radius) {
        super(radius);
    }


    @Override
    public String getOmtrek() {
        return "Omtrek van de zon in kilometers is: "+omtrek;
    }

    @Override
    public String getRadius() {
        return "Radius van de zon in kilometers is: "+RADIUS;
    }
}
