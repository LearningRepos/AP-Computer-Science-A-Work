/**
 * Purpose:  This class defines a Candidate by its name and number of votes.
 *
 * @author < Mihir Achyuta >
 * @version < 6/3/20 >
 * PMR : This assignment was a bit easier since I had previous code to look back too and the arraylist algorithm for inserting and deleting was already provided to us and the array algorithms werent that hard to understand.
 */

public class Candidate
{
    // instance variables
    private int numVotes;
    private String name;

    // Constructor for objects of class Candidate
    public Candidate(String name, int numVotes)
    {
        // initialize instance variables
        this.name = name;
        this.numVotes = numVotes;
    }

    public String getName()
    {
        return name;
    }

    public int getVotes()
    {
        return numVotes;
    }

    public void setVotes(int n)
    {
        numVotes = n;
    }

    public void setName(String n)
    {
        name = n;
    }

    public String toString()
    {
        return name + " received " + numVotes + " votes.";
    }
}