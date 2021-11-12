import java.util.ArrayList;
import java.util.List;

public class Playlist extends PlaylistComponent {
    public String playlistName;
    public List<PlaylistComponent> playlist = new ArrayList<>();

    public Playlist(String name) {
        super(name, "");
    }

    @Override
    public void add(PlaylistComponent component) {
        this.playlist.add(component);
    }

    @Override
    public void remove(PlaylistComponent component) {
        this.playlist.remove(component);
    }

    public List<PlaylistComponent> getPlaylist() {
        return this.playlist;
    }

    @Override
    public void play(PlaylistComponent component) {
        System.out.println(component.tab + "playlist: " + component.componentName);
        component.tab += "\t";
        for(PlaylistComponent item : component.getPlaylist()) {
            if (item.getPlaylist() != null) {
                play(item);
            } else {
                System.out.println(component.tab + item.componentName + ", " + item.artist +
                        "\n\t" + "  --" + item.speed);
            }
        }
    }

    public void setPlaybackSpeed(float speed) {
        for(PlaylistComponent component : this.playlist){
            component.setPlaybackSpeed(speed);
        }
    }

    public String getPlaylistName() {
        return this.playlistName;
    }
}
