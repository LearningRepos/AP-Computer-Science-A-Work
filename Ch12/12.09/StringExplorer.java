/** Name : Mihir Achyuta
 * Date : 2/28/20
 *
 *Purpose :  A program to allow students to try out different
 * String methods.
 *
 * Code adapted from work by Laurie White for the College Board.
 *
 * @author (enter your name)
 * @version (enter today's date)
 */
public class StringExplorer
{

    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";
        System.out.println("sample = " + sample);
        System.out.println();

        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println("sample.indexOf(\"quick\") = " + position);

        int notFoundPos  = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPos);

        position = sample.indexOf("o");
        System.out.println("sample.indexOf(\"o\") = "+ position);
        position = sample.indexOf("o", position + 1);
        System.out.println("sample.indexOf(\"o\", position + 1) = " + position);

        System.out.println();

        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println("sample.toLowerCase() = " + lowerCase);
        System.out.println("After toLowerCase(), sample = " + sample);
        System.out.println();

        boolean isEqual = sample.equals(sample.toLowerCase());
        System.out.println("sample.equals(sample.toLowerCase() = "+ isEqual);

        // Assign a new value to sample. Use a phrase of your choosing.
        // Pad the beginning and end of the string literal with spaces.
        sample = "  I bought a new phone and it is very fast and a monster!  ";
        System.out.println();

        //  Add examples below for the following methods:
        //    trim()
        String cut = sample.trim();
        System.out.println(cut); //output doesnt distinguish between whitespace

        //    length()
        int len = sample.length();
        System.out.println(sample + "Length: " + len);
        System.out.println();
        //    indexOf with one and two parameters
        int one = sample.indexOf("a");
        System.out.println(one);
        int two = sample.indexOf("a", 12);
        System.out.println(two);
        //    substring() with one and two parameters
        System.out.println();
        String uno = sample.substring(10);
        String dos = sample.substring(13,19);
        System.out.println(uno );
        System.out.println(dos );
        //    compareTo()
        //    any other String methods you'd like to try

    }

}