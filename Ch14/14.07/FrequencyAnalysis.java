//Name : Mihir Achyuta
//Date: 3/18/20
//Purpose : To do a frequency analysis of letters in a message and decipher a message
//PMR : This project took a couple of days to do because there were a lot of parts to it. I just had to do this piece by piece but it was all good in the end because now I know how to do a proper frequency analysis of any document

//importing
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;



public class FrequencyAnalysis {
    //creating 2 array lists of Character object(char) and Integer object(int)
    //All these declared arraylists are static because they need to be shared by all the other methods to have the same value
    static ArrayList<Character> Alphabet = new ArrayList<Character>();
    static ArrayList<Integer> TotalCharacters = new ArrayList<Integer>();
    static int Count = 0;

    //This method adds all the possible alphabets from a-z and 97-123 used to represent a-z in char and adds them to the Alphabet arraylist
    public static void AddAlphabet() {

        for (int j = 97; j < 123; j++) {
            char letter = (char)j;
            Alphabet.add(letter);
        }

    }

    //finds
    public static void Frequency(File input) throws IOException {
        Scanner in = new Scanner(input);
        while (in.hasNextLine()) {
            String line = in.nextLine();
            //only dealing with lowercase data
            line = line.toLowerCase();
            int count = 0;
            int index = 0;
            //going over possible alphabet and if a character matches then add 1 to count and at the end record in the shared static variable Count
            for (int k = 97; k < 123; k++) {
                char letter = (char)k;
                count = 0;
                for (int l = 0; l < line.length(); l++) {
                    char messageletter = line.charAt(l);
                    if (messageletter == letter) {
                        count = count + 1;
                    }
                }
                int total =+ count;
                Count = Count + count;
                TotalCharacters.add(index, total);
                index++;
            }

        }

    }

    //printing out data in a letter * frequency table to console
    public static void PrintToConsole() {
        System.out.println("Letter \t / \t Frequency");// tabs used for formatting
        for(int i = 0; i < Alphabet.size(); i++) {
            char letter = Alphabet.get(i);
            int count = TotalCharacters.get(i);
            System.out.println(letter + " \t / \t " + count);
        }
    }

    //printing out data in a letter * frequency * percentage to file
    public static void PrintToFile() throws IOException {
        System.out.println("Enter file name (dont include the .txt in this one): ");
        Scanner sc = new Scanner(System.in);
        String respond = sc.nextLine();

        PrintWriter output = new PrintWriter(new File(respond+ "Freq.txt"));
        output.println("Letter \t / \t Frequency \t / \t Percentage");
        int index = 0;
        for (int i = 0; i < Alphabet.size(); i++) {
            char letter = Alphabet.get(index);
            int count = TotalCharacters.get(index);
            double percent = (double)count/ Count;
            percent = (double)percent*100;

            output.print(letter + " \t / \t " + count + " \t \t / \t ");
            output.printf("%.2f\n", percent);
            index++;
        }
        output.close();
    }


}