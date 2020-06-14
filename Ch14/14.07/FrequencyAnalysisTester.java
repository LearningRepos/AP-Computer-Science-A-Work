//Name : Mihir Achyuta
//Date: 3/18/20
//Purpose : To test the frequency analysis program

//importing
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class FrequencyAnalysisTester {
    public static void main (String [] args) throws IOException {

        //creates constructor and file
        Scanner scan = new Scanner(System.in);
        FrequencyAnalysis construct = new FrequencyAnalysis();

        System.out.println("Enter file name (include the .txt in this): ");
        String response = scan.nextLine();
        File file = new File(response);

        //invokes methods
        construct.AddAlphabet();
        System.out.println();
        construct.Frequency(file);
        System.out.println();
        construct.PrintToConsole();
        System.out.println();
        construct.PrintToFile();
    }
}