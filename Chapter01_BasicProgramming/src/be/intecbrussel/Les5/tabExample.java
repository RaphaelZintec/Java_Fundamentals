package be.intecbrussel.Les5;

public class tabExample {
    public static void main(String[] args) {
        int[] tab = {5,10,15};
        tab[0] = 2;
        for(int i=0;i < tab.length; ++i){
            System.out.println(tab[i]);
        }

        for(int i : tab){
            System.out.println(i);
        }

    }
}
