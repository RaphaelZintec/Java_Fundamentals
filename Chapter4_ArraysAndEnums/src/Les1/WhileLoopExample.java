
package Les1;

public class WhileLoopExample {
    public static void main(String[] args) {
        int[] myArray = {2,4,6,8,10};
        int index = 0;
        while(index < myArray.length){
            System.out.println(myArray[index]);
            ++index;
        }
    }
}
