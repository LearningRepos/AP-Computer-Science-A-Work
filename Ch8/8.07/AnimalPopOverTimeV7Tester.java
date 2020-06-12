/** Copyright 
*/
//Name : Mihir Achyuta
//Date : 12/15/19
//Purpose: to convert my v3 class to v7 and have multiple classes
public class AnimalPopOverTimeV7Tester {

	public static void main(String[] args) {
		//NUmerical Values
		int Initial = 2367;
		int Final = 6948;
		String type = "Lions ";
		
		int Initial2 = 1234;
		int Final2 = 4567;
		String type2 = "Wolves";
		
		double Initial3 = 7890.7;
		double Final3 = 9876.8;	
		String type3 = "Bison ";
		
		//Pop is Constructor
		AnimalPopOverTimeV7 Pop1 = new AnimalPopOverTimeV7(Initial,Final,type); 
		AnimalPopOverTimeV7 Pop2 = new AnimalPopOverTimeV7(Initial2,Final2,type2); 
		AnimalPopOverTimeV7 Pop3 = new  AnimalPopOverTimeV7(Initial3,Final3,type3);
		
		//Uses Pop Constructor to get methods activated
		int Change = Pop1.PopulationChange();
		double Average = Pop1.AvgPopChangePerYear();
		String TType = Pop1.Type();
		
		int Change2 = Pop2.PopulationChange();
		double Average2 = Pop2.AvgPopChangePerYear();
		String TType2 = Pop2.Type();
		
		int Change3 = Pop3.PopulationChange();
		double Average3 = Pop3.AvgPopChangePerYear();
		String TType3 = Pop3.Type();
		
		//Prints Everything up
		System.out.println("Animal Populations");
		System.out.println();
		System.out.println("Type       Initial Population(Year0)        FinalPopulation(Year4)        Change In Population         Annual Change in Population");
		System.out.printf("%5s %8s %32d %29s %30s",TType, Initial, Final, Change, Average);
		System.out.println();
		System.out.printf("%5s %8s %32d %29s %30s",TType2, Initial2, Final2, Change2, Average2);
		System.out.println();
		System.out.println(TType3 + "     " + Initial3 + "                           "+ Final3 + "                        "+  Change3 + "                          " +Average3);

	}

}