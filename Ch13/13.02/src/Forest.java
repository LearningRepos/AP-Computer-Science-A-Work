/**
 *  Purpose : This class defines a basic Forest.
 *
 * @author (Mihir Achyuta)
 * @version (2/29/20)
 */
public class Forest extends Terrain {
    public int tree;
    public Forest(int le, int wi, int trees){
        super(le,wi);
        tree = trees;
    }

    public String GetName(){
        return "Forest";
    }

    public String GetForestSize(){
        return GetName() + " Land has dimensions " + length + " X " + width + " and has " + tree + " trees ";
    }
}
