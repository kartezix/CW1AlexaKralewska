//classes and strings for methods to run to, separated for simple access.

public class Song
{
    private int id;

    private String title;

    private String artist;

    private int playCount;

    private String removeSong;

    public Song(String title, String name, int count)
    {
        this.title = title;
        this.artist = name;
        this.playCount = count;
        this.removeSong = title;
        this.id = id;

    }

    public void print()
    {
        System.out.println(title + " by " + artist + " plays: " + playCount);
    }
    public String getTitle() {return title;}

    public int gettopHits() {return playCount;}
}