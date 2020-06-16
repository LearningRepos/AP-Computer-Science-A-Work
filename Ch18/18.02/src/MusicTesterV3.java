public class MusicTesterV3 {
    public static void main(String[] args){
        MusicV3[] array = new MusicV3[10];
        array[0] = new MusicV3("Mouse Song",111,"Apple");
        array[1] = new MusicV3("Cat food",324,"Bee");
        array[2] = new MusicV3("Flamingo Song",32342,"Cat");
        array[3] = new MusicV3("Tiger Song",364,"Girrafe");
        array[4] = new MusicV3("A song",3678,"Dog");
        array[5] = new MusicV3("Bee masters",364,"Zebra");
        array[6] = new MusicV3("Dog food",36511,"Bee");
        array[7] = new MusicV3("Cat Song",111,"Girrafe");
        array[8] = new MusicV3("Laptops Song",364,"Human");
        array[9] = new MusicV3("Pencil Song",364,"Laptop");

        System.out.println("Original Array");
        traverse(array);
        System.out.println();

        System.out.println("Insertion Sorted Song Array ");
        SongSort(array);
        traverse(array);
        System.out.println();

        System.out.println("Sucessful Search of Tiger Song");
        BinaryTitle(array,"Tiger Song");
        System.out.println();

        System.out.println("Unsucessful Search of Song76");
        BinaryTitle(array,"Song76");
        System.out.println();

        System.out.println("Insertion Sorted Artist Array ");
        ArtistSort(array);
        traverse(array);
        System.out.println();

        System.out.println("Sucessful Search of Artist Girrafe");
        BinaryArtist(array,"Girrafe");
        System.out.println();

        System.out.println("Unsucessful Search of Artist Animal");
        BinaryArtist(array,"Animal");
        System.out.println();

        System.out.println("Insertion Sorted Year Array ");
        YearSort(array);
        traverse(array);
        System.out.println();

        System.out.println("Sucessful Search of Year364");
        BinaryYear(array,364);
        System.out.println();

        System.out.println("Unsucessful Search of Year365345");
        BinaryYear(array,365345);
        System.out.println();
    }

    public static void traverse(MusicV3[] arr){
        for(int i =0;i<arr.length; i++){
            System.out.println(arr[i].toString());
        }
    }

    public static void SongSort(MusicV3[] array){
        for(int i =1; i<array.length; i++){
            for(int j =0; j<i; j++){
                if(array[i].getTitle().compareTo(array[j].getTitle()) < 0){
                    String titleTemp = array[i].getTitle();
                    String artistTemp = array[i].getArtist();
                    int yearTemp = array[i].getYear();

                    array[i].setTitle(array[j].getTitle());
                    array[i].setArtist(array[j].getArtist());
                    array[i].setYear(array[j].getYear());

                    array[j].setTitle(titleTemp);
                    array[j].setArtist(artistTemp);
                    array[j].setYear(yearTemp);
                }
            }
        }
    }

    public static void BinaryTitle(MusicV3[] array, String title){
        int count =0;
        int left =0;
        int right = array.length -1;
        while(left<=right){
            int mid = (left+right)/2;
            if(title.equals(array[mid].getTitle())){
                System.out.println(array[mid].getTitle());
                count++;
                break;
            }
            else if(array[mid].getTitle().compareTo(title)<0){
                left = mid+1;
            }
            else if(array[mid].getTitle().compareTo(title)>0){
                right = mid-1;
            }
        }
        if(count == 0){
            System.out.println("Not Found");
        }
    }

    public static void ArtistSort(MusicV3[] array){
        for(int i =1; i<array.length; i++){
            for(int j =0; j<i; j++){
                if(array[i].getArtist().compareTo(array[j].getArtist()) < 0){
                    String titleTemp = array[i].getTitle();
                    String artistTemp = array[i].getArtist();
                    int yearTemp = array[i].getYear();

                    array[i].setTitle(array[j].getTitle());
                    array[i].setArtist(array[j].getArtist());
                    array[i].setYear(array[j].getYear());

                    array[j].setTitle(titleTemp);
                    array[j].setArtist(artistTemp);
                    array[j].setYear(yearTemp);
                }
            }
        }
    }

    public static void BinaryArtist(MusicV3[] array, String artist){
        int count =0;
        int left =0;
        int right = array.length -1;
        while(left<=right){
            int mid = (left+right)/2;
            if(artist.equals(array[mid].getArtist())){
                System.out.println("Found Match Printing all Occurences");
                ArtistLoop(array,artist);
                count++;
                break;
            }
            else if(array[mid].getTitle().compareTo(artist)<0){
                left = mid+1;
            }
            else if(array[mid].getTitle().compareTo(artist)>0){
                right = mid-1;
            }
        }
        if(count == 0){
            System.out.println("Not Found");
        }
    }

    public static void ArtistLoop(MusicV3[] arr, String value){
        String sum = "";
        for(int i =0; i<arr.length; i++){
            if(arr[i].getArtist().equals(value)){
                sum += arr[i].getTitle() + " ";
            }
        }
        if(sum.length() > 0){
            System.out.println(sum);
        }
        else{
            System.out.println("Not Found");
        }
    }

    public static void YearSort(MusicV3[] array){
        for(int i =1; i<array.length; i++){
            for(int j =0; j<i; j++){
                if(array[i].getYear()<array[j].getYear()){
                    String titleTemp = array[i].getTitle();
                    String artistTemp = array[i].getArtist();
                    int yearTemp = array[i].getYear();

                    array[i].setTitle(array[j].getTitle());
                    array[i].setArtist(array[j].getArtist());
                    array[i].setYear(array[j].getYear());

                    array[j].setTitle(titleTemp);
                    array[j].setArtist(artistTemp);
                    array[j].setYear(yearTemp);
                }
            }
        }
    }

    public static void BinaryYear(MusicV3[] array, int Year){
        int count =0;
        int left =0;
        int right = array.length -1;
        while(left<=right){
            int mid = (left+right)/2;
            if(Year == array[mid].getYear()){
                System.out.println("Found Match Printing all Occurences");
                count++;
                YearLoop(array,Year);
                break;
            }
            else if(array[mid].getYear()<Year){
                left = mid+1;
            }
            else if(array[mid].getYear()<Year){
                right = mid-1;
            }
        }
        if(count == 0){
            System.out.println("Not Found");
        }
    }

    public static void YearLoop(MusicV3[] arr, int value){
        String sum = "";
        for(int i =0; i<arr.length; i++){
            if(arr[i].getYear() == value){
                sum += arr[i].getTitle() + " ";
            }
        }
        if(sum.length() > 0){
            System.out.println(sum);
        }
        else{
            System.out.println("Not Found");
        }
    }


}
