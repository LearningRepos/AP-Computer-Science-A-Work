/**
 *  Purpose : This class defines a basic Mountain.
 *
 * @author (Mihir Achyuta)
 * @version (2/29/20)
 */
public class Mountain extends Terrain {
    public int mountain;

    public Mountain(int le, int wi, int mou){
        super(le,wi);
        mountain = mou;
    }

    public String GetName(){
        return "Mountain";
    }

    public String GetMountainSize(){
        return GetName() + " Land has dimensions " + length + " X " + width + " and has " + mountain + " mountains";
    }
}
