//Name : Mihir Achyuta
//Date : 6/1/20
//Purpose : To create an inventory project utilizing abstract classes, interfaces, and concrete classes.
//PMR : This project was pretty interesting because I solidified my understanding on abstract classes and interfaces and when to use them.

import java.util.ArrayList;
import java.util.List;

public class Tester {

    public static void descInv(String name, List<Product> products) {
        int Quantity = 0;
        int Cost = 0;
        for (Product p : products) {
            if (p.getName().equals(name)) {
                Quantity++;
                Cost += p.getCost();
            }
        }
        System.out.println(name + ": Quantity = " + Quantity + ", Total cost = " + Cost);
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();
        products.add(new Pen("Black Ink Pen", 50));
        products.add(new Pencil("Ticonderoga", 100));
        products.add(new Hybrid_Writing_Tool("Black Ink Ticonderoga", 150));

        products.add(new Pen("Blue Ink Pen", 200));
        products.add(new Pencil("Red Pencil", 250));
        products.add(new Hybrid_Writing_Tool("Blue/Red Pencil", 300));


        Hybrid_Writing_Tool Pen1 = new Hybrid_Writing_Tool("P1", 56);
        Hybrid_Writing_Tool Pen2 = new Hybrid_Writing_Tool("P2", 53);

        descInv("Black Ink Pen", products);
        descInv("Ticonderoga", products);
        descInv("Blue Ink Pen", products);
        descInv("Red Pencil", products);
        descInv("Black Ink Ticonderoga", products);
        descInv("Blue/Red Pencil", products);

        System.out.println();
        if (Pen1.compareTo(Pen2) < 0)
            System.out.println("The second pen is more expensive with a cost of " + Pen2.getCost());
        else if (Pen1.compareTo(Pen2) > 0)
            System.out.println("The first pen is more expensive with a cost of " + Pen1.getCost());
        else
            System.out.println("The pens are the same price with costs of " + Pen1.getCost());
        System.out.println();

        Pen2.setCost(65);
        if (Pen1.compareTo(Pen2) < 0)
            System.out.println("The second pen is more expensive with a cost of " + Pen2.getCost());
        else if (Pen1.compareTo(Pen2) > 0)
            System.out.println("The first pen is more expensive with a cost of " + Pen1.getCost());
        else
            System.out.println("The pens are the same price with costs of " + Pen1.getCost());
        System.out.println();

        Pen1.setCost(65);
        if (Pen1.compareTo(Pen2) < 0)
            System.out.println("The second pen is more expensive with a cost of " + Pen2.getCost());
        else if (Pen1.compareTo(Pen2) > 0)
            System.out.println("The first pen is more expensive with a cost of " + Pen1.getCost());
        else
            System.out.println("The pens are the same price with costs of " + Pen1.getCost());
    }

}
