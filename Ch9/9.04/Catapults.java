/** Copyright 
*/
//Name : Mihir Achyuta
//Date : 12/15/19
//Purpose : To calculate the trajectory of a projectile
public class Catapults {
		//Initializes variable
	  private double v;
	  private double theta;
	  private double changex;

	  //reassigns variables
	    public Catapults(double velocity, double degrees) {
	        v = velocity;
	        theta = degrees;
	    }
	    
	    //Methods to return various variables
	    public double returnv(){
	        return v;
	    }

	    public double returnangle(){
	        return theta;
	    }

	    public double returndist(){
	        return changex;
	    }

	    
	    public void calc(){
	        changex = (Math.pow(v, 2) * Math.sin( 2 * Math.toRadians(theta)) / 9.8);
	    
	    }}
	
