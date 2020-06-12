/** Copyright 
@author : Mihir Achyuta
@version : v2 12/17/19
@purpose : This program calculates how much carbon dioxide is generated for a gallon of gas
*/

  /**
  class name introduction
     */
public class CO2FootprintV2 {
	
	  /**
	  private instance variables declared
     */
	private double myGallonsUsed, myTonsCO2, myPoundsCO2;

	  /**
	  constructor for objects of type CO2FootprintV2
	  @param gallons gallons used by the car
	  precondition : gallons is a double and is positive
     */
    CO2FootprintV2(double gallons)
    {
        myGallonsUsed = gallons;
    }

    /**
    method to calculate tons of carbon dioxide produced
    you multiply the gallons used by the constant 8.78 * 10^-3
    (no parameters) 
     */
    public void calcTonsCO2()
    {
        myTonsCO2 = (8.78 * Math.pow(10, -3)) * myGallonsUsed;
    }

    /**
    method to calculate tons to pounds 
    it takes the tons and multiplies it by a constant 2205
    (no parameters) 
     */
    public void convertTonsToPounds()
    {
        myPoundsCO2 = myTonsCO2 * 2205;
    }

    /**
    method to return gallons  
    (no parameters) 
     */
    public double getGallons()
    {
        return myGallonsUsed;
    }

    /**
    method to return tons of carbon dioxide used
    (no parameters) 
     */
    public double getTonsCO2()
    {
        return myTonsCO2;
    }

    /**
    method to return pounds of carbon dioxide used
    (no parameters) 
     */
    public double getPoundsCO2()
    {
        return myPoundsCO2;
    }
}