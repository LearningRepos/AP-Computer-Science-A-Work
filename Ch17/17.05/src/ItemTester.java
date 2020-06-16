//name : Mihir Achyuta
//Date : 6/7/20
//Purpose : To use the merge,insertion, and selection sort in sorting various value
//PMR : I liked this project because it utilized various sorts and I was able to code up most of them. I still have a bit of trouble with the merge sort but practice makes perfect.
public class ItemTester {
    public static void main(String[] args){
        Item[] array = new Item[10];
        array[0] = new Item("Apple",3123,543,232);
        array[1] = new Item("Bee",32132,453,645);
        array[2] = new Item("Chocolate",321423,324,4355);
        array[3] = new Item("Dinosaur",32435,323,2342);
        array[4] = new Item("Elephant",45654,3,7686);
        array[5] = new Item("Flamingo",546,234,5467);
        array[6] = new Item("Giraffe",54645,546,75645);
        array[7] = new Item("Hawk",76876,2342,4353);
        array[8] = new Item("Insect",3675,23,45654);
        array[9] = new Item("Joker",43543,3234,45645);

        System.out.println("Traversing original array");
        traverse(array);
        System.out.println();

        System.out.println("Insertion Sort with Names Ascending");
        nameSortAsc(array);
        traverse(array);
        System.out.println();

        System.out.println("Insertion Sort with Names Descending");
        nameSortDesc(array);
        traverse(array);
        System.out.println();

        System.out.println("Selection Sort with Numbers Ascending");
        numberSortAsc(array);
        traverse(array);
        System.out.println();

        System.out.println("Selection Sort with Numbers Descending");
        numberSortDesc(array);
        traverse(array);
        System.out.println();

        System.out.println("Selection Sort with Pricing Ascending");
        priceSortDesc(array);
        traverse(array);
        System.out.println();

        System.out.println("Selection Sort with Pricing Descending");
        priceSortAsc(array);
        traverse(array);
        System.out.println();

        System.out.println("Merge Sort with Quantity Ascending");
        sortQuantity(array,0,array.length-1);
        traverse(array);

    }

    public static void traverse(Item[] array){
        for(int i =0; i<array.length; i++){
            System.out.println(array[i].toString());
        }
    }

    public static void nameSortAsc(Item[] array){
        for(int i =1; i<array.length; i++){
            for(int j =0; j<i; j++){
                if(array[i].getName().compareTo(array[j].getName()) < 0){
                    String nameTemp = array[i].getName();
                    int numberTemp = array[i].getProductNumber();
                    int priceTemp = array[i].getPrice();
                    int quantityTemp = array[i].getQuantity();

                    array[i].setName(array[j].getName());
                    array[i].setPrice(array[j].getPrice());
                    array[i].setProductNumber(array[j].getProductNumber());
                    array[i].setQuantity(array[j].getQuantity());

                    array[j].setName(nameTemp);
                    array[j].setProductNumber(numberTemp);
                    array[j].setPrice(priceTemp);
                    array[j].setQuantity(quantityTemp);
                }
            }
        }
    }

    public static void nameSortDesc(Item[] array){
        for(int i =1; i<array.length; i++){
            for(int j =0; j<i; j++){
                if(array[i].getName().compareTo(array[j].getName()) > 0){
                    String nameTemp = array[i].getName();
                    int numberTemp = array[i].getProductNumber();
                    int priceTemp = array[i].getPrice();
                    int quantityTemp = array[i].getQuantity();

                    array[i].setName(array[j].getName());
                    array[i].setPrice(array[j].getPrice());
                    array[i].setProductNumber(array[j].getProductNumber());
                    array[i].setQuantity(array[j].getQuantity());

                    array[j].setName(nameTemp);
                    array[j].setProductNumber(numberTemp);
                    array[j].setPrice(priceTemp);
                    array[j].setQuantity(quantityTemp);
                }
            }
        }
    }

    public static void numberSortAsc(Item[] array){
        for(int i =0; i<array.length-1; i++){
            int max = i;
            for(int j =i+1; j<array.length; j++){
                if(array[max].getProductNumber()>array[j].getProductNumber()){
                    max = j;
                }
            }
            String nameTemp = array[max].getName();
            int numberTemp = array[max].getProductNumber();
            int priceTemp = array[max].getPrice();
            int quantityTemp = array[max].getQuantity();

            array[max].setName(array[i].getName());
            array[max].setPrice(array[i].getPrice());
            array[max].setProductNumber(array[i].getProductNumber());
            array[max].setQuantity(array[i].getQuantity());

            array[i].setName(nameTemp);
            array[i].setProductNumber(numberTemp);
            array[i].setPrice(priceTemp);
            array[i].setQuantity(quantityTemp);

        }
    }

    public static void numberSortDesc(Item[] array){
        for(int i =0; i<array.length-1; i++){
            int max = i;
            for(int j =i+1; j<array.length; j++){
                if(array[max].getProductNumber()<array[j].getProductNumber()){
                    max = j;
                }
            }
            String nameTemp = array[max].getName();
            int numberTemp = array[max].getProductNumber();
            int priceTemp = array[max].getPrice();
            int quantityTemp = array[max].getQuantity();

            array[max].setName(array[i].getName());
            array[max].setPrice(array[i].getPrice());
            array[max].setProductNumber(array[i].getProductNumber());
            array[max].setQuantity(array[i].getQuantity());

            array[i].setName(nameTemp);
            array[i].setProductNumber(numberTemp);
            array[i].setPrice(priceTemp);
            array[i].setQuantity(quantityTemp);

        }
    }

    public static void priceSortAsc(Item[] array){
        for(int i =0; i<array.length-1; i++){
            int max = i;
            for(int j =i+1; j<array.length; j++){
                if(array[max].getPrice()<array[j].getPrice()){
                    max = j;
                }
            }
            String nameTemp = array[max].getName();
            int numberTemp = array[max].getProductNumber();
            int priceTemp = array[max].getPrice();
            int quantityTemp = array[max].getQuantity();

            array[max].setName(array[i].getName());
            array[max].setPrice(array[i].getPrice());
            array[max].setProductNumber(array[i].getProductNumber());
            array[max].setQuantity(array[i].getQuantity());

            array[i].setName(nameTemp);
            array[i].setProductNumber(numberTemp);
            array[i].setPrice(priceTemp);
            array[i].setQuantity(quantityTemp);

        }
    }

    public static void priceSortDesc(Item[] array){
        for(int i =0; i<array.length-1; i++){
            int max = i;
            for(int j =i+1; j<array.length; j++){
                if(array[max].getPrice()>array[j].getPrice()){
                    max = j;
                }
            }
            String nameTemp = array[max].getName();
            int numberTemp = array[max].getProductNumber();
            int priceTemp = array[max].getPrice();
            int quantityTemp = array[max].getQuantity();

            array[max].setName(array[i].getName());
            array[max].setPrice(array[i].getPrice());
            array[max].setProductNumber(array[i].getProductNumber());
            array[max].setQuantity(array[i].getQuantity());

            array[i].setName(nameTemp);
            array[i].setProductNumber(numberTemp);
            array[i].setPrice(priceTemp);
            array[i].setQuantity(quantityTemp);

        }
    }

    public static void sortQuantity(Item[] array, int low, int high) {
        if (low == high){
            return;
        }

        int mid = (low + high) / 2;

        sortQuantity(array, low, mid);
        sortQuantity(array, mid + 1, high);

        mergeQuantity(array, low, mid, high);
    }

    public static void mergeQuantity(Item[] a, int low, int mid, int high) {
        Item[] temp = new Item[high - low + 1];

        int i = low, j = mid + 1, n = 0;

        while (i <= mid || j <= high) {
            if (i > mid) {
                temp[n] = a[j];
                j++;
            }
            else if (j > high) {
                temp[n] = a[i];
                i++;
            }
            else if (a[i].getQuantity() < a[j].getQuantity()) {
                temp[n] = a[i];
                i++;
            }
            else {
                temp[n] = a[j];
                j++;
            }
            n++;
        }

        for (int k = low; k <= high; k++){
            a[k] = temp[k - low];
        }
    }

}


