package Project3;

import java.sql.SQLOutput;

public class DummyPhone implements ISimCard, IRadio{
    @Override
    public void playChannel(double fm) {
        System.out.println("Radio playing channel "+fm);
    }

    @Override
    public void changeChannel(double fm) {
        System.out.println("Radio channel changed to "+fm);
    }

    @Override
    public void startCall(String number) {
        System.out.println("Calling "+number);
    }

    public void showSpecs(){
        startCall("0455 66 55 33");
        endCall();
        playChannel(55.77);
        changeChannel(44.55);
    }

}
