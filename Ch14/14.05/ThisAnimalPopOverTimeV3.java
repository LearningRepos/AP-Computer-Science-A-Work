/** Copyright 
 */
// Name: Mihir Achyuta
//Date : 3/17/20
//Purpose : To use the this keyword to replace the instance variables
//PMR : This assignment was fairly easy because I only had to modify the instance variables using this.
public class ThisAnimalPopOverTimeV3 {

    //Defining Variables
    private int Year0Pop;
    private int Year4Pop;

    //Constructor
    public ThisAnimalPopOverTimeV3() {}

    //Reassigns Variables
    public ThisAnimalPopOverTimeV3(int Year0Pop, int Year4Pop) {
        this.Year0Pop = Year0Pop;
        this.Year4Pop = Year4Pop;

    }
    //returns int
    public int PopulationChange() {
        return this.Year4Pop - this.Year0Pop;
    }
    //return double
    public double AvgPopChangePerYear() {
        return (this.Year4Pop-this.Year0Pop)/4;
    }

    public static void main(String[] args) {
//Numerical Values
        int Initial = 2367;
        int Final = 6948;

//Pop is Constructor
        ThisAnimalPopOverTimeV3 Pop = new ThisAnimalPopOverTimeV3(Initial,Final);

//Uses Pop Constructor to get methods activated
        int Change = Pop.PopulationChange();
        double Average = Pop.AvgPopChangePerYear();

//Prints Everything up
        System.out.println("Animal Populations");
        System.out.println("Initial Population(Year0)        FinalPopulation(Year4)        Change In Population         Annual Change in Population");
        System.out.printf("%3s %32d %29s %30s",Initial, Final, Change, Average);
        System.out.println();

    }












}