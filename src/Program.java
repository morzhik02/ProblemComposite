import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        PlaylistComponent favoriteMusic = new Playlist("Favorites")
                        , qPopPlaylist = new Playlist("Q-Pop")
                        , qPopSong1 = new Song("Kiss", "Moonlight")
                        , qPopSong2 = new Song("Darumen", "EQ")
                        , singleSong1 = new Song("Boyfriend", "JustinBieber");

        qPopPlaylist.add(qPopSong1);
        qPopPlaylist.add(qPopSong2);
        favoriteMusic.add(qPopPlaylist);
        favoriteMusic.add(singleSong1);

        favoriteMusic.play(favoriteMusic);


        /*PlaylistComponent favoriteMusic = new Playlist("Favorites");
        PlaylistComponent playlistComponent = null;
        PlaylistComponent song1 = null;
        List<String> descriptionSongForPlaylist = null;
        List<String> descriptionSong = null;

        Scanner scanner = new Scanner(System.in);

        int choice = -1;
        try {
            while (choice != 0) {
                System.out.println("Would you want to add the music?\n" +
                        "Please answer:\n" +
                        "  1 - yes,\n" +
                        "  0 - no.");

                choice = (scanner.nextInt());

                if (choice == 1) {
                    System.out.println("What do you want to add?\n" +
                            "\t1. Playlist\n" +
                            "\t2. Song");
                    int inputComponent = scanner.nextInt();
                    if (inputComponent == 1) {
                        System.out.println("Enter the name of the playlist: ");
                        String namePlaylist = scanner.next();
                        playlistComponent = new Playlist(namePlaylist);

                        System.out.print("Ok. Enter the name count of songs: ");
                        int songCount = scanner.nextInt();

                        for (int i = 0; i < songCount; i++) {
                            PlaylistComponent song = null;
                            System.out.println("\nEnter the name, artist of the song"
                                                + "\n\tExample: Kiss, Moonlight");

                            String nameInput = scanner.next();
                            try {
                                descriptionSongForPlaylist = new ArrayList<String>(Arrays.asList(nameInput.split(",")));
                                if (descriptionSongForPlaylist.size() < 2){
                                    throw new IndexOutOfBoundsException("Wrong format for input");
                                } else {
                                    String name = descriptionSongForPlaylist.get(0);
                                    String artist = descriptionSongForPlaylist.get(1);

                                    song = new Song(name, artist);
                                    playlistComponent.add(song);
                                }
                            } catch (IndexOutOfBoundsException e){
                                e.printStackTrace();
                            }
                            favoriteMusic.add(playlistComponent);
                        }

                    } else if (inputComponent == 2) {
                        System.out.println("\nEnter the name, artist of the song"
                                            + "\n\tExample: Kiss, Moonlight");
                        String nameInput = scanner.next();
                        try {
                            descriptionSong = new ArrayList<String>(Arrays.asList(nameInput.split(",")));
                            if (descriptionSong.size() != 2){
                                throw new IndexOutOfBoundsException("Wrong format for input");
                            } else {
                                String nameSong = descriptionSong.get(0);
                                String artistSong = descriptionSong.get(1);

                                song1 = new Song(nameSong, artistSong);
                                favoriteMusic.add(song1);
                            }
                        } catch (IndexOutOfBoundsException e){
                            e.printStackTrace();
                        }
                    }
                }
            }
            favoriteMusic.play(favoriteMusic);
        } catch (Exception ex){
            ex.printStackTrace();
        }*/


    }
}
