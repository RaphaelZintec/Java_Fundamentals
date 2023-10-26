package Project1.audioplayer.mediaplayer;

import Project1.audioplayer.advancedmediaplayer.AdvancedMediaPlayer;
import Project1.audioplayer.advancedmediaplayer.Mp4Player;
import Project1.audioplayer.advancedmediaplayer.VlcPlayer;

public class MediaAdapter implements MediaPlayer {

    //ATTRIBUTE
    private AdvancedMediaPlayer advancedMediaPlayer;

    //CONSTRUCTOR
    public MediaAdapter(String audioType){
        if(audioType.equals("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
        else if (audioType.equals("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        }
    }

    //METHODS
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equals("mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }
        else {
            advancedMediaPlayer.playVlc(fileName);
        }
    }
}
