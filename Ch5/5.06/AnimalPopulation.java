/** Copyright 
*/
//Name : Mihir Achyuta
//Date :11/23/19
//Purpose : Use the Monte Carlo method to record number of animals seen till you see a certain one.
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.util.Random;

public class AnimalPopulation {
public static void main(String[] args) throws IOException  {
Scanner trial = new Scanner(System.in);
Random random = new Random();

File myFile = new File ("hello.txt");
PrintWriter outfile = new PrintWriter(myFile); 
Scanner tRial = new Scanner(myFile);


System.out.println("Welcome to the Fox Squirrel Simulator");	
System.out.println();
System.out.println("How many trials should be simulated?");
System.out.println("Enter a value greater than 1000: ");

int Trial = trial.nextInt();
int c = 0;
int Total = Trial;
if(Trial<1000) {
	System.out.println("Please try again. Enter a number greater than 1000.");
	System.out.println();
	System.out.println("How many trials should be simulated?");
	System.out.println("Enter a value greater than 1000: ");
	Trial = trial.nextInt();

}
int randomInteger;

//A fox squirrel will appear when the value is 9 from a range of 0-9. This means that the ratio of fox squirrel to regular squirrels is 1 to 10
int count = 0;
int fox =0;


for(int i =1; i<= Trial; i++)
{randomInteger = random.nextInt(10);
while(randomInteger != 9) {
	randomInteger = random.nextInt(10);
	count = count + 1;
}	
if(randomInteger == 9) {}
	count = count +1;
	fox = fox + 1;
}

outfile.println("The total number of squirrels found was" + count);
outfile.println("The total number of Fox Squirrels were" + fox);
double avg = (count/(double)fox);
outfile.println("The average number of squirrels needed to be seen to eventually find a fox squirrel is: " + avg);
outfile.close();

Scanner file = new Scanner(new File("hello.txt"));
while(file.hasNextLine())
{
	String p = file.nextLine();
	System.out.println(p);
}


}}