/** Name : Mihir Achyuta
 * Date : 10/21/19
 * Purpose : This program prompts the user for their personal information in order to buy mechanical keyboards.
*/
import java.util.Scanner;
public class BuyMechanicalKeyboards {
public static void main(String[] args) {
		
Scanner name = new Scanner(System.in);
System.out.println("Please enter your first name");	
String Name = name.nextLine();

Scanner last = new Scanner(System.in);
System.out.println("Please enter your last name");	
String Last = name.nextLine();

Scanner date = new Scanner(System.in);
System.out.println("Please enter the date today in mm/dd/yyyy format");
String Date = date.nextLine();

Scanner itmname = new Scanner(System.in);
System.out.println("Please enter the item that you would like ");
String ItemName = itmname.nextLine();

Scanner num = new Scanner(System.in);
System.out.println("Please enter the number of items you would like to purchase");
String Num = num.nextLine();
int NUM = Integer.parseInt(Num); 

Scanner price = new Scanner(System.in);
System.out.println("Please enter the price that you want to pay for each individual item in dollars");
String Price = price.nextLine();
double PRICE = Double.parseDouble(Price);

Scanner card = new Scanner(System.in);
System.out.println("Please enter your debit card number (####-####-####)");
String Card = card.nextLine();

Scanner pin= new Scanner(System.in);
System.out.println("Please enter your debit card pin (####) ");
String Pin = pin.nextLine();

System.out.println();
System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

System.out.println("Your E-Receipt");
System.out.println();

System.out.println(Date.substring(0,2) + "-" + Date.substring(3,5) + "-" + Date.substring(6,10));
System.out.println("Your Order Number : " + Name.substring(0,2) + Last.substring(0,3));
System.out.println();

System.out.println( Name.substring(0,1) + ". " + Last);
System.out.println("Account: " + "####-####" + Card.substring(9,14) );
System.out.println("Product: " + ItemName);
System.out.println("Number of Keyboards: " + Num);
System.out.println("Keyboard Price: " + Price);
System.out.println();

System.out.println( NUM*PRICE + "$ Will be debited to your account");
System.out.println("Tahnk you for your order!");

}}