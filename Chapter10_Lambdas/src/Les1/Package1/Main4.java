package Les1.Package1;

public class Main4 {
    public static void main(String[] args) {

        MInterface ref = (str) -> {
            String result = "";
            for(int i = str.length()-1; i >= 0; i--){
                result += str.charAt(i);
            }
            return result;
        };
        System.out.println(ref.reverse("lambda"));
    }
}
