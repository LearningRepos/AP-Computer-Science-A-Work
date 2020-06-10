/** Copyright 

*/
//Mihir Achyuta
//Date : 11/26/19
//Purpose : to display weather data as F or C or in or cm

import java.util.Scanner;
public class AnnualWeatherV2 {
public static void main(String[] args) {

Scanner in = new Scanner(System.in);
System.out.println("Would you like to display output as 1(Farenheit) or 2(Celsius)");
int option = in.nextInt();

System.out.println("Would you like output in 1(inches) or 2(centimeters)");
int size = in.nextInt();

String temp = "none";
String rain = "none";

String [] Months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October","November", "December"};

double[] Temp = {51.8,54.8,61.1,66.4,74.4,80.4,82.4,82.1,78.9,69.1,60.4,53.7};
double[] Rain = {5.4,4.6,6.5,3.6,5.0,6.9,8.0,7.0,5.0,3.3,3.9,4.1};

//Double[] Temp = {58.4, 60.0, 64.7, 68.9, 74.8, 79.7, 81.7, 81.5, 79.9, 74.0, 67.0, 60.8};
//Double[] Rain = {3.1, 2.7, 3.8, 2.5, 3.3, 5.7, 5.2, 6.1, 6.6, 4.5, 3.0, 2.7};

if(option==1) {
	temp = "F";
}
else {
	for(int i=0; i<12; i =i+1) {
		Temp[i]= (int)((Temp[i]-32)*0.55*5);
		Temp[i]= Temp[i]/5;
		System.out.println(Temp[i]);
		
}
	temp = "C";
}

if(size ==1) {
	rain = "I";
}
else {
	for(int j = 0; j< 12; j =j+1) {
		Rain[j] = (int)(Rain[j]*2.54*5);
		Rain[j] = (Rain[j]/5);
		
	}
	rain ="C";
}

double Train = 0;
double Ttotal = 0;
for(int i=0; i<12; i =i+1) {
	Ttotal += Temp[i];
	Train += Rain[i];
}
double TTemp = Ttotal/12;

System.out.println();
System.out.println("Weather Data");
System.out.println("Location : Tallahasse Florida");
System.out.println();
System.out.printf("%10s%21s%22s\n", "Month", "Temperature " + temp, "Precipitation " + rain);
System.out.println("############################################################################################");

for(int i=0; i<12; i++) 
{
    System.out.printf("%13s%18s%28s\n", Months[i], Temp[i], Rain[i]);
}
System.out.println();
System.out.println("Average Temp: "+TTemp + "                     " +"Total Rain: "+Train);
System.out.println("########################################################");


}}