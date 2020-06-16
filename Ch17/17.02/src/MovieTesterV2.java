public class MovieTesterV2 {
    public static void traverse(Movie[] array){
        for(int i =0; i<array.length; i++){
            System.out.println(array[i].toString());
        }
    }

    public static void sortYearAsc(Movie[] array){
        for(int i =1;i<array.length; i++){
            for(int j =0; j<i; j++){
                if(array[i].getYear()<array[j].getYear()){
                    //swap happens if right element is greater than left element
                    int temp = array[i].getYear();
                    String tempMovie = array[i].getTitle();
                    String tempStudio = array[i].getStudio();

                    array[i].setTitle(array[j].getTitle());
                    array[i].setYear(array[j].getYear());
                    array[i].setStudio(array[j].getStudio());

                    array[j].setTitle(tempMovie);
                    array[j].setYear(temp);
                    array[j].setStudio(tempStudio);
                }
            }
        }
        traverse(array);
    }

    public static void sortYearDesc(Movie[] array){
        for(int i =1;i<array.length; i++){
            for(int j =0; j<i; j++){
                if(array[i].getYear()>array[j].getYear()){
                    //swap happens if right element is greater than left element
                    int temp = array[i].getYear();
                    String tempMovie = array[i].getTitle();
                    String tempStudio = array[i].getStudio();

                    array[i].setTitle(array[j].getTitle());
                    array[i].setYear(array[j].getYear());
                    array[i].setStudio(array[j].getStudio());

                    array[j].setTitle(tempMovie);
                    array[j].setYear(temp);
                    array[j].setStudio(tempStudio);
                }
            }
        }
        traverse(array);
    }

    public static void sortTitleAsc(Movie[] array){
        for(int i =1;i<array.length; i++){
            for(int j =0; j<i; j++){
                if(array[i].getTitle().compareTo(array[j].getTitle()) < 0){
                    //swap happens if right element is greater than left element
                    int temp = array[i].getYear();
                    String tempMovie = array[i].getTitle();
                    String tempStudio = array[i].getStudio();

                    array[i].setTitle(array[j].getTitle());
                    array[i].setYear(array[j].getYear());
                    array[i].setStudio(array[j].getStudio());

                    array[j].setTitle(tempMovie);
                    array[j].setYear(temp);
                    array[j].setStudio(tempStudio);
                }
            }
        }
        traverse(array);
    }

    public static void sortTitleDesc(Movie[] array){
        for(int i =1;i<array.length; i++){
            for(int j =0; j<i; j++){
                if(array[i].getTitle().compareTo(array[j].getTitle()) > 0){
                    //swap happens if right element is greater than left element
                    int temp = array[i].getYear();
                    String tempMovie = array[i].getTitle();
                    String tempStudio = array[i].getStudio();

                    array[i].setTitle(array[j].getTitle());
                    array[i].setYear(array[j].getYear());
                    array[i].setStudio(array[j].getStudio());

                    array[j].setTitle(tempMovie);
                    array[j].setYear(temp);
                    array[j].setStudio(tempStudio);
                }
            }
        }
        traverse(array);
    }

    public static void sortStudioAsc(Movie[] array){
        for(int i =1;i<array.length; i++){
            for(int j =0; j<i; j++){
                if(array[i].getStudio().compareTo(array[j].getStudio()) < 0){
                    //swap happens if right element is greater than left element
                    int temp = array[i].getYear();
                    String tempMovie = array[i].getTitle();
                    String tempStudio = array[i].getStudio();

                    array[i].setTitle(array[j].getTitle());
                    array[i].setYear(array[j].getYear());
                    array[i].setStudio(array[j].getStudio());

                    array[j].setTitle(tempMovie);
                    array[j].setYear(temp);
                    array[j].setStudio(tempStudio);
                }
            }
        }
        traverse(array);
    }

    public static void sortStudioDesc(Movie[] array){
        for(int i =1;i<array.length; i++){
            for(int j =0; j<i; j++){
                if(array[i].getStudio().compareTo(array[j].getStudio()) > 0){
                    //swap happens if right element is greater than left element
                    int temp = array[i].getYear();
                    String tempMovie = array[i].getTitle();
                    String tempStudio = array[i].getStudio();

                    array[i].setTitle(array[j].getTitle());
                    array[i].setYear(array[j].getYear());
                    array[i].setStudio(array[j].getStudio());

                    array[j].setTitle(tempMovie);
                    array[j].setYear(temp);
                    array[j].setStudio(tempStudio);
                }
            }
        }
        traverse(array);
    }

    public static void main(String[] args){
        Movie[] array = new Movie[11];
        array[0]= new Movie("A-Movie", 2008, "D-Studio");
        array[1]= new Movie("B-Movie", 2007, "C-Studio");
        array[2]= new Movie("C-Movie", 2006, "B-Studio");
        array[3]= new Movie("D-Movie", 2005, "A-Studio");
        array[4]= new Movie("E-Movie", 2004, "E-Studio");
        array[5]= new Movie("F-Movie", 2003, "F-Studio");
        array[6]= new Movie("G-Movie", 2002, "G-Studio");
        array[7]= new Movie("H-Movie", 2001, "H-Studio");
        array[8]= new Movie("I-Movie", 2000, "I-Studio");
        array[9]= new Movie("J-Movie", 1999, "J-Studio");
        array[10]= new Movie("H-Movie", 2001, "H-Studio");

        System.out.println("Traversing through unsorted array");
        traverse(array);

        System.out.println();

        System.out.println("Insertion Sort by Year Ascending");
        sortYearAsc(array);

        System.out.println();

        System.out.println("Insertion Sort by Year Descending");
        sortYearDesc(array);

        System.out.println();

        System.out.println("Insertion Sort by Title Alphabetically");
        sortTitleAsc(array);

        System.out.println();

        System.out.println("Insertion Sort by Title Reverse Alphabetically");
        sortTitleDesc(array);

        System.out.println();

        System.out.println("Insertion Sort by Studio Alphabetically");
        sortStudioAsc(array);

        System.out.println();

        System.out.println("Insertion Sort by Studio Reverse Alphabetically");
        sortStudioDesc(array);
    }
}
