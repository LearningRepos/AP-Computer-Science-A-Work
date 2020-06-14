//Name : Mihir Achyuta
//Date : 3/13/20
//Purpose : To test the Encryption and Decryption class
//PMR : The caesar cipher was an interesting program to do because the concept of hiding and decoding messages could be used in real time if you would like to.
import java.util.Scanner;
public class CaesarTester {
    public static final String alp[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
            "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    public static void main(String[] args){
        boolean bool = true;
        String enter = "";
        Scanner in = new Scanner(System.in);
        while (bool == true) {
            System.out.println("Press e to encrypt the message");
            System.out.println("Press d to decrypt the message");
            System.out.println("Press q to quit");
            enter = in.next();
            System.out.println();

            if (enter.equalsIgnoreCase("e")) {
                System.out.println("What is your shift? ");
                final int shift = in.nextInt();

                System.out.println("Cypher-Alphabet :");
                String[] cypherAlphabet = Encryption.Cypher(shift);
                System.out.println();

                System.out.println("What is your encrypted message? ");
                String message = in.next() + in.nextLine();

                System.out.println("Encrypted Result: " + Encryption.Encryption(cypherAlphabet, message));
            }
            else if (enter.equalsIgnoreCase("d")) {
                System.out.println("What is your shift? ");
                final int shift = in.nextInt();

                System.out.println("Cypher-Alphabet :");
                String[] cypherAlphabet = Decryption.Cypher(shift);
                System.out.println();

                System.out.println("What is your decrypted message? ");
                String message = in.next() + in.nextLine();

                System.out.println("Decrypted Result: " + Decryption.Decryption(cypherAlphabet, message));
            }
            else if (enter.equalsIgnoreCase("q")) {
                bool = false;
            }
        }


    }
}