
/**
 * Purpose:To use a sequential search in many scenarios
 *
 * @author (Mihir)
 * @version (6/9/20)
 *PMR : This search was fairly easy as we all secretly used it unknowingly without using its formal name. The only hard part was figuring out how to return multiple songs at once but I got it
 */
public class Music
{
    // instance variables
    private int year;
    private String title;
    private String artist;

    // Constructor for objects of class Music
    public Music(String t, int y, String a)
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

    public void setTitle(int y)
    {
        year = y;
    }

    public String toString()
    {
        String str = String.format( "%-25s %4d   %-20s ", title,  year , artist);
        return str;
    }
}
