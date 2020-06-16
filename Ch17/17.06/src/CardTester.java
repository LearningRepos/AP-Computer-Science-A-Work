/**
 * This is a class that tests the Card class.
 *
 *  < Mihir Achyuta >
 *  < 6/9/20 >
 */

public class CardTester
{
    /**
     * The main method in this class checks the Card operations for consistency.
     * @param args is not used.
     */
    public static void main(String[] args) {

        /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

        // Establish new cards
        Card aceHearts = new Card("ace", "hearts", 1);

        // Test card 1 and methods
        System.out.println("**** Tests Card 1: ace of hearts ****");
        System.out.println("  rank: " + aceHearts.rank());
        System.out.println("  suit: " + aceHearts.suit());
        System.out.println("  pointValue: " + aceHearts.pointValue());
        System.out.println("  toString: " + aceHearts.toString());
        System.out.println();

        // Test card 2
        Card aceDiamonds = new Card("ace", "diamonds", 1);
        System.out.println("**** Tests Card 2: ace of diamonds ****");
        System.out.println("  rank: " + aceDiamonds.rank());
        System.out.println("  suit: " + aceDiamonds.suit());
        System.out.println("  pointValue: " + aceDiamonds.pointValue());
        System.out.println("  toString: " + aceDiamonds.toString());
        System.out.println();

        // Test card 3
        Card aceSpades = new Card("ace", "spades", 1);
        System.out.println("**** Tests Card 3: ace of spades ****");
        System.out.println("  rank: " + aceSpades.rank());
        System.out.println("  suit: " + aceSpades.suit());
        System.out.println("  pointValue: " + aceSpades.pointValue());
        System.out.println("  toString: " + aceSpades.toString());
        System.out.println();

        // Test matches() method
        System.out.println("Ace Diamonds match with Ace Hearts?");
        System.out.println(aceDiamonds.matches(aceHearts));
    }
}