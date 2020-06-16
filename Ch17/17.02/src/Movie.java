
/**
 * Purpose: To utilize the insertion sort algorithm in many scenarios
 *
 * @author (Mihir Achyuta)
 * @version (enter today's date)
 *PMR: This assignment was a bit interesting but not hard because I learnt all the sorts before I did these assignments for personal reasons. I did my sorts with only plain integer numbers but this was the first time I used objects and getter/setter methods in sorting
 My sort is a bit different than the curriculum sort because I am using the version with 1 array instead of 2 arrays because thats the easiest one to recall because I learned that version first in javascript then I converted it into java : https://media.geeksforgeeks.org/wp-content/uploads/insertionsort.png
 */
public class Movie
{
    // instance variables
    private int year;
    private String title;
    private String studio;

    // Constructor for objects of class Movie
    public Movie(String title, int year, String studio)
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
