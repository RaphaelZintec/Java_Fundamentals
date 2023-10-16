package Oefening6.Oefening3;

public enum HolidayDestination {
    FRANCE,BELGIUM,ITALY,RUSSIA,TURKEY,ISRAEL,USA,POLAND,CHINA,IRAN;

    public void foodSpeciality(){
        switch (this){
            case FRANCE:
                System.out.println("Croissant");
                break;
            case BELGIUM:
                System.out.println("Friten");
                break;
            case ITALY:
                System.out.println("Pizza");
                break;
            case RUSSIA:
                System.out.println("Pelmenia");
                break;
            case TURKEY:
                System.out.println("Kebab");
                break;
            case ISRAEL:
                System.out.println("Shaworma");
                break;
            case USA:
                System.out.println("Hamburger");
                break;
            case POLAND:
                System.out.println("Vodka");
                break;
            case CHINA:
                System.out.println("Noodle");
                break;
            case IRAN:
                System.out.println("Houmous");
                break;
        }
    }

}
