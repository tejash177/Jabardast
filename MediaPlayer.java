package Project;

public class MediaPlayer {
    private boolean isPlaying = false;

    public void play() {
        if (!isPlaying) {
            System.out.println("Playing media...");
            isPlaying = true;
        } else {
            System.out.println("Media is already playing.");
        }
    }

    public void pause() {
        if (isPlaying) {
            System.out.println("Pausing media...");
            isPlaying = false;
        } else {
            System.out.println("No media is playing to pause.");
        }
    }

    public void stop() {
        if (isPlaying) {
            System.out.println("Stopping media...");
            isPlaying = false;
        } else {
            System.out.println("No media is playing to stop.");
        }
    }
}
