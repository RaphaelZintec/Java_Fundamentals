package Project1.audioplayer.mediaplayer;

public class AudioPlayer implements MediaPlayer {

    //ATTRIBUTE
    private MediaAdapter mediaAdapter;

    //METHODS
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equals("mp3")){
            System.out.println("Playing mp3 file. Name: "+ fileName);
        }
        else if (audioType.equals("mp4") || audioType.equals("vlc")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }
        else{
            System.out.println("Invalid media. avi format not supported.");
        }
    }
}
