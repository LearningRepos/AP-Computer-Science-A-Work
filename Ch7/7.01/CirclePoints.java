/** Copyright 
*/
//Name : Mihir Achyuta
//Date : 11/29/19
//Purpose : To calculate the x,y coordinates of points of a circle in a radius
import java.util.Scanner;
public class CirclePoints {
public static void main(String[] args) {

Scanner in = new Scanner(System.in);
double xc = 1;
double yc =1;
System.out.println("Please enter desired radius: ");
double r = in.nextDouble();
	
System.out.println("Please enter desired incremental value: ");
double inc = in.nextDouble();

System.out.println("Points on a Circle with a Radius of: " + r);
System.out.println("x1          y1                x2         y2");

System.out.println("********************************************");
for(int i =0; i<100; i =i+1) {
	
	double y = Math.sqrt(Math.pow(r, 2)-Math.pow(xc,2));
	System.out.printf("%8f     %8f            %8f     %8f\n", xc  , y,  xc ,y *-1 );
	xc = xc -inc;
}








}}