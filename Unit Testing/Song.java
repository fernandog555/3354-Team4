public class Song {

    private String title;
    private String artist;
    private String album;
    private String genre;
    private String lyrics;
    private int year;
    private boolean liked = false;
    private boolean disliked = false;

    public Song (String title, String artist, String album, String genre, String lyrics, int year) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.genre = genre;
        this.year = year;
    }

    void like() {
        this.liked = true;
        this.disliked = false;
    }

    void dislike() {
        this.liked = false;
        this.disliked = true;
    }

    void removeLike() {
        this.liked = false;
        this.disliked = false;
    }

    String getTitle() {
        return title;
    }

}
