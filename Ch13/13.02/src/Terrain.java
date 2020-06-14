
/**
 *  Purpose : This class defines a basic Terrain.
 *
 * @author (Mihir Achyuta)
 * @version (2/29/20)
 */

public class Terrain
{
    // instance variables
    public int length, width;

    // Constructor for objects of class Terrain
    public Terrain(int l, int w)
    {
        // initialize instance variables
        length = l;
        width = w;
    }

    public String GetName(){
        return "Regular";
    }

    public String GetTerrainSize()
    {
        return  GetName() + " Land has dimensions " + length + " X " + width;
    }
}