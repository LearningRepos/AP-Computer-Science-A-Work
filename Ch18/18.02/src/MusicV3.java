
/**
 * Purpose: To do a binary search in many situations.
 *
 * @author (Mihir Achyuta)
 * @version (6/9/20)
 *PMR : This was an interesting assignment as I only did binary search with 1 instance but not multiple instances. I figured I had to do a linear scan after the bianry search because you cant find all the elements with a binary search because it eliminates about half the elements every pass of the loop
 */
public class MusicV3
{
    // instance variables
    private int year;
    private String title;
    private String artist;

    // Constructor for objects of class Music
    public MusicV3(String t, int y, String a)
    {
        // initialize instance variables
        title = t;
        year = y;
        artist = a;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String t)
    {
        title = t;
    }

    public String getArtist()
    {
        return artist;
    }

    public void setArtist(String a)
    {
        artist = a;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int y)
    {
        year = y;
    }

    public String toString()
    {
        String str = String.format( "%-25s %4d   %-20s ", title,  year , artist);
        return str;
    }
}
