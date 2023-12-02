package Project5.IcecreamShop.intecbrussel.sellers;



import Project5.IcecreamShop.intecbrussel.eatables.*;

import Project5.IcecreamShop.intecbrussel.sellers.*;

import java.util.ArrayList;
import java.util.Arrays;

public class IceCreamCar implements IceCreamSeller{
    //ATTRIBUTES
    private PriceList priceList;
    private Stock stock;
    private double profit;

    //CONSTRUCTORS
    public IceCreamCar(){}
    public IceCreamCar(PriceList priceList, Stock stock) {
        this.priceList = priceList;
        this.stock = stock;
    }

    //METHODS
    @Override
    public Cone orderCone(Cone.Flavor[] balls){
        //Cone cone = prepareCone(balls);
        Cone cone = prepareConeMap(balls);
        if(cone != null){
            profit += (priceList.getBallPrice() * 0.25) * balls.length;
        }
        return cone;
    }
    private Cone prepareCone(Cone.Flavor[] balls) {
        if (stock.getCones()>0 && stock.getBalls()>=balls.length) {
            stock.setCones(stock.getCones()-1);
            stock.setBalls(stock.getBalls()-balls.length);
            return new Cone(balls);
        }
        else if(stock.getCones()==0 && stock.getBalls()<balls.length)
            System.out.println("NO MORE CONES AND NOT ENOUGH BALLS FOR YOUR ICE CREAM");
        else if(stock.getCones()==0)
            System.out.println("NO MORE CONES FOR YOUR ICE CREAM");
        else if(stock.getBalls()<balls.length)
            System.out.println("NOT ENOUGH BALLS FOR YOUR ICE CREAM");
        return null;
    }
    private Cone prepareConeMap(Cone.Flavor[] balls) {
        ArrayList<Cone.Flavor> ballsUpdate = new ArrayList<>();
        if (stock.getCones()>0) {
            Arrays.stream(balls).forEach(n-> {
                    if(stock.getBallsMap().get(n) > 0){
                        stock.getBallsMap().put(n, stock.getBallsMap().get(n)-1);
                        ballsUpdate.add(n);
                    }
                    else {
                        System.out.println("NO MORE "+n+" BALLS FOR YOUR ICE CREAM");
                    }
            }
            );
            stock.setCones(stock.getCones()-1);
            return new Cone(ballsUpdate.stream().toArray(Cone.Flavor[]::new));
        }
        else
            System.out.println("NO MORE CONES FOR YOUR ICE CREAM");
        return null;
    }

    @Override
    public IceRocket orderIceRocket(){
        IceRocket iceRocket = prepareIceRocket();
        if(iceRocket != null){
            profit += priceList.getRocketPrice() * 0.20;
        }
        return iceRocket;
    }
    private IceRocket prepareIceRocket() {
        if (stock.getIceRockets()>0) {
            stock.setIceRockets(stock.getIceRockets()-1);
            return new IceRocket();
        }
        else
            System.out.println("NO MORE ROCKET ICE CREAM");
        return null;
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumType){
        //Magnum magnum = prepareMagnum(magnumType);
        Magnum magnum = prepareMagnumMap(magnumType);
        if(magnum != null){
            profit += priceList.getMagnumPrice(magnumType) * 0.01;
            return magnum;
        }
        return null;
    }
    private Magnum prepareMagnum(Magnum.MagnumType magnumType){
        if (stock.getMagni()>0) {
            stock.setMagni(stock.getMagni()-1);
            return new Magnum(magnumType);
        }
        else
            System.out.println("NO MORE MAGNUM ICE CREAM");
        return null;
    }
    private Magnum prepareMagnumMap(Magnum.MagnumType magnumType){
        if (stock.getMagniMap().get(magnumType)>0) {
            stock.getMagniMap().put(magnumType, stock.getMagniMap().get(magnumType)-1);
            return new Magnum(magnumType);
        }
        else
            System.out.println("NO MORE MAGNUM ICE CREAM");
        return null;
    }

    @Override
    public double getProfit() {
        return profit;
    }

    @Override
    public String toString() {
        return "IceCreamCar {" +
                "\n\t" + priceList.toString() +
                "\n\t" + stock +
                "\n\tProfit = " + profit +
                "\n}";
    }
}
