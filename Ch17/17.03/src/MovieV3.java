
/**
 * Purpose: To utilize the selection sort algorithm in many scenarios
 *
 * @author (Mihir Achyuta)
 * @version (enter today's date)
 *PMR: This assignment was a bit easier than the insertion sort assignment because I understood the selection sort algorithm better than the insertion sort algorithm. One thing I fixed after running the program for the first time is that max has to be set at i not 0 becuase you are comparing array[i]'s value(max) to the array[j] inner loop value
 */
public class MovieV3
{
    // instance variables
    private int year;
    private String title;
    private String studio;

    // Constructor for objects of class Movie
    public MovieV3(String title, int year, String studio)
    {
        // initialize instance variables
        this.title = title;
        this.year = year;
        this.studio = studio;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getStudio()
    {
        return studio;
    }

    public void setStudio(String studio)
    {
        this.studio = studio;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public String toString()
    {
        String str = String.format("%-30s %4d   %-20s", title, year, studio);
        return str;
    }
}

