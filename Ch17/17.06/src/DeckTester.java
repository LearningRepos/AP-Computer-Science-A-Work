/**
 * This is a class that tests the Deck class.
 *
 *  < Your Name >
 *  < Today's Date >
 */

public class DeckTester
{
    /**
     * The main method in this class checks the Deck operations for consistency.
     * @param args is not usemyDeck.
     */
    public static void main(String[] args)
    {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
        /* Uncomment blocks of code to test the Deck class */

        String[] myRanks = {"queen"};
        String[] mySuits = {"heart"};
        int[] myPointValues = {12};
        Deck myDeck = new Deck(
                new String[] {"ace", "two", "three"},
                new String[] { "hearts", "diamonds"},
                new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        System.out.println("**** Original Deck Methods ****");
        System.out.println("  toString: \n" + myDeck.toString());
        System.out.println("  isEmpty: " + myDeck.isEmpty());
        System.out.println("  size: " + myDeck.size());
        System.out.println();
        System.out.println();

        System.out.println("**** Deal a Card ****");
        System.out.println("  deal: " + myDeck.deal());
        System.out.println();
        System.out.println();

        System.out.println("**** Deck Methods After 1 Card Dealt ****");
        System.out.println("  toString:\n" + myDeck.toString());
        System.out.println("  isEmpty: " + myDeck.isEmpty());
        System.out.println("  size: " + myDeck.size());
        System.out.println();
        System.out.println();

        System.out.println("**** Deal Remaining 5 Cards ****");
        System.out.println("  deal 2: " + myDeck.deal());
        System.out.println("  deal 3: " + myDeck.deal());
        System.out.println("  deal 4: " + myDeck.deal());
        System.out.println("  deal 5: " + myDeck.deal());
        System.out.println("  deal 6: " + myDeck.deal());
        System.out.println();
        System.out.println();

        System.out.println("**** Deck Methods After All Cards Dealt ****");
        System.out.println("  toString:\n" + myDeck.toString());
        System.out.println("  isEmpty: " + myDeck.isEmpty() );
        System.out.println("  size: "  + myDeck.size());
        System.out.println();
        System.out.println();

        System.out.println("**** Deal a Card From Empty Deck ****");
        System.out.println("  deal: "  + myDeck.deal());
        System.out.println();
        System.out.println();


        /* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */

        // System.out.println("\n**** 52 Card Deck shuffle Tests ****");
        // String[] ranks52 = {"ace"};
        // String[] suits52 = {"spades"};
        // int[] pointValues52 = {1};

        // System.out.println("  The Starting Deck ");

        // System.out.println("  The Deck After Dealing a Card" );

        // System.out.println("  Shuffleing the Deck ");


    }
}