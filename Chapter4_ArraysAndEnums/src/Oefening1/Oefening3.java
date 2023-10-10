package Oefening1;

public class Oefening3 {
    public static void main(String[] args) {
        int array1[] = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i<array1.length; ++i){
            if(array1[i]%2==0){
                System.out.println(array1[i]+" is Even");
            }
            else{
                System.out.println(array1[i]+" is Oneven");
            }
        }
    }
}
