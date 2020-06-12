/** Copyright 
//Name : Mihir Achyuta
//Date : 12/19/19
 //Purpose : to calculate carbon dioxide used in 1 year
*/
import java.util.ArrayList;

public class CO2FromWasteTester {
public static void main(String[] args) {
	//array list generated
	 ArrayList<CO2FromWaste> cO2waste = new ArrayList<CO2FromWaste>();
	 //adding elements
     cO2waste.add(new CO2FromWaste(3, true, false, true, true));
     cO2waste.add(new CO2FromWaste(6, false, true, false, true));
     cO2waste.add(new CO2FromWaste(2, true, true, true, true));
     cO2waste.add(new CO2FromWaste(4, true, true, false, true));
     cO2waste.add(new CO2FromWaste(1, false, false, false, false));
     //format printing
     System.out.println("|      |        |                                 |          Pounds of CO2           |");
     System.out.println("|      |        |    Household Waste Recycled     |  Total   |            |    Net   |");
     System.out.println("| Index| People | Paper | Plastic | Glass |  Cans | Emission |  Reduction | Emission |");

     CO2FromWaste Collect;
     //activating methods
     for (CO2FromWaste waste : cO2waste) {
         Collect = waste;
         Collect.calcGrossWasteEmission();
         Collect.calcWasteReduction();
         Collect.calcNetWasteEmission();
     }
     //getting variables back and printing them
     for(int i = 0; i < cO2waste.size(); i=i+1) {
         Collect = cO2waste.get(i);
         System.out.printf("%5d %8d %9b %8b %8b" + " %8b %9.2f %10.2f %12.2f\n", i,
                 Collect.People(), Collect.Paper(),
                 Collect.Plastic(), Collect.Glass(),
                 Collect.Cans(), Collect.getGrossWasteEmission(),
                 Collect.getWasteReduction(), Collect.getNetWasteEmission());
     }
	






}}