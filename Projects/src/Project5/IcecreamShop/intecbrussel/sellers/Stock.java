package Project5.IcecreamShop.intecbrussel.sellers;

import java.util.HashMap;
import java.util.Map;

public class Stock {
    //ATTRIBUTES
    private int iceRockets;
    private int cones;
    private int balls;
    private int magni;
    private Map<Enum, Integer> magniMap = new HashMap<>();
    private Map<Enum, Integer> ballsMap = new HashMap<>();

    //CONSTRUCTORS
    public Stock(){}
    public Stock(int iceRockets, int cones, int balls, int magni) {
        this.iceRockets = iceRockets;
        this.cones = cones;
        this.balls = balls;
        this.magni = magni;
    }
    public Stock(int iceRockets, int cones, Map<Enum, Integer> ballsMap, Map<Enum, Integer> magniMap) {
        this.iceRockets = iceRockets;
        this.cones = cones;
        this.ballsMap = ballsMap;
        this.magniMap = magniMap;
    }

    //METHODS
    public int getIceRockets() {
        return iceRockets;
    }

    public void setIceRockets(int iceRockets) {
        this.iceRockets = iceRockets;
    }

    public int getCones() {
        return cones;
    }

    public void setCones(int cones) {
        this.cones = cones;
    }

    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public int getMagni() {
        return magni;
    }

    public void setMagni(int magni) {
        this.magni = magni;
    }

    public Map<Enum, Integer> getMagniMap() {
        return magniMap;
    }

    public Map<Enum, Integer> getBallsMap() {
        return ballsMap;
    }

    @Override
    public String toString() {
        return "Stock {" +
                "iceRockets = " + iceRockets +
                ", cones = " + cones +
                '}'+
                "\n\tStock Balls  = " + (ballsMap.isEmpty() ? balls : ballsMap) +
                "\n\tStock Magnum = " + (magniMap.isEmpty() ? magni : magniMap)
                ;
    }
}
