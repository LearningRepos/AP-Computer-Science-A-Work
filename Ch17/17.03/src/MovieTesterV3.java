public class MovieTesterV3 {
    public static void traverse(MovieV3[] array){
        for(int i =0; i<array.length; i++){
            System.out.println(array[i].toString());
        }
    }

    public static void sortYearAsc(MovieV3[] array){
        for(int i =0; i<array.length-1; i++){
            int max = i;
            for(int j = i+1; j<array.length; j++){
                if(array[max].getYear()>array[j].getYear()){
                    max = j;
                }
            }
            int temp = array[max].getYear();
            String tempMovie = array[max].getTitle();
            String tempStudio = array[max].getStudio();

            array[max].setTitle(array[i].getTitle());
            array[max].setYear(array[i].getYear());
            array[max].setStudio(array[i].getStudio());

            array[i].setTitle(tempMovie);
            array[i].setYear(temp);
            array[i].setStudio(tempStudio);
        }
        traverse(array);
    }

    public static void sortYearDesc(MovieV3[] array){
        for(int i =0; i<array.length-1; i++){
            int max = i;
            for(int j = i+1; j<array.length; j++){
                if(array[max].getYear()<array[j].getYear()){
                    max = j;
                }
            }
            int temp = array[max].getYear();
            String tempMovie = array[max].getTitle();
            String tempStudio = array[max].getStudio();

            array[max].setTitle(array[i].getTitle());
            array[max].setYear(array[i].getYear());
            array[max].setStudio(array[i].getStudio());

            array[i].setTitle(tempMovie);
            array[i].setYear(temp);
            array[i].setStudio(tempStudio);
        }
        traverse(array);
    }

    public static void sortTitleAsc(MovieV3[] array){
        for(int i =0; i<array.length-1; i++){
            int max = i;
            for(int j = i+1; j<array.length; j++){
                if(array[i].getTitle().compareTo(array[j].getTitle()) > 0){
                    max = j;
                }
            }
            int temp = array[max].getYear();
            String tempMovie = array[max].getTitle();
            String tempStudio = array[max].getStudio();

            array[max].setTitle(array[i].getTitle());
            array[max].setYear(array[i].getYear());
            array[max].setStudio(array[i].getStudio());

            array[i].setTitle(tempMovie);
            array[i].setYear(temp);
            array[i].setStudio(tempStudio);
        }
        traverse(array);
    }

    public static void sortTitleDesc(MovieV3[] array){
        for(int i =0; i<array.length-1; i++){
            int max = i;
            for(int j = i+1; j<array.length; j++){
                if(array[i].getTitle().compareTo(array[j].getTitle()) < 0){
                    max = j;
                }
            }
            int temp = array[max].getYear();
            String tempMovie = array[max].getTitle();
            String tempStudio = array[max].getStudio();

            array[max].setTitle(array[i].getTitle());
            array[max].setYear(array[i].getYear());
            array[max].setStudio(array[i].getStudio());

            array[i].setTitle(tempMovie);
            array[i].setYear(temp);
            array[i].setStudio(tempStudio);
        }
        traverse(array);
    }

    public static void sortStudioAsc(MovieV3[] array){
        for(int i =0; i<array.length-1; i++){
            int max = i;
            for(int j = i+1; j<array.length; j++){
                if(array[i].getStudio().compareTo(array[j].getStudio()) > 0){
                    max = j;
                }
            }
            int temp = array[max].getYear();
            String tempMovie = array[max].getTitle();
            String tempStudio = array[max].getStudio();

            array[max].setTitle(array[i].getTitle());
            array[max].setYear(array[i].getYear());
            array[max].setStudio(array[i].getStudio());

            array[i].setTitle(tempMovie);
            array[i].setYear(temp);
            array[i].setStudio(tempStudio);
        }
        traverse(array);
    }

    public static void sortStudioDesc(MovieV3[] array){
        for(int i =0; i<array.length-1; i++){
            int max = i;
            for(int j = i+1; j<array.length; j++){
                if(array[i].getStudio().compareTo(array[j].getStudio()) < 0){
                    max = j;
                }
            }
            int temp = array[max].getYear();
            String tempMovie = array[max].getTitle();
            String tempStudio = array[max].getStudio();

            array[max].setTitle(array[i].getTitle());
            array[max].setYear(array[i].getYear());
            array[max].setStudio(array[i].getStudio());

            array[i].setTitle(tempMovie);
            array[i].setYear(temp);
            array[i].setStudio(tempStudio);
        }
        traverse(array);
    }

    public static void main(String[] args){
        MovieV3[] array = new MovieV3[11];
        array[0]= new MovieV3("A-Movie", 2008, "D-Studio");
        array[1]= new MovieV3("B-Movie", 2007, "C-Studio");
        array[2]= new MovieV3("C-Movie", 2006, "B-Studio");
        array[3]= new MovieV3("D-Movie", 2005, "A-Studio");
        array[4]= new MovieV3("E-Movie", 2004, "E-Studio");
        array[5]= new MovieV3("F-Movie", 2003, "F-Studio");
        array[6]= new MovieV3("G-Movie", 2002, "G-Studio");
        array[7]= new MovieV3("H-Movie", 2001, "H-Studio");
        array[8]= new MovieV3("I-Movie", 2000, "I-Studio");
        array[9]= new MovieV3("J-Movie", 1999, "J-Studio");
        array[10]= new MovieV3("H-Movie", 2001, "H-Studio");

        System.out.println("Traversing through unsorted array");
        traverse(array);

        System.out.println();

        System.out.println("Insertion Sort by Studio Alphabetically");
        sortStudioAsc(array);

        System.out.println();

        System.out.println("Insertion Sort by Studio Reverse Alphabetically");
        sortStudioDesc(array);

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

    }
}

