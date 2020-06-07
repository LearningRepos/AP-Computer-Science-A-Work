// Name : Mihir Achyuta
// Date : 10/04/19
//Purpose : The purpose of this program is for the scanner to ask the user for 3 test scores, compile the total of those test scores, and find the average of those test scores.
import java.util.Scanner;
public class GradesV3 {
public static void main(String[] args) {
	
	Scanner name = new Scanner(System.in);
	System.out.println("Type in Your Name");
	String ActName = name.next();
	System.out.println(ActName);
	
	Scanner subject = new Scanner(System.in);
	System.out.println("Type in the Subject of The Program");
	String ActSubject = subject.next();
	System.out.println(ActSubject);
	
	Scanner OneTest = new Scanner(System.in);
	System.out.println("What Was The Result of The First Test?");
	int Test1 = OneTest.nextInt();
	
	Scanner TwoTest = new Scanner(System.in);
	System.out.println("What Was the Result of The Second Test?");
	int Test2 = TwoTest.nextInt();
	
	Scanner ThreeTest = new Scanner(System.in);
	System.out.println("What Was the Result of The Third Test?");
	int Test3 = ThreeTest.nextInt();
	
	
	int numTests = 0;      //counts number of tests
	int testGrade = 0;     //individual test grade
	int totalPoints = 0;   //total points for all tests 
	double average = 0.0;  //average grade
		

	
	numTests ++;
	totalPoints += Test1;
	testGrade += Test1;
	average = (double)testGrade / numTests;
	System.out.println("Test 1: " + Test1);
	System.out.println("Test # 1  "  + "Total Points: " + totalPoints + "   Average: " + average);
	System.out.println();
	
	numTests ++;
	totalPoints += Test2;
	testGrade += Test2;
	average = (double)testGrade / numTests;
	System.out.println("Test 2: " + Test2);
	System.out.println("Test # 1 + 2  "   + "Total Points: " + totalPoints + "  Average: " + average);
	System.out.println();
	
	numTests ++;
	totalPoints += Test3;
	testGrade += Test3;
	average = (double)testGrade / numTests;
	System.out.println("Test 3: " + Test3);
	System.out.println("Test # 1 + 2 + 3  "  + "Total Points: " + totalPoints + "  Average: " + average);
	System.out.println();
	
	/* Everything after test 4 is in comment from because I only need 3 Test Scores in this assignment
	int Test4 = 82;
	numTests ++;
	totalPoints += Test4;
	testGrade += Test4;
	average = (double)testGrade / numTests;
	System.out.println("Test # 4  " + "Test Grade: 82  " + "Total Points: " + totalPoints + "  Average: " + average);

	System.out.println();
	System.out.println();
	System.out.println();

	int v2numTests = 0;      //counts number of tests
	int v2testGrade = 0;     //individual test grade
	int v2totalPoints = 0;   //total points for all tests 
	double v2average = 0.0;  //average grade
		

	int Test5 = 90;
	v2numTests ++;
	v2totalPoints += Test5;
	v2testGrade += Test5;
	v2average = (double)v2testGrade / v2numTests;
	System.out.println("Test # 5  " + "Test Grade: 90  " + "Total Points: " + v2totalPoints + "   Average: " + v2average);

	int Test6 = 80;
	v2numTests ++;
	v2totalPoints += Test6;
	v2testGrade += Test6;
	v2average = (double)v2testGrade / v2numTests;
	System.out.println("Test # 6  " + "Test Grade: 80  " + "Total Points: " + v2totalPoints + "  Average: " + v2average);

	int Test7 = 70;
	v2numTests ++;
	v2totalPoints += Test7;
	v2testGrade += Test7;
	v2average = (double)v2testGrade / v2numTests;
	System.out.println("Test # 7  " + "Test Grade: 70  " + "Total Points: " + v2totalPoints + "  Average: " + v2average);

	int Test8 = 60;
	v2numTests ++;
	v2totalPoints += Test8;
	v2testGrade += Test8;
	v2average = (double)v2testGrade / v2numTests;
	System.out.println("Test # 8  " + "Test Grade: 60  " + "Total Points: " + v2totalPoints + "  Average: " + v2average);

	int Test9 = 50;
	v2numTests ++;
	v2totalPoints += Test9;
	v2testGrade += Test9;
	v2average = (double)v2testGrade / v2numTests;
	System.out.println("Test # 9  " + "Test Grade: 50  " + "Total Points: " + v2totalPoints + "  Average: " + v2average);

*/		

	

}
}