import org.junit.*;

import static org.junit.Assert.*;

public class HarmoniaTest {
    Playlist playlist =  new Playlist();

    Song song1 = new Song("Songy-Song", "John McSongman", "Songs", "Country", "", 2023);
    Song song2 = new Song("Boots and Cats", "David Cool", "Songs", "Jazz", "...", 1986);

    @Test
    public void testIfInPlaylist() {
        playlist.add(song1);
        assertTrue(playlist.contains(song1) && playlist.getFirstSong().getTitle().equals("Songy-Song"));
    }

    @Test public void testIfNotInPlaylist() {
        playlist.add(song2);
        assertFalse(playlist.contains(song2));
    }
}
