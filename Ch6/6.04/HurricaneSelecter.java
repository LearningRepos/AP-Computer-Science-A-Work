/** Copyright 
*/
//Name : Mihir Achyuta
//Date : 12/16/19
//Purpose: To analyze hurricane data
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class HurricaneSelecter {

	
	
	public static double CatAvg;
	public static double PAvg;
	public static double WAvg;
	
	
	public static double maxPressure;
	public static double minPressure;
	
	public static double[] Speed;
	public static double MaxSpeed;
	public static double MinSpeed;
	
	public static double minCat;
	public static double maxCat;
	
	
	
	public static int[] cat;
	public static int[] p;
	

	public static int cat1;
	public static int cat2;
	public static int cat3;
	public static int cat4;
	public static int cat5;
	public static String[] year;
	public static String[] names;
	
	static class Collection {
		public void readHurricaneData() throws IOException {
			
			File data = new File("HurricaneData.txt");
			
			Scanner inFile = new Scanner(data);
			
			int count = 0;
			
			while (inFile.hasNextLine()) {
				count= count+1;
				inFile.nextLine();
			}
			year = new String[count];
			names = new String[count];
			
			cat = new int[count];
			p = new int[count];
			
			Speed = new double[count];
			
			int index = 0;
			
			Scanner in = new Scanner(data);
			for (int i = 0; i < 59; i= i+1) {
				year[index] = in.next();
				String month = in.next();
				int pressureData = Integer.parseInt(in.next());
				p[index] = pressureData;
				double windData = Double.parseDouble(in.next());
				windData = windData*1.15;
				if (windData < 95.0) {
					cat[index] = 1;
					cat1++;
				} 
				
				else if (windData <= 110) {
					cat[index] = 2;
					cat2++;
				} 
				
				else if (windData <= 129) {
					cat[index] = 3;
					cat3++;
				} 
				
				else if (windData <= 156 ) {
					cat[index] = 4;
					cat4++;
				} 
				
				else if (windData > 156) {
					cat[index] = 5;
					cat5++;
				}
				CatAvg += cat[index];
				
				Speed[index] = windData;
				PAvg += p[index];
				WAvg += Speed[index];
				
				names[index] = in.next();
				
				int categoryValue = cat[index];
				if  (maxCat < categoryValue) {
					maxCat = cat[index];
					minCat = cat[index];
				}
				if (minCat > categoryValue) {
					minCat = cat[index];
				}
				int pressureValue = p[index];
				
				if (maxPressure < pressureValue) {
					maxPressure = p[index];
					minPressure = p[index];
				}
				
				if (minPressure > pressureValue) {
					minPressure = p[index];
				}
				double windSpeedValue = Speed[index];
				
				if (MaxSpeed < windSpeedValue) {
					MaxSpeed = Speed[index];
					MinSpeed = Speed[index];
				}
				if (MinSpeed > windSpeedValue) {
					MinSpeed = Speed[index];
				}
				index++;
			}
			CatAvg = CatAvg/count;
			PAvg = PAvg/count;
			WAvg = WAvg/count;
		}
	}
	public static void ReturnData() throws IOException {
		PrintWriter outfile = new PrintWriter(new File("HurricaneData.txt"));
		
		outfile.printf("%s%14s%14s%18s%20s", "Year", "Hurricane", "Category", "Pressure (mb)", "Wind Speed (mph)");
		
		outfile.println();
		
		int index = 0;
		for (int i = 0; i < 59; i++){
			outfile.printf("%s%14s%14d%18d%20.2f\n", year[index], names[index], cat[index], p[index], Speed[index]);
			index++;
		}
		outfile.println("**********************************************************************");
		outfile.print("Average: ");
		outfile.printf("%23.1f%18.2f%20.2f\n", CatAvg, PAvg, WAvg);
		
		outfile.print("Maximum: ");
		outfile.printf("%23.0f%18.0f%20.2f\n", maxCat, maxPressure, MaxSpeed);
		
		outfile.print("Minimum: ");
		outfile.printf("%23.0f%18.0f%20.2f\n\n", minCat, minPressure, MinSpeed);
		outfile.println("Number of Category 1: " + cat1);
		outfile.println("Number of Category 2: " + cat2);
		outfile.println("Number of Category 3: " + cat3);
		outfile.println("Number of Category 4: " + cat4);
		outfile.println("Number of Category 5: " + cat5);
		outfile.close();
		
	}
	
	public static void main(String[] args) throws IOException {
		Collection d = new Collection();
		d.readHurricaneData();
		System.out.printf("%s%14s%14s%18s%20s", "Year", "Hurricane", "Category", "Pressure (mb)", "Wind Speed (mph)");
		System.out.println();
		
		int index = 0;
		for (int i = 0; i < 59; i++){
			System.out.printf("%s%15s%12d%17d%20.5f\n", year[index], names[index], cat[index], p[index], Speed[index]);
			index++;
		}
		System.out.println();
		System.out.print("Average Results: ");
		System.out.printf("%23.1f%15.2f%21.4f", CatAvg, PAvg, WAvg);
		System.out.println();
		
		System.out.print("Maximum Result: ");
		System.out.printf("%23.0f%17.0f%22.3f", maxCat, maxPressure, MaxSpeed);
		System.out.println();
		
		System.out.print("Minimum Result: ");
		System.out.printf("%23.0f%18.0f%20.2f\n", minCat, minPressure, MinSpeed);
		System.out.println();
		
		System.out.println("Ssummary of Categories:");
		System.out.println("Cat1: " + cat1);
		System.out.println("Cat2: " + cat2);
		System.out.println("Cat3: " + cat3);
		System.out.println("Cat4: " + cat4);
		System.out.println("Cat5: " + cat5);
		
		
	}

}