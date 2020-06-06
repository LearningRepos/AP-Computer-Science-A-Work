//Name : Mihir Achyuta 
//Date : 08/31/19
//Description : This program will process 5 tests, state their grades, add up all the test points gradually, and calculate the average of the 4 tests.(average is calculated test by test)
public class GradesV2 {
public static void main(String[] args) {
		
//local variables
int numTests = 0;      //counts number of tests
int testGrade = 0;     //individual test grade
int totalPoints = 0;   //total points for all tests 
double average = 0.0;  //average grade
	

int Test1 = 95;
numTests ++;
totalPoints += Test1;
testGrade += Test1;
average = (double)testGrade / numTests;
System.out.println("Test # 1  " + "Test Grade: 95  " + "Total Points: " + totalPoints + "   Average: " + average);

int Test2 = 73;
numTests ++;
totalPoints += Test2;
testGrade += Test2;
average = (double)testGrade / numTests;
System.out.println("Test # 2  " + "Test Grade: 73  " + "Total Points: " + totalPoints + "  Average: " + average);

int Test3 = 91;
numTests ++;
totalPoints += Test3;
testGrade += Test3;
average = (double)testGrade / numTests;
System.out.println("Test # 3  " + "Test Grade: 91  " + "Total Points: " + totalPoints + "  Average: " + average);

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



}
}