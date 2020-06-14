//Name : Mihir Achyuta
//Date : 3/17/20
//Purpose : To calculate prime numbers in a given range
//PMR : This was easier than the cipher program because all you had to know is the property of a prime number. WIth that it was pretty easy to doe this up
import java.util.Scanner;
public class PrimeTester {
    public static void main(String[] args){
        //create scanner
        Scanner in = new Scanner(System.in);

        //upper and lower limit asked
        System.out.println("Enter Your Lower Limit");
        int lower = in.nextInt();

        System.out.println("Enter Your Upper Limit");
        int upper = in.nextInt();

        //constructor created
        Prime p = new Prime(lower,upper);
        //method called
        p.Calculate();
    }
}