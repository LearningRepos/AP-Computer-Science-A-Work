/** Copyright
 */
//Name : Mihir Achyuta
//Date : 3/17/20
//Purpose : To replace all the instance variables with the this keyword
public class ThisCatapults {
    //Initializes variable
    private double v;
    private double theta;
    private double changex;

    //reassigns variables
    public ThisCatapults(double v, double theta, double changex) {
        this.v = v;
        this.theta = theta;
        this.changex = changex;
    }

    public ThisCatapults(double v, double theta) {
        this.v = v;
        this.theta = theta;

    }

    //Methods to return various variables
    public double returnv(){
        return this.v;
    }

    public double returnangle(){
        return this.theta;
    }

    public double returndist(){
        return this.changex;
    }


    public void calc(){
        this.changex = (Math.pow(this.v, 2) * Math.sin( 2 * Math.toRadians(this.theta)) / 9.8);

    }}

