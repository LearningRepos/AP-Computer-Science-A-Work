/**
 *  Purpose : This class defines a basic Weather inheriting Terrain's properties
 *
 * @author (Mihir Achyuta)
 * @version (2/29/20)
 */
public class Weather extends Terrain {
    private String climate;
    public Weather(int le, int wi, String str){
        super(le,wi);
        climate = str;
    }

    public String GetName(){
        return "Weather";
    }

    public String GetWeather(){
        return GetName() + " Land has dimensions " + length + " X " + width + " and is " + climate;
    }
}
