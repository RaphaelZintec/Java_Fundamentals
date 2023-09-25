package be.intecbrussel.Les3.Oefening2;

public class Oefening3 {
    public static void main(String[] args) {
        byte aNum = 10;
        int bNum = 5;
        long cNum = 5L;

        System.out.println("aNum = " + aNum + ", bNum = " + bNum + ", cNum = " + cNum);
        System.out.println("aNum == bNum: " + (aNum==bNum) );
        System.out.println("aNum != cNum: " + (aNum!=cNum) );
        System.out.println("bNum >= aNum: " + (bNum>=aNum) );
        System.out.println("bNum <= cNum: " + (bNum<=cNum) );
        System.out.println("cNum < aNum: "  + (cNum<aNum) );
        System.out.println("cNum > bNum: "  + (cNum>bNum) );
    }
}
