import java.util.ArrayList;

public class Playlist {

    private ArrayList<Song> songs;

    public Playlist() {
        songs = new ArrayList<>();
    }

    public Playlist(Song song) {
        songs = new ArrayList<>();
        songs.add(song);
    }

    void add(Song s) {
        songs.add(s);
    }

    void remove(Song s) {
        songs.remove(s);
    }

    boolean contains(Song s) {
        return songs.contains(s);
    }

    Song getFirstSong() {
        return songs.get(0);
    }

}
