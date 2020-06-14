/** Copyright
 */
//Name : Mihir Achyuta
//Date : 12/15/19
//Purpose : To calculate the trajectory of a projectile
public class ThisCatapultsTester {

    public static void main(String[] args) {
        //Defining the speed for the equation and the array
        int speed =0;
        ThisCatapults[][] catapults = new ThisCatapults[7][7];

        //Using for loop to get table outer values and speed
        for(int i =0; i<catapults.length; i = i+1) {
            speed = 5*i + 20;

            for(int j=0; j< catapults.length; j =j+1) {
                catapults[i][j] = new ThisCatapults(speed, 5*j +25);
            }

        }
        //Printing background
        System.out.println("Projectile Distance in Feet");
        System.out.println("MPH   25 Deg   30 Deg   35 Deg   40 Deg   45 Deg   50 Deg   ");
        System.out.println();

        //Printing the actual data
        for (ThisCatapults[] catapult : catapults) {
            System.out.printf("%2.1f ", catapult[0].returnv());
            for (int j = 0; j < catapults.length; j++) {
                catapult[j].calc();
                System.out.printf("%7.2f ", catapult[j].returndist());
            }

            System.out.println();


        }}}