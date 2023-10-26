package Project1.audioplayer;

import Project1.audioplayer.mediaplayer.*;

public class AdapterPatternMain {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3".toLowerCase(), "beyond the horizon.mp3");
        audioPlayer.play("mp4".toLowerCase(), "alone.mp4");
        audioPlayer.play("VLC".toLowerCase(), "far far away.vlc");
        audioPlayer.play("avi".toLowerCase(), "mind me.avi");
    }
}
