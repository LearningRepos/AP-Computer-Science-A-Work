/** Copyright 
*/ 
// Name : Mihir Achyuta
// Date : 11/10/19
// Purpose : The purpose of this program is to calculate the BMI of a person and decide if a person is underweight, normal, overweight , or obese
import java.util.Scanner;
public class BMI {
public static void main(String[] args) {
		
Scanner SR = new Scanner(System.in);
	
System.out.println("Enter your name (first last) : ");
String Name = SR.nextLine();

System.out.println("Enter your weight in pounds ( ex 170) : ");
String weight = SR.nextLine();
double Weight = Double.parseDouble(weight);
double Kilos = Weight/2.205;

System.out.println("Enter your height in feet and inches (ex 4 5) : ");
String feet = SR.next();
String inch = SR.next();
double Feet = Double.parseDouble(feet);
double Inch = Double.parseDouble(inch);
double Height = ((12*Feet) + Inch)/39.37;

double BMI = Kilos/(Height*Height);
String result = "";
if(BMI < 18.5) {
	 result = "Underweight";
}

else if (BMI < 24.9) {
	 result = "Normal Weight";
}

else if (BMI < 29.9) {
	 result = "Overweight";
}

else if (BMI > 30.0) {
	 result = "Obese";
}

System.out.println();
System.out.println("Body Mass Index Calculator");
System.out.println("===========================");
System.out.println("Name: " + Name);
System.out.println("Height (m):" + Height);
System.out.println("Weight (kg): " + Kilos);
System.out.println("BMI: " + BMI);
System.out.println("Category: " + result);

}}