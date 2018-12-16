package dataStructures_collections_generics.sorting_Comparator_3;

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

    // We need to implement Comparable to make use of Collections.sort(List<>);
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
