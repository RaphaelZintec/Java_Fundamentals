package Oefening2Planeten;

public class Aarde extends Planet{
    public Aarde(double radius) {
        super(radius);
    }

    @Override
    public String getOmtrek() {
        return "Omtrek van de aarde in kilometers is: "+omtrek;
    }

    @Override
    public String getRadius() {
        return "Radius van de aarde in kilometers is: "+RADIUS;
    }
}
