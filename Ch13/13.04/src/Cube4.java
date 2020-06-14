/**
 * This class defines a CUbe object by extending
 * Box and includes 1 value.
 * The toString method has been added.
 *
 * @author Mihir Achyuta
 * @version 3/20/20
 */
public class Cube4 extends Box4 {
    public Cube4(int li){
        super(li,li,li);
    }

    public String toString()
    {
        return "The cube's dimensions are " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
}