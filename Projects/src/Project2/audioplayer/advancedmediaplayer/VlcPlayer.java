package Project2.audioplayer.advancedmediaplayer;

public class VlcPlayer implements AdvancedMediaPlayer{
    //METHODS
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
