import java.util.*;
/**
 * Purpose : This class provides a convenient way to test shuffling methods.
 *
 *
 *  < Mihir Achyuta >
 *  < 6/18/20 >
 *   PMR : This project was nice as we had to implement ways of shuffling cards and I enjoyed the different ways we had to shuffle them.
 */
public class Shuffler
{

    /**
     * The number of consecutive shuffle steps to be performed in each call
     * to each sorting procedure. Change this value to your code.
     */
    private static final int SHUFFLE_COUNT = 5;


    /**
     * Tests shuffling methods.
     * @param args is not used.
     */
    public static void main(String[] args)
    {
        System.out.println("Results of " + SHUFFLE_COUNT +
                " consecutive perfect shuffles:");
        int[] values1 = {0, 1, 2, 3};
        for (int j = 1; j <= SHUFFLE_COUNT; j++)
        {
            perfectShuffle(values1);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values1.length; k++)
            {
                System.out.print(" " + values1[k]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Results of " + SHUFFLE_COUNT +
                " consecutive efficient selection shuffles:");
        int[] values2 = {0, 1, 2, 3};
        for (int j = 1; j <= SHUFFLE_COUNT; j++)
        {
            selectionShuffle(values2);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values2.length; k++)
            {
                System.out.print(" " + values2[k]);
            }
            System.out.println();
        }
        System.out.println();
    }


    /**
     * Apply a "perfect shuffle" to the argument.
     * The perfect shuffle algorithm splits the deck in half, then interleaves
     * the cards in one half with the cards in the other.
     * @param values is an array of integers simulating cards to be shuffled.
     */
    public static void perfectShuffle(int[] values)
    {
        int k = 0;
        int[] shuffled = new int[values.length];
        for(int i=0; i < (values.length)/2; i++)
        {
            shuffled[k] = values[i];
            k +=2;
        }
        k = 1;
        for(int i= (values.length)/2; i < values.length; i++)
        {
            shuffled[k] = values[i];
            k +=2;
        }
        for(int i = 0; i < shuffled.length; i++)
        {
            values[i] = shuffled[i];
        }
    }

    /**
     * Apply an "efficient selection shuffle" to the argument.
     * The selection shuffle algorithm conceptually maintains two sequences
     * of cards: the selected cards (initially empty) and the not-yet-selected
     * cards (initially the entire deck). It repeatedly does the following until
     * all cards have been selected: randomly remove a card from those not yet
     * selected and add it to the selected cards.
     * An efficient version of this algorithm makes use of arrays to avoid
     * searching for an as-yet-unselected card.
     * @param values is an array of integers simulating cards to be shuffled.
     */
    public static void selectionShuffle(int[] values)
    {
        Random rnd = new Random();
        int[] shuffled = new int[values.length];
        for (int i = values.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = values[index];
            values[index] = values[i];
            values[i] = a;
        }
    }
}
