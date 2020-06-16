/**
 * Purpose: To demonstrate the merge sort in many scenarios.
 *PMR: Merge Sort took a bit of time to do because writing the actual code was long and I had to review how it broke down the array and sorted it recursively. Once I did that the logic made sense and I was able to code it
 * @author (Mihir Achyuta)
 * @date (6/6/20)
 *
 */
public class MovieV4
{
    // instance variables
    private int year;
    private String title;
    private String studio;

    // Constructor for objects of class Movie
    public MovieV4(String title, int year, String studio)
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
