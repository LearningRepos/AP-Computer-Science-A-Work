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

        /* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */

         System.out.println("\n**** 52 Card Deck shuffle Tests ****");
         String[] ranks52 = {"ace","1","2","3","4","5","6","7","8","9","10","11","12"};
         String[] suits52 = {"spades","diamonds","spades","clubs"};
         int[] pointValues52 = {1,2,3,4,5,6,7,8,9,10,11,12,13};

         System.out.println("  The Starting Deck ");
         Deck start = new Deck(ranks52,suits52,pointValues52);
         System.out.println(start.toString());

         System.out.println("  The Deck After Dealing a Card" );
         Card dealtCard = start.deal();
         System.out.println(start.toString());

         System.out.println("  Shuffleing the Deck ");
         for(int i =0; i<4; i++){
             start.shuffle();
             System.out.println(start.toString());
         }
    }
}