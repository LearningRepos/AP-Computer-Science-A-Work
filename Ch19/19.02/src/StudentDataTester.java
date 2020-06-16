public class StudentDataTester {
    public static void main(String[] args){
        System.out.println("Sucessful Declaration");
        double[] reportCard1 = {5.0,10.0,15.0,20.0,25.0,30.0};
        StudentData ralph = new StudentData("Ralph", "Wiggum",reportCard1);
        ralph.toString(reportCard1);
        System.out.println();

        System.out.println("Illegal Arguement Exception when array is empty");
        System.out.println();
        double[] reportCard2 = {};
        StudentData nelson = new StudentData("Nelson", "Melville",reportCard2);
        nelson.toString(reportCard1);
        System.out.println();

        System.out.println("Illegal Arguement Exception when first name in constructor is empty");
        System.out.println();
//        double[] reportCard3 = {100,200,150,21,430,98};
//        StudentData Bart = new StudentData("", "Simpson",reportCard3);
//        Bart.toString(reportCard1);
//        System.out.println();

        System.out.println("Illegal Arguement Exception when first name in constructor is empty");
        System.out.println();
//        double[] reportCard4 = {100,200,150,21,430,98,87,65,38,76};
////        StudentData Lisa = new StudentData("Lisa", "",reportCard4);
////        Lisa.toString(reportCard1);
////        System.out.println();

    }
}
