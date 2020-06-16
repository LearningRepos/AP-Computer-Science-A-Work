public class MusicTester {
    public static void main(String[] args){
        Music[] array = new Music[10];
        array[0] = new Music("Song1",3211,"Artist1");
        array[1] = new Music("Song2",324,"Artist43");
        array[2] = new Music("Song3",32342,"Artist3");
        array[3] = new Music("Song4",364,"Artist43");
        array[4] = new Music("Song5",3678,"Artist32");
        array[5] = new Music("Song6",36571,"Artist1");
        array[6] = new Music("Song7",36511,"Artist32");
        array[7] = new Music("Song8",3786,"Artist423");
        array[8] = new Music("Song9",364,"Artist32");
        array[9] = new Music("Song10",32654,"Artist53");

        System.out.println("Original Array");
        traverse(array);
        System.out.println();

        System.out.println("Sucessful Search of Song6");
        System.out.println(SongSearch(array,"Song6"));
        System.out.println();

        System.out.println("Unsucessful Search of Song76");
        System.out.println(SongSearch(array,"Song76"));
        System.out.println();

        System.out.println("Sucessful Search of Artist32");
        System.out.println(ArtistSearch(array,"Artist32"));
        System.out.println();

        System.out.println("Unsucessful Search of Artist324223");
        System.out.println(ArtistSearch(array,"Artist324223"));
        System.out.println();

        System.out.println("Sucessful Search of Year364");
        System.out.println(YearSearch(array,364));
        System.out.println();

        System.out.println("Unsucessful Search of Year365345");
        System.out.println(YearSearch(array,365345));
        System.out.println();
    }

    public static void traverse(Music[] arr){
        for(int i =0;i<arr.length; i++){
            System.out.println(arr[i].toString());
        }
    }

    public static String SongSearch(Music[] arr, String value){
        for(int i =0; i<arr.length; i++){
            if(arr[i].getTitle().equals(value)){
                return "Found at Index: " + i + " "+arr[1].getTitle();
            }
        }
        return "Not Found";
    }

    public static String ArtistSearch(Music[] arr, String value){
        String sum = "";
        for(int i =0; i<arr.length; i++){
            if(arr[i].getArtist().equals(value)){
                sum += arr[i].getTitle() + " ";
            }
        }
        if(sum.length() > 0){
            return sum;
        }
        return "Not Found";
    }

    public static String YearSearch(Music[] arr, int value){
        String sum = "";
        for(int i =0; i<arr.length; i++){
            if(arr[i].getYear() == value){
                sum += arr[i].getTitle() + " ";
            }
        }
        if(sum.length() > 0){
            return sum;
        }
        return "Not Found";
    }
}
