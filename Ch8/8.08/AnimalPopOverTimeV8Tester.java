/** Copyright 
*/
import java.util.Arrays;
public class AnimalPopOverTimeV8Tester {
public static void main(String[] args) {
	
		//NUmerical Values
		int u = 0;
		int j = 0;
		int Initial = 2367;
		int Final = 6948;
		String type = "Lions ";
		
		int Initial2 = 1234;
		int Final2 = 4567;
		String type2 = "Wolves";
		
		int Initial3 = 7890;
		int Final3 = 9876;	
		String type3 = "Bison ";
		
		//Data Stored as array
		int[] DataIn = {Initial, Initial2, Initial3};
		int[] DataFin = {Final, Final2, Final3};
				
		
		//Calculating Average Population By adding up Populations
		for ( int i = 0; i < DataIn.length;  i++) {
			u += DataIn[i];
			
		}
		
		for ( int y = 0; y < DataFin.length;  y++) {
			j += DataFin[y];
			
		}
		
		//Pop is Constructor
		AnimalPopOverTimeV8 Pop1 = new AnimalPopOverTimeV8(Initial,Final,type); 
		AnimalPopOverTimeV8 Pop2 = new AnimalPopOverTimeV8(Initial2,Final2,type2); 
		AnimalPopOverTimeV8 Pop3 = new  AnimalPopOverTimeV8(Initial3,Final3,type3);
		
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
		
		AnimalPopOverTimeV8[] apple = {
				new AnimalPopOverTimeV8(Initial,Final),
				new AnimalPopOverTimeV8(Initial, Final2),
				new AnimalPopOverTimeV8(Initial, Final3)
		};
		
		int sum =0;
		for(AnimalPopOverTimeV8 pear : apple) {
			//sum += pear;
		}
		
		//Prints Everything up
		System.out.println("Animal Populations");
		System.out.println();
		System.out.println("Type       Initial Population(Year0)        FinalPopulation(Year4)        Change In Population         Annual Change in Population");
		//toString() method used here 
		System.out.printf("%5s %8s %32d %29s %30s",TType.toString(), Initial, Final, Change, Average);
		System.out.println();
		System.out.printf("%5s %8s %32d %29s %30s",TType2.toString(), Initial2, Final2, Change2, Average2);
		System.out.println();
		System.out.println(TType3.toString() + "     " + Initial3 + "                           "+ Final3 + "                        "+  Change3 + "                          " +Average3);	
		System.out.println();
		
		//Arrays now sorted from least to greatest so min and max value can be found easier
		Arrays.sort(DataIn);
		Arrays.sort(DataFin);
		
		System.out.println("Minimum Initial Population: " + DataIn[0]);
		System.out.println("Maximum Initial Population: " + DataIn[2]);
		System.out.println("Average Initial Population: " + u/3.0);
		System.out.println();
		System.out.println("Minimum Final Population: " + DataFin[0]);
		System.out.println("Maximum Final Population: " + DataFin[2]);
		System.out.println("Average Final Population: " + j/3.0);

}}