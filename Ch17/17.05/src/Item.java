public class Item {
    private String name;
    private int productNumber;
    private int price;
    private int quantity;

    public Item(String name, int productNumber, int price, int quantity){
        this.name = name;
        this.productNumber = productNumber;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }

    public int getProductNumber(){
        return productNumber;
    }

    public int getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setName(String Name){
        name = Name;
    }

    public void setProductNumber(int ProductNumber){
        productNumber = ProductNumber;
    }

    public void setPrice(int Price){
        price = Price;
    }

    public void setQuantity(int Quantity){
        quantity = Quantity;
    }

    public String toString(){
        return "Name: " + name + "          Product Number: " + productNumber + "           Price: " + price + "            Quantity: " + quantity;
    }
}
