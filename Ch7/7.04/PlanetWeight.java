/** Copyright 

*/
//Name : Mihir Achyuta
//Date : 12/4/19
//Purpose : This program calculates your weight on each planet in the solar system.
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class PlanetWeight {

	public static double [] G() throws IOException{
		
		double [] G = new double[9];
		Scanner inFile = new Scanner(new File("gravity.txt"));
		
		for (int i =0; i<G.length; i =i+1) {
			G[i] = inFile.nextDouble()/10.0;
		}
		inFile.close();
		return G;

	}

	public static double [] W(double[] G, double EG) {
		double m = EG * 433.6;
		double [] CalcW = new double[9];
		
		for ( int j=0; j< CalcW.length;) {
			CalcW[j] = (G[j] * m);
			
		}
		return CalcW;	
	}
	
	public static void REZ(double[] W, double[] G, String[] Name) {
		System.out.printf("%32s", "Your Weight on the Planets in our Solar System");
		System.out.println();
		System.out.printf("%-9s%27s%18s", "Planet Name", "Gravity Calculated", "Weight(Pounds)");
		System.out.println();
		for (int L =0; L< Name.length; L =L+1) {
			System.out.printf("%-9s%16f%17f", Name[L], G[L], W[L]);
		}
	}
	
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter Your Weight in Pounds: ");
		double Weight =in.nextDouble();
		
		
		String [] Planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
		double[] g = G();
		
		double[] w = W( g, Weight );
		
		REZ(w, g , Planets);
	
	
	
}}