/** Copyright 
*/
//Name : Mihir Achyuta
//Date : 12/2/19
//Purpose : this program determines the surface gravity of certain planets
 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class PlanetGravity {
	
public static double[] G ( double[]wkg, double[]lkm) {
	double[] G = new double [8];
	double GC = 6.67E-11;
	for( int j =0; j < G.length; j = j+1) {
		G[j] = ((GC * wkg[j]) / (Math.pow(lkm[j]/2,2)));
	}
	return G;
}	

public static void Rez(String [] Planets, double [] D, double [] W ,double [] FG ) {
	System.out.printf("%25s","Planetary Data");
	System.out.println();
	System.out.printf("%-15s %-17s %5s %19s\n","Planet","Diameter(Km)","Mass(Kg)","g(m/s^2)");
	for(int i =0; i<8; i = i +1) {
		
		System.out.printf("%-16s %-14.0f %4e %19f\n",Planets[i],D[i],W[i],FG[i]);
	}
	
}


public static void Convert(double[] convert) throws IOException{
	PrintWriter OUT = new PrintWriter(new File("gravity.txt"));
    double [] results = convert;
    for(int L =0; L<results.length; L =L+1 ) {
    	OUT.println(results[L]);
    }
    OUT.close();
} 

public static void main(String[] args) throws IOException {
	
String[] Planets = {"Mercury",	"Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune"};

double[] Diameter = {4880000,12103600,12756300,6794000,142984000,120536000,51118000,49532000,2274000};

double[] Mass = {3.30e23,4.869e24 ,5.972e24 ,6.4219e23 ,1.900e27 ,5.68e26 ,8.683e25,1.0247e26};

double [] gF = G(Mass, Diameter);

Rez(Planets, Diameter, Mass, gF);


























}}