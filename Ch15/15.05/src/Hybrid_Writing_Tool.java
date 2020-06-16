//Name : Mihir Achyuta
//Date : 6/1/20
//Purpose : To create an inventory project utilizing abstract classes, interfaces, and concrete classes.
//PMR : This project was pretty interesting because I solidified my understanding on abstract classes and interfaces and when to use them.
public class Hybrid_Writing_Tool implements Comparable<Hybrid_Writing_Tool>, Product {
    private String name;
    private int cost;

    public Hybrid_Writing_Tool(String name, int cost){
        this.name = name;
        this.cost = cost;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int compareTo(Hybrid_Writing_Tool T) {
        int diff = this.cost - T.getCost();
        if (diff < 0)
            return -1;
        else if (diff > 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
