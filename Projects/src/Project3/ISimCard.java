package Project3;

public interface ISimCard {
    default void startCall(String number){
        System.out.println("Calling 911");
    }
    default void endCall(){
        System.out.println("Call ended");
    }
}
