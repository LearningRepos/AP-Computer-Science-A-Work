/** Copyright 
*/
//Name : Mihir Achyuta
//Date : 12/16/19
//Purpose : TO manage an arraay of data and to find the average, min, and max of that data
public class AnimalPopOverTimeV8 {

	//Defining Variables
		private int Year0Pop;
		private int Year4Pop;
		private String AnimalType;
		
		//Constructor	
		public AnimalPopOverTimeV8() {}	
		
		//reassigns variables	
		public AnimalPopOverTimeV8(int OneYear, int FourYear, String type) {
			Year0Pop = OneYear;
			Year4Pop = FourYear;
			AnimalType = type; 
			}
		
		//Overloaded Method in which The Animal Population has decimal populations. I add one to the population since I like an overestimate in this case
		public AnimalPopOverTimeV8(double OneYear, double FourYear, String type) {
			Year0Pop = (int)(OneYear+1);
			Year4Pop = (int)(FourYear+1);
			AnimalType = type; 
			
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

		//Array
		AnimalPopOverTimeV8(int start, int finish) {
			Year0Pop = start;
			Year4Pop = finish;
		}


}