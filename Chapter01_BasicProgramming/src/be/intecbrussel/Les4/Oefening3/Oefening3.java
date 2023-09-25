package be.intecbrussel.Les4.Oefening3;

public class Oefening3 {
    public static void main(String[] args) {

        //vars initialization
        String month = "December";
        int daysCount = 0;

        //check cases
        switch(month){
            case "Januari":
                daysCount = 30;
                System.out.println("Januari heeft "+daysCount+" dagen");
                break;
            case "Februari":
                daysCount = 28;
                System.out.println("Februari heeft "+daysCount+" dagen");
                break;
            case "Maart":
                daysCount = 30;
                System.out.println("Maart heeft "+daysCount+" dagen");
                break;
            case "April":
                daysCount = 31;
                System.out.println("April heeft "+daysCount+" dagen");
                break;
            case "Mei":
                daysCount = 30;
                System.out.println("Mei heeft "+daysCount+" dagen");
                break;
            case "Juni":
                daysCount = 31;
                System.out.println("Juni heeft "+daysCount+" dagen");
                break;
            case "July":
                daysCount = 30;
                System.out.println("July heeft "+daysCount+" dagen");
                break;
            case "Augustus":
                daysCount = 31;
                System.out.println("Augustus heeft "+daysCount+" dagen");
                break;
            case "September":
                daysCount = 30;
                System.out.println("September heeft "+daysCount+" dagen");
                break;
            case "Oktober":
                daysCount = 31;
                System.out.println("Oktober heeft "+daysCount+" dagen");
                break;
            case "November":
                daysCount = 30;
                System.out.println("November heeft "+daysCount+" dagen");
                break;
            case "December":
                daysCount = 31;
                System.out.println("December heeft "+daysCount+" dagen");
                break;
            default:
                System.out.println("ik ken deze maand niet!");
        }
    }
}
