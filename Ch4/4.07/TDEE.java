/** Copyright 
*/
// Name : Mihir Achyuta
//Date : 11/16/19
//Purpose : The purpose of this program is to take the gender and BMR and Activity level of a person and to calculate the TDEE based on it
import java.util.Scanner;

public class TDEE {
public static void main(String[] args) {
		
Scanner name = new Scanner(System.in);

System.out.println("Please enter your name :");
String Name = name.nextLine();

System.out.println("Please enter your BMR :");
double BMR = name.nextDouble();

System.out.println("Please enter your gender (M/F) :");
String gender = name.next();

System.out.println("Select Your Activity Level");
System.out.println("[A] Resting (Sleeping, Reclining)");
System.out.println("[B] Sedentary (Minimal Movement)");
System.out.println("[C] Light (Sitting, Standing)");
System.out.println("[D] Moderate (Light Manual Labor, Dancing, Riding Bike)");
System.out.println("[E] Very Active (Team Sports, Hard Manual Labor)");
System.out.println("[F] Extremely Active (Full-time Athlete, Heavy Manual Labor)");
System.out.println();

System.out.print("Enter the letter corresponding to your activity level: ");

String AL = name.next();

double AF = 0;
if(AL.equals("A") || AL.equals("a"))
{AF = 1.0;
	}


if (AL.equals("B") || AL.equals("b"))
{ AF = 1.3;
	}


if( AL.equals("C") && gender.equals("M") )
{ AF = 1.6;
	}
if( AL.equals("c") && gender.equals("m") )
{ AF = 1.6;
	}
if( AL.equals("C") && gender.equals("m") )
{ AF = 1.6;
	}
if( AL.equals("c") && gender.equals("M") )
{ AF = 1.6;
	}
if (AL.equals("C") && gender.equals("F"))
{ AF =1.5;
	}
if (AL.equals("c") && gender.equals("f"))
{ AF =1.5;
	}
if (AL.equals("C") && gender.equals("f"))
{ AF =1.5;
	}
if (AL.equals("m") && gender.equals("F"))
{ AF =1.5;
	}


if (AL.equals("D") && gender.equals("M") )
{ AF = 1.7;
	}
if (AL.equals("d") && gender.equals("m") )
{ AF = 1.7;
	}
if (AL.equals("d") && gender.equals("M") )
{ AF = 1.7;
	}
if (AL.equals("D") && gender.equals("m") )
{ AF = 1.7;
	}
if (AL.equals("D") && gender.equals("F") )
{ AF = 1.6;
	}
if (AL.equals("d") && gender.equals("f") )
{ AF = 1.6;
	}
if (AL.equals("d") && gender.equals("F") )
{ AF = 1.6;
	}
if (AL.equals("D") && gender.equals("f") )
{ AF = 1.6;
	}


if (AL.equals("E") && gender.equals("M") )
{ AF = 2.1;
	}
if (AL.equals("e") && gender.equals("m") )
{ AF = 2.1;
	}
if (AL.equals("E") && gender.equals("m") )
{ AF = 2.1;
	}
if (AL.equals("e") && gender.equals("M") )
{ AF = 2.1;
	}
if (AL.equals("E") && gender.equals("F") )
{ AF = 1.9;
	}
if (AL.equals("e") && gender.equals("f") )
{ AF = 1.9;
	}
if (AL.equals("E") && gender.equals("f") )
{ AF = 1.9;
	}
if (AL.equals("e") && gender.equals("F") )
{ AF = 1.9;
	}

if (AL.equals("F") && gender.equals("M") )
{AF = 2.4;
	}
if (AL.equals("f") && gender.equals("m") )
{AF = 2.4;
	}
if (AL.equals("F") && gender.equals("m") )
{AF = 2.4;
	}
if (AL.equals("f") && gender.equals("M") )
{AF = 2.4;
	}
if (AL.equals("F") && gender.equals("F"))
{ AF = 2.2;
	}
if (AL.equals("f") && gender.equals("f"))
{ AF = 2.2;
	}if (AL.equals("F") && gender.equals("f"))
{ AF = 2.2;
	}if (AL.equals("f") && gender.equals("F"))
{ AF = 2.2;
	}
double TDEE = AF * BMR;
System.out.println();
System.out.println();

System.out.println("Your Results;");
System.out.println("Name: " + Name + "              " + "Gender: " + gender);
System.out.println("BMR: " + BMR   + "              " + "Activity Factor: " + AF);
System.out.println("TDEE: " + TDEE);















}}