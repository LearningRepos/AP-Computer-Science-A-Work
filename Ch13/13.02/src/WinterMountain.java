/**
 *  Purpose : This class defines a basic Winter Mountain inheriting Mountain's properties.
 *
 * @author (Mihir Achyuta)
 * @version (2/29/20)
 */
public class WinterMountain extends Mountain {
    public double temperature;
    public WinterMountain(int le, int wi,int moun, double tem){
        super(le,wi,moun);
        temperature = tem;
    }

    public String GetName(){
        return "WinterMountain";
    }

    public String GetWinterMountain(){
        return GetName() + " Land has dimensions " + length + " X " + width + " and has " + mountain + " mountains" + " and temperature " + temperature + " degrees";
    }
}
