public class Song extends PlaylistComponent {

    private String songName;
    private String artist;
    private float speed = 1;

    public Song(String songName, String artist ) {
        super(songName, artist);
    }

    public void setPlaybackSpeed(float speed) {
        this.speed = speed;
    }

    public String getName() {
        return this.songName;
    }

    public String getArtist() {
        return this.artist;
    }
}


