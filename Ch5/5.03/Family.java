/** Copyright 

*/
//Name : Mihir Achyuta
//Date/11/21/19
//Purpose : The purpose of this program is to find the probablility that a family will have 2 girls, 2 boys, or 1boy/1girl.
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
public class Family {
public static void main(String[] args) throws IOException {

int iter = 0;	
int TwoBoy = 0;	
int TwoGirl = 0;
int GFirstBSecond = 0;	
int BFirstGSecond = 0;

File Gender = new File("MaleFemaleInFamily.txt");

Scanner Tru = new Scanner(Gender);

while (Tru.hasNext()){
	String token = Tru.next();
	if (token.equals("BB")) {
		TwoBoy = TwoBoy +1;
		iter = iter +1;}
	else if (token.equals("GG")) {
		TwoGirl = TwoGirl + 1;
		iter = iter +1;}
	else if (token.equals("BG")) {
		BFirstGSecond = BFirstGSecond +1;
		iter = iter +1;}
	else if (token.equals("GB")) {
		GFirstBSecond = GFirstBSecond +1;
		iter = iter + 1;}
	}

int total = iter;

System.out.println();
System.out.println("Composition statics for families with two children");
System.out.println();
System.out.println("Total number of families: " + total);
System.out.println();
System.out.println("Number of families with");
System.out.println("2 Boys: " + TwoBoy + " represents " + (((double)TwoBoy/total) * 100) + "%");
System.out.println("2 Girls: " + TwoGirl + " represents " + (((double)TwoGirl/total) * 100) + "%");
System.out.println("1 Boy and 1 Girl Combined: " + (GFirstBSecond + BFirstGSecond) + " represents " + (((double)(GFirstBSecond + BFirstGSecond)/total) * 100) + "%" );

}}