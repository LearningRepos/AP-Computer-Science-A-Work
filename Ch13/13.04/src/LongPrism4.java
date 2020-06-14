/**
 * This class defines a Long Prism object by extending
 * Box and includes height.
 * The toString method has been added.
 *
 * @author Mihir Achyuta
 * @version 3/20/20
 */
public class LongPrism4 extends Box4 {
    public LongPrism4(int li,int wi,int hi){
        super(li,wi,hi);
    }

    public String toString()
    {
        return "The Long Prism's dimensions are " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
}