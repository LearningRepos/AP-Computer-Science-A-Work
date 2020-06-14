/**
 * This class defines a Box object by extending
 * Rectangle and includes height.
 * The toString method has been added.
 *
 * @author Mihir Achyuta
 * @version 3/20/20
 */
public class Box4 extends Rectangle4
{
    // instance variables
    private int height;

    // Constructor for objects of class Box
    public Box4(int l, int w, int h)
    {
        // call superclass
        super(l, w);

        // initialize instance variables
        height = h;
    }

    // return the height
    public int getHeight()
    {
        return height;
    }

    // String to display when object is printed.

    public String toString()
    {
        return "The box's dimensions are " + getLength() + " X " + getWidth() + " X " + getHeight();
    }

    public boolean equals(Box4 g){

        if(getLength() == g.getLength())
            if(getWidth() == g.getWidth())
                if(getHeight() == g.getHeight())
                return(true);

        return false;

    }

}