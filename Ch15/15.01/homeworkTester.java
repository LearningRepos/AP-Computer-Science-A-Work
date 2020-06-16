import java.util.ArrayList;
//name : Mihir Achyuta
//date : 3/27/20
//Purpose : to create an abstract class and implement in in terms of a homework to do list
//PMR : This project went well and the only part that took me some time was calling the toString() method because I forgot to change the parameters when I changed it so I wasnt overriding the method at first.
public class homeworkTester {
    public static void main(String[] args){
        String type;
        int value;
        ArrayList<Homework> work = new ArrayList<Homework>();

        System.out.println("My Homework Reading To-Do");
        System.out.println();

        work.add(new Trigonometry());
        work.add(new worldHistory());
        work.add(new Spanish());
        work.add(new PE());

        work.get(0).abs(1);
        work.get(1).abs(2);
        work.get(2).abs(3);
        work.get(3).abs(4);

        for(Homework i : work){
            System.out.println(i.toString());
        }
    }
}
