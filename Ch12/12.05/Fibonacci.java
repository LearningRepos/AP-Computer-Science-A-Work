//Name : Mihir Achyuta
//Date : 2/8/20
//Purpose : to calcualte the sum of a fibonacci sequence given the nth term
import java.util.Scanner;
public class Fibonacci {

    public static int Fibb(int x){
        if(x<=1){
            return x;
        }
        return Fibb(x-1) + Fibb(x-2);

    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int val = 0;

        while(true) {
            System.out.println("Enter an Integer Value or Enter a Letter(a-z any caps) to Quit: ");
            String value = in.next();
            try{
                val = Integer.parseInt(value);

            }
            catch(Exception e){
                break;
            }
            //Execute Fibonacci Function Here
            int answer = Fibb(val);
            System.out.println(answer);
        }

    }
}