/**
 *  Purpose : This class defines a basic Tree Animal inheriting from Forest.
 *
 * @author (Mihir Achyuta)
 * @version (2/29/20)
 */
public class TreeAnimal extends Forest {
    public int animal;
    public TreeAnimal(int le, int wi, int tree, int ani){
        super(le,wi,tree);
        animal = ani;
    }

    public String GetName(){
        return "TreeAnimal";
    }

    public String GetTreeAnimal(){
        return GetName() + " Land has dimensions " + length + " X " + width + " and has " + tree + " trees " + " and has " + animal + " animals" ;
    }
}
