package dataStructures_collections_generics.duplicates_Set;

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

    // We now override equals() and hashcode() to make use of Set
    @Override
    public int hashCode() {
        return title.hashCode();
    }

    @Override
    public boolean equals(Object aSong) {
        Song s = (Song) aSong;
        return getTitle().equals(s.getTitle());
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
