import java.util.List;

public class PlaylistComponent {
    public String componentName;
    public String artist = "";
    public float speed = 1;
    public String tab = "";

    public PlaylistComponent(String componentName, String artist) {
        this.componentName = componentName;
        this.artist = artist;
    }

    public void add(PlaylistComponent component) {}
    public void remove(PlaylistComponent component) {}
    public void play(PlaylistComponent component) {
    }
    public void setPlaybackSpeed(float speed) {

    }
    public List<PlaylistComponent> getPlaylist() { return null; }

}
