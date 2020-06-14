/**
 * This class is the client class
 * The toString method has been added.
 *
 * @author Mihir Achyuta
 * @version 3/20/20
 * PMR : I learned a lot on how to override a method including the tostring and the equals which may eb useful for later.
 */
public class ShapesTester {
    public static void showEffectBoth(Rectangle4 r)
    {
        System.out.println(r);
    }

    public static void equals(Rectangle4 r1, Rectangle4 r2) {
        if (r1.equals(r2)) {
            System.out.println(r1 + " is the same size as " + r2);
        }
        else {
            System.out.println(r1 + " is not the same size as " + r2);
        }
    }

    public static void main(String []args){
        Rectangle4 rect = new Rectangle4(1,6);
        Box4 sq = new Box4(2,2,2);
        Cube4 cu = new Cube4(2);
        LongRectangle4 lo = new LongRectangle4(1,41);
        LongPrism4 lop = new LongPrism4(12,34,56);

        showEffectBoth(rect);
        showEffectBoth(sq);
        showEffectBoth(cu);
        showEffectBoth(lo);
        showEffectBoth(lop);
        System.out.println();

        System.out.println("Equality Test:");
        System.out.println();

        if(cu.equals(sq)){
            System.out.println("The cube class is equal to the box class");
        }

        if(rect.equals(lo)){
            System.out.println("The rectangles class is equal to the long rectangle class ");
        }
        else
            System.out.println("The rectangle class is not equal to the long rectangle class");





    }
}