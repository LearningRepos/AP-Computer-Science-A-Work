import java.util.ArrayList;

/**
 * Purpose : This class is a client class that tests previous classes
 *
 * @author Mihir Achyuta
 * @version 03/01/20
 * PMR : Polymorphism was an interesting topic to cover that was a bit unusual at first but I got the hang of it
 */
public class CircleTester {

    public static void Center(Circle2 c)
    {
        System.out.println("For " + c.getName() + " " + c.getCenter());
    }
    public static void main(String[] args){
        ArrayList<Circle2> round = new ArrayList<Circle2>();
        round.add(new Circle2(3,3,5));
        round.add(new Cylinder2(7,3,5,4));
        round.add(new Oval2(2,3,5,6));
        round.add(new OvalCylinder2(5,3,5,7,1));
        for( Circle2 i:round){
            Center(i);
        }

    }
}
