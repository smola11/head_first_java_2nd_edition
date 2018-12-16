package dataStructures_collections_generics.dupicateSorted_TreeSet;

public class Song implements Comparable<Song> {

    private String title;
    private String artist;
    private String rating;
    private String bpm;


    public Song(String t, String a, String r, String b) {
        title = t;
        artist = a;
        rating = r;
        bpm = b;
    }

    // TreeSet uses this method to sort element when inserted and CHECK IF THEY ARE EQUAL;
    @Override
    public int compareTo(Song song) {
        return title.compareTo(song.getTitle());
    }

    public String getArtist() {
        return artist;
    }

    public String getBpm() {
        return bpm;
    }

    public String getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return title;
    }
}
