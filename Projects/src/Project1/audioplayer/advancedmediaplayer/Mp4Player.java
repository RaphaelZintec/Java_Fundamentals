package Project1.audioplayer.advancedmediaplayer;

public class Mp4Player implements AdvancedMediaPlayer{
    //METHODS
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
