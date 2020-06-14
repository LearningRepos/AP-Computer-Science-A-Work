/**
 *  Purpose : This class executes all previous classes.
 *
 * @author (Mihir Achyuta)
 * @version (2/29/20)
 * PMR : This was an interesting project because I was getting into the zone into extending classes and it was a good review on constructors also
 */
import java.util.*;
public class GameTerrainTester {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);


        int len = 100;
        int wid = 200;
        Terrain haha = new Terrain(len ,wid);
        System.out.println(haha.GetTerrainSize());

        len = 300;
        wid = 400;
        int tree = 500;
        Forest hehee = new Forest(len,wid, tree);
        System.out.println(hehee.GetForestSize());

        len = 600;
        wid = 700;
        int mountain = 800;
        Mountain hohoo = new Mountain(len,wid, mountain);
        System.out.println(hohoo.GetMountainSize());

        len = 900;
        wid = 1000;
        mountain = 1100;
        double temperature = 1200;
        WinterMountain lol = new WinterMountain (len,wid, mountain, temperature);
        System.out.println(lol.GetWinterMountain());

        len = 1300;
        wid = 1400;
        String climate = "burning";
        Weather lul = new Weather(len,wid,climate);
        System.out.println(lul.GetWeather());

        len = 1500;
        wid = 1600;
        int animal = 1700;
        tree = 1800;
        TreeAnimal lel = new TreeAnimal(len,wid,tree,animal);
        System.out.println(lel.GetTreeAnimal());
    }
}
