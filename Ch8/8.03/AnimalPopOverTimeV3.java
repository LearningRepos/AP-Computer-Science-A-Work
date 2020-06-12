/** Copyright 
*/
// Name: Mihir Achyuta
//Date : 12/13/19
//Purpose : To create an implementation class and utilize it
public class AnimalPopOverTimeV3 {

//Defining Variables
private int Year0Pop;
private int Year4Pop;

//Constructor	
public AnimalPopOverTimeV3() {}	

//Reassigns Variables
public AnimalPopOverTimeV3(int OneYear, int FourYear) {
	Year0Pop = OneYear;
	Year4Pop = FourYear;
	
}
//returns int	
public int PopulationChange() {
	return Year4Pop - Year0Pop;
}
//return double
public double AvgPopChangePerYear() {
	return (Year4Pop-Year0Pop)/4;
}

public static void main(String[] args) {
//NUmerical Values
int Initial = 2367;
int Final = 6948;

//Pop is Constructor
AnimalPopOverTimeV3 Pop = new AnimalPopOverTimeV3(Initial,Final); 

//Uses Pop Constructor to get methods activated
int Change = Pop.PopulationChange();
double Average = Pop.AvgPopChangePerYear();

//Prints Everything up
System.out.println("Animal Populations");
System.out.println("Initial Population(Year0)        FinalPopulation(Year4)        Change In Population         Annual Change in Population");
System.out.printf("%3s %32d %29s %30s",Initial, Final, Change, Average);

}
	











}