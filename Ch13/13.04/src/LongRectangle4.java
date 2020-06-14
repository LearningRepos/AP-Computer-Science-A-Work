/**
 * This class defines a LongRectangle object using
 * length and width. extends rectangle
 * The toString method has been added.
 *
 *
 * @author Mihir Achyuta
 * @version 3/10/20
 */
public class LongRectangle4 extends Rectangle4 {
    public LongRectangle4(int l,int w){
        super(l,w);
    }

    public String toString()
    {
        return "The LongRectangle's dimensions are " + getLength() + " X " + getWidth();
    }
}