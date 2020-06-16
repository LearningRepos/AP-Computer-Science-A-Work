public class MovieTesterV4 {
    public static void traverse(MovieV4[] array){
        for(int i =0; i<array.length; i++){
            System.out.println(array[i].toString());
        }
    }

    public static void sortYears(MovieV4[] array, int low, int high) {
        if (low == high){
            return;
        }

        int mid = (low + high) / 2;

        sortYears(array, low, mid);
        sortYears(array, mid + 1, high);

        mergeYears(array, low, mid, high);
    }

    public static void mergeYears(MovieV4[] a, int low, int mid, int high) {
        MovieV4[] temp = new MovieV4[high - low + 1];

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
            else if (a[i].getYear() < a[j].getYear()) {
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

    public static void sortTitle(MovieV4[] array, int low, int high) {
        if (low == high){
            return;
        }

        int mid = (low + high) / 2;

        sortTitle(array, low, mid);
        sortTitle(array, mid + 1, high);

        mergeTitle(array, low, mid, high);
    }

    public static void mergeTitle(MovieV4[] a, int low, int mid, int high) {
        MovieV4[] temp = new MovieV4[high - low + 1];

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
            else if (a[i].getTitle().compareTo(a[j].getTitle())<0) {
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

    public static void sortStudio(MovieV4[] array, int low, int high) {
        if (low == high){
            return;
        }

        int mid = (low + high) / 2;

        sortStudio(array, low, mid);
        sortStudio(array, mid + 1, high);

        mergeStudio(array, low, mid, high);
    }

    public static void mergeStudio(MovieV4[] a, int low, int mid, int high) {
        MovieV4[] temp = new MovieV4[high - low + 1];

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
            else if (a[i].getStudio().compareTo(a[j].getStudio())<0) {
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


    public static void main(String[] args){
        MovieV4[] array = new MovieV4[11];
        array[0]= new MovieV4("A-Movie", 2008, "D-Studio");
        array[1]= new MovieV4("B-Movie", 2007, "C-Studio");
        array[2]= new MovieV4("C-Movie", 2006, "B-Studio");
        array[3]= new MovieV4("D-Movie", 2005, "A-Studio");
        array[4]= new MovieV4("E-Movie", 2004, "E-Studio");
        array[5]= new MovieV4("F-Movie", 2003, "F-Studio");
        array[6]= new MovieV4("G-Movie", 2002, "G-Studio");
        array[7]= new MovieV4("H-Movie", 2001, "H-Studio");
        array[8]= new MovieV4("I-Movie", 2000, "I-Studio");
        array[9]= new MovieV4("J-Movie", 1999, "J-Studio");
        array[10]= new MovieV4("H-Movie", 2001, "H-Studio");

        System.out.println("Traversing through unsorted array");
        traverse(array);

        System.out.println();

        System.out.println("Merge Sort By Year Ascending");
        sortYears(array,0,array.length-1);
        traverse(array);

        System.out.println();

        System.out.println("Merge Sort By Movie Ascending");
        sortTitle(array,0,array.length-1);
        traverse(array);

        System.out.println();

        System.out.println("Merge Sort By Studio Ascending");
        sortStudio(array,0,array.length-1);
        traverse(array);
    }
}


