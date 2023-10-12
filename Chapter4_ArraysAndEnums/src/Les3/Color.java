package Les3;

public enum Color {
    RED(100,200), YELLOW(200,500), BLUE(300,500);

    private int colorCode;
    private int colorCode2;

    private Color(int colorCode, int colorCode2){
        this.colorCode = colorCode;
        this.colorCode2 = colorCode2;
    }

    int getColorCode(){
        return colorCode;
    }
    int getColorCode2(){
        return colorCode2;
    }

    public void colorInfo(){
        System.out.println("Universal Color");
    }
}

