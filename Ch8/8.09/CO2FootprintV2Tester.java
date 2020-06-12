/** Copyright 
@author : Mihir Achyuta
@version : v2 12/17/19
@purpose : This program calculates how much carbon dioxide is generated for a gallon of gas
*/


public class CO2FootprintV2Tester {

	public static void main(String[] args) {
		 /**
		  variables initialized
		     */
		double gallonsOfGas = 2410;
		 /**
		  constructor introduced and methods invoked
		     */
	        CO2FootprintV2 footprint = new CO2FootprintV2(gallonsOfGas);
	        footprint.calcTonsCO2();
	        footprint.convertTonsToPounds();
	        /**
	        results printed
	           */
	        System.out.println("           CO2 Emissions");
	        System.out.println("  Gallons   Pounds      Tons");
	        System.out.println("  of Gas   from Gas   from Gas");
	        System.out.println("  ****************************");
	        System.out.printf("  %6.1f   %8.2f    %6.3f", footprint.getGallons(),
	                                                      footprint.getPoundsCO2(),
	                                                      footprint.getTonsCO2());

	        System.out.println();
	
	}

}