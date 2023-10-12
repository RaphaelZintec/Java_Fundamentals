package Les3;

public class ColorApp {
    public static void main(String[] args) {
        /*Color c1 = Color.RED;
        System.out.println(c1);

        Color[] cArray = Color.values();
        for(Color eColor : cArray){
            System.out.println(eColor);
        }*/

        /*
        System.out.println(Color.BLUE);
        System.out.println(Color.BLUE.getColorCode());
        System.out.println(Color.BLUE.getColorCode2());
        Color.RED.colorInfo();
        */


        Color cE = Color.BLUE;
        cE.colorInfo();
        System.out.println(cE.getColorCode());
        System.out.println(cE.getColorCode2());
        System.out.println(Color.RED.getColorCode());
        System.out.println(Color.RED.getColorCode2());
        Color.RED.colorInfo();
    }
}
