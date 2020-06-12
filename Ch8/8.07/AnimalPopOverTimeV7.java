/** Copyright 
*/
//Name : Mihir Achyuta
//Date : 12/15/19
//Purpose: to convert my v3 class to v7 and have multiple classes
public class AnimalPopOverTimeV7 {
	
	//Defining Variables
	private int Year0Pop;
	private int Year4Pop;
	private String AnimalType;
	
	//Constructor	
	public AnimalPopOverTimeV7() {}	
	
	//reassigns variables	
	public AnimalPopOverTimeV7(int OneYear, int FourYear, String type) {
		Year0Pop = OneYear;
		Year4Pop = FourYear;
		AnimalType = type; 
		}
	
	//Overloaded Method in which The Animal Population has decimal populations. I add one to the population since I like an overestimate in this case
	public AnimalPopOverTimeV7(double OneYear, double FourYear, String type) {
		Year0Pop = (int)(OneYear+1);
		Year4Pop = (int)(FourYear+1);
		AnimalType = type; 
		System.out.println("Overloaded Method");
		}
	
	
	//return int
	public int PopulationChange() {
		return Year4Pop - Year0Pop;
	}
		
	
	//return double
	public double AvgPopChangePerYear() {
		return (Year4Pop-Year0Pop)/4;
	}

	//return Type
	public String Type() {
		return AnimalType;
	}
}

	