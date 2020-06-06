/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *Description : This program calculates the amount of foreign currency spent in 3 countries, calculates it into dollars, and then deducts the calculated amount from your original price of $6500 to show the remaining amount after all 3 trips 
 * @author Mihir Achyuta
 * @version 08/31/19       
 */
public class CurrencyV1
{public static void main(String [ ] args){

//Declare and initialize local variables
double startingUsDollars = 6500.00;		// starting US Dollars
double rupeesSpent = 3000;            // Indian Pesos spent
double yenSpent = 5000;               //Japanese Yen Spent
double eurosSpent = 1000;             //Italian Euros Spent

double rupeeExchangeRate = 71.74;     // 1 US dollar = 71.74 euros
double yenExchangerate = 106.30;      // 1 US dollar = 106.20 yen
double euroExchangerate = 0.91;       // 1 US dollar = 0.91 euro  


double dollarsAfterIndia = 6500 - (rupeesSpent/rupeeExchangeRate);        // US dollars remaining after Mexico
double dollarsAfterJapan = dollarsAfterIndia - (yenSpent/yenExchangerate); //US dollars remaining after Mexico and Japan
double dollarsAfterItaly = dollarsAfterJapan - (eurosSpent/euroExchangerate);//US dollars remaining after Mexico, Japan, and Italy
//remaining variables below here

// Message to user stating purpose
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("This program converts an amount of money");
System.out.println("from a specific country into the equivalent");
System.out.println("currency of another country given the current");
System.out.println("exchange rate.");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println();

System.out.println("Starting US Dollars " + startingUsDollars);
System.out.println();

System.out.println("India");
System.out.println(" Rupees Spent :" + rupeesSpent);
System.out.println("US Dollar Equivalent : " + rupeesSpent/rupeeExchangeRate);
System.out.println("US Dollars Remaining: " + dollarsAfterIndia);
System.out.println();

System.out.println("Japan");
System.out.println(" Yen Spent: " + yenSpent);
System.out.println("US Dollar Equivalent : " + yenSpent/yenExchangerate);
System.out.println("Us Dollars Remaining: " + dollarsAfterJapan);
System.out.println();

System.out.println("Italy");
System.out.println(" Euros spent:: " + eurosSpent);
System.out.println("US Dollar Equivalent: " + eurosSpent/euroExchangerate);
System.out.println("US Dollars Remaining " + dollarsAfterItaly);
System.out.println();




// Complete the code below for Souvenir Purchases
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("Souvenir Purchases");
System.out.println(" (all values in US Dollars) ");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

//Calculations for Souvenir #1
int costItem1 = 12;  						//cost per item of first souvenir
int budget1 = 100;   						//budget for first item
int totalItems1 = budget1%costItem1 +4; 		//how many items can be purchased
int fundsRemaining1 = (int)budget1%(int)costItem1;  //how much of the budget is left 

System.out.println("Item 1");
System.out.println("   Cost per item: $" + costItem1 );
System.out.println("   Budget: $"+ budget1);
System.out.println("   Total items purchased: " +  totalItems1);
System.out.println("   Funds remaining: $"  +  fundsRemaining1);
System.out.println();

//Calculations for Souvenir #2
double costItem2 = 29.99;  						//cost per item of second souvenir
int budget2 = 500;   							//budget for second item
int totalItems2 = budget2%(int)costItem2 + 9; 	//how many items can be purchased
double fundsRemaining2 = budget2%costItem2;  	//how much of the budget is left $20.16 no multiplication or subtraction

System.out.println("Item 2");
System.out.println("   Cost per item: $" + costItem2 );
System.out.println("   Budget: $"+ budget2);
System.out.println("   Total items purchased: " +  totalItems2);
System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    
} // end of main method
} // end of class
