/** Copyright 

*/
//Name : Mihir Achyuta
//Date : 12/10/19
//Purpose : to calculate values of pi by throwing darts at a dart board

import java.util.Scanner;
public class EstimatePi {

	public static int Throw = 0, Count = 0;	
	public static double Calc = (2 * Math.random()) - 1;	
	public static double Calc2 = (2 * Math.random()) -1;
	public static double R = 1.0;	
	public static double Hit;

		//Calculate number of hits
	public static int TotalHit ( double Calc, double Calc2, int Trial) {
		Hit = 0;
		for(int i = 1; i< Trial; i =i+1) {
			Calc = (2*Math.random()) -1;
			Calc2 = (2*Math.random()) -1;
			
			if((Math.pow(Calc, 2) + Math.pow(Calc2, 2)) <= (Math.pow(R,2))) {
				Hit++;
			}
		}

		return (int)Hit;
	}	
		
	//Calculates pi based on hits and darts
	public static double Pi(double Dart, double Total) {
		double pi = ((4* (Dart)) / Total);
		return pi;
	}
		
		
		
		
	//main class	
	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	//user input
	System.out.println("How many trials for this program?");
	Count = in.nextInt();	
		
	System.out.println("How many darts per trial?");	
	Throw = in.nextInt();	
		
	double All =0.0;

	//displays multiple trials with use of for loop
	for(int i = 0; i < Count; i=i+1)
	{
	int hits = TotalHit(Calc,Calc2,Throw);
	double approxPi = Pi(hits,Throw);
	All += approxPi;
	System.out.printf("Trial " + (i+1) + ": pi = %12f\n", approxPi);
	}
	double average = ((All / Count));
	System.out.printf("Pi Average: %1.5f", average);
	
	
	
}}