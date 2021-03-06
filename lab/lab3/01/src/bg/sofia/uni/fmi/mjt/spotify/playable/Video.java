package bg.sofia.uni.fmi.mjt.spotify.playable;

public class Video implements Playable{

    private final String title;
    private final String artist;
    private final int year;
    private final double duration;
    private int totalPlaysCount;

    public Video(String title, String artist, int year, double duration) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.duration = duration;
        this.totalPlaysCount = 0;
    }

    @Override
    public String play() {
        totalPlaysCount++;
        return String.format("Currently playing video content: %s", title);
    }

    @Override
    public int getTotalPlays() {
        return totalPlaysCount;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getArtist() {
        return artist;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public double getDuration() {
        return duration;
    }

}
