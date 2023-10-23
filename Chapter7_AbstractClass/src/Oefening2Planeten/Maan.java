package Oefening2Planeten;

public class Maan extends Planet{
    public Maan(double radius){
        super(radius);
    }

    @Override
    public String getOmtrek() {
        return "Omtrek van de maan in kilometers is: "+omtrek;
    }

    @Override
    public String getRadius() {
        return "Radius van de maan in kilometers is: "+RADIUS;
    }
}
