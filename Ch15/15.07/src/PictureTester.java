//Name : Mihir Achyuta
//Date 6/3/20
//Purpose : to go further into the picture lab
//PMR: This lab was fun because it dealt with a lot of pictures and it made me realize the 2d arrays arent that useless
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /**Method to test KeepOnlyGreen**/
  public static void testOnlyGreen()
  {
    Picture arch = new Picture("arch.jpg");
    arch.explore();
    arch.keepOnlyGreen();
    arch.explore();
  }

  /**Method to test negate*/
  public static void testNegate()
  {
    Picture arch = new Picture("arch.jpg");
    arch.explore();
    arch.negate();
    arch.explore();
  }

  /**Method to test greyscale*/
  public static void testGreyscale()
  {
    Picture arch = new Picture("arch.jpg");
    arch.explore();
    arch.greyscale();
    arch.explore();
  }

  /**Method to test rightToLeft**/
  public static void testmirrorVerticalRightToLeft()
  {
    Picture arch = new Picture("arch.jpg");
    arch.explore();
    arch.mirrorVerticalRightToLeft();
    arch.explore();
  }

  /**Method to test mirror horizontal**/
  public static void testmirrorHorizontal()
  {
    Picture arch = new Picture("arch.jpg");
    arch.explore();
    arch.mirrorHorizontal();
    arch.explore();
  }

  /**Method to test mirror horizontally bottom to top**/
  public static void testmirrorHorizontalBot()
  {
    Picture arch = new Picture("arch.jpg");
    arch.explore();
    arch.mirrorHorizontalBotToTop();
    arch.explore();
  }

  /**Tests mirror arms**/
  public static void testmirrorArms()
  {
    Picture arch = new Picture("snowman.jpg");
    arch.explore();
    arch.mirrorArms();
    arch.explore();
  }

  /**Tests mirror gull**/
  public static void testmirrorgull()
  {
    Picture arch = new Picture("seagull.jpg");
    arch.explore();
    arch.mirrorGull();
    arch.explore();
  }

  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }

  /**Method to test copy2nd**/
  public static void testCopy2nd()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.copy2nd(temple,100,200,300,400);
    temple.explore();
  }

  /** Method to test edgeDetection2 */
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection2(10);
    swan.explore();
  }

  /**Method to test myCollage**/
  public static void testmyCollage()
  {
    Picture collage = new Picture(1000,1000);
    collage.myCollage();
    collage.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
    //testOnlyGreen();
    //testNegate();
    //testGreyscale();
    //testmirrorVerticalRightToLeft();
    //testmirrorHorizontal();
    //testmirrorHorizontalBot();
    //testmirrorArms();
    //testmirrorgull();
    //testCopy2nd();
    //testmyCollage();
    testEdgeDetection2();
  }
}