package Oefening2Planeten;

public class MainApp {
    public static void main(String[] args) {
        Zon zon = new Zon(696_340);
        Aarde aarde = new Aarde(6_371);
        Maan maan = new Maan(1_737);

        System.out.println(zon.getOmtrek());
        System.out.println(aarde.getOmtrek());
        System.out.println(maan.getOmtrek());

        System.out.println(zon.getRadius());
        System.out.println(aarde.getRadius());
        System.out.println(maan.getRadius());

    }
}
