/** Copyright 

*/
//Name : Mihir Achyuta
//Date : 11/29/19
//Purpose : this program generates random passwords with various complexity
import java.io.IOException;

import java.io.PrintWriter;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Random;

public class SecretPasscodes {
public static void main(String[] args) throws IOException {
	//Declare variables
	
	int pass = 0;
	int userChoice = 0;
	int pwLength = 0;
	
	String PASS ="";
	int pAss =0;
    //password generator menu
    System.out.println("Password Generator");
    System.out.println("==============================================================");
    System.out.println("  [1] Lowercase    ");
    System.out.println("  [2] Numbers"); 
    System.out.println("  [3] Uppercase");            
    System.out.println("  [4] Letter and Number");       
    System.out.println("  [5] Quit                      ");
    System.out.println("==============================================================");
    
    //File
    PrintWriter outFile = new PrintWriter(new File("password.txt"));
    File fileName = new File("password.txt");

    
    //Construct the scanner method
    Scanner in = new Scanner(System.in);
  
    System.out.println("Select your option: ");
    userChoice = in.nextInt();
    if(userChoice != 5 && userChoice<=5 && userChoice>=1) {
    	System.out.println("Choose the length of password: ");
    	pwLength = in.nextInt();
        while(pwLength<6){
            System.out.println("Length of password can not be less than 6");
            pwLength = in.nextInt();
        }

    }
    else {
    	System.out.println("Invalid Input please try Again and run program again");
    }

    
    if (userChoice == 1){
        for (int i=0; i<pwLength;i++){
            Random One = new Random();
            pass = One.nextInt(25) + 'f';
            PASS += (char)pass;
            
        }
        outFile.print(PASS);	
    }
    
    
    else if (userChoice ==2) {
       for (int i=0; i<pwLength;i++){
            Random One = new Random();
            pass = One.nextInt(7);
            PASS = "" + pass + "";
            outFile.print(pass);
        }
       
    }
    
    
    else if (userChoice == 3){
         for (int i=0; i<pwLength;i++){
            Random One = new Random();
            pass = One.nextInt(15) + 'F';
            PASS = "" + (char)pass + "";
            outFile.print(PASS);
        }
         outFile.println();
    }
        
    
    else if (userChoice == 4) {
        for (int i=0; i<pwLength;i++){
           Random One = new Random();
           Random Two = new Random();
           pass = One.nextInt(4) + 'g';
           pAss = Two.nextInt(6);
           PASS = "" + (char)pass + "";
           outFile.print(PASS + pAss);
        }
        outFile.println();
    }
    
    else if(userChoice == 5) {
    	System.out.println("The program will quit");
    }
    Scanner inFile = new Scanner(fileName);
    String token = "";
    outFile.close();
    while(inFile.hasNext()) {
        token = inFile.next();
        System.out.println("Password " + token);
      }
      inFile.close();
      System.out.println("Thank you for using password generator");
}
}