/** Copyright 


*/
//Name : Mihir Achyuta
//Date : 12/10/19
//Purpose : to calculate values of pi by throwing darts at a dart board with object oriented programming style
import java.util.Scanner;
public class EstimatePiV12Tester {

	public static void main(String[] args) {
	
	    int Throw =0;
		int Count = 0;
	    double AB = (2 * Math.random()) - 1;
		double BC = (2 * Math.random()) - 1;
		double R = 1.0;
		double Hit = 0;
		int Trial =0;
		double Pi = 0;
		double Total = 0;
		double All = 0.0;
		double hits =0;
		
		EstimatePiV12 Pie = new EstimatePiV12(Throw, Count, AB, BC, R, Hit, Trial, Pi, Total, All, hits);
		
		Scanner in = new Scanner(System.in);
		//user input
		System.out.println("How many trials for this program?");
		Count = in.nextInt();	
			
		System.out.println("How many darts per trial?");	
		Throw = in.nextInt();	
		
		for(int i = 0; i < Count; i=i+1) {
			hits = Pie.TotalHit();
			double approxPi = Pie.Pi();
			All += approxPi;
			System.out.printf("Trial " + (i+1) + ": pi = %12f\n", approxPi);
		}
		
	
	}

}