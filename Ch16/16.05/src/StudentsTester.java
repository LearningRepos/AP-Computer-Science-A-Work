//Name : Mihir Achyuta
//Date : 6/3/20
//Purpose : To demonstrate traversing, replacing and deleting students in an arraylist
//PMR : This was pretty easy since the previous assignment prepared me for all these algorithms.

import java.util.ArrayList;
public class StudentsTester {

    public static void Traverse(ArrayList<Students> array){
        for(int i =0; i<array.size(); i++){
            System.out.println(array.get(i).toString());
        }
    }

    public static void replaceName(String findName,String name,ArrayList<Students> array){
        for(int i =0; i<array.size(); i++){
            if(array.get(i).getName() == findName){
                array.get(i).setName(name);
                break;
            }
        }
    }

   public static void replaceQuiz(ArrayList<Students> array, int quizNumber, int quizScore, String findName){
       for(int i =0; i<array.size(); i++){
           if(array.get(i).getName() == findName){
               array.get(i).setScore(quizNumber,quizScore);
               break;
           }
       }
   }

   public static void replaceStudent(ArrayList<Students> array,String findName, String name, int q1,int q2, int q3, int q4,int q5){
        for(int i =0; i<array.size(); i++){
            if(array.get(i).getName() == findName){
                array.get(i).setName(name);
                array.get(i).setScore(1,q1);
                array.get(i).setScore(2,q2);
                array.get(i).setScore(3,q3);
                array.get(i).setScore(4,q4);
                array.get(i).setScore(5,q5);
            }
        }
   }

   public static void insertStudent(ArrayList<Students> array,String findName, String name, int q1,int q2, int q3, int q4,int q5){
       for(int i =0; i<array.size(); i++){
           if(array.get(i).getName() == findName){
               array.add(i,new Students(name,q1,q2,q3,q4,q5));
               break;
           }
       }
   }

   public static void deleteStudent(ArrayList<Students> array,String findName){
       for(int i =0; i<array.size(); i++){
           if(array.get(i).getName() == findName){
               array.remove(i);
               break;
           }
       }
   }

    public static void main(String args[]) {
        ArrayList<Students> arrayList = new ArrayList<Students>();
        arrayList.add(new Students("Bart",1,2,3,4,5));
        arrayList.add(new Students("Ralph",6,7,8,9,10));
        arrayList.add(new Students("Millhouse",11,12,13,14,15));
        arrayList.add(new Students("Lisa",16,17,18,19,20));
        arrayList.add(new Students("Nelville",21,22,23,24,25));

        System.out.println("Starting Students Traversed And Printed");
        Traverse(arrayList);
        System.out.println();

        System.out.println("Replaces Bart with Itchy");
        replaceName("Bart","Itchy", arrayList);
        Traverse(arrayList);
        System.out.println();

        System.out.println("Replaces Ralph's 1st Quiz grade of 6 to 100");
        replaceQuiz(arrayList,1,100,"Ralph");
        Traverse(arrayList);
        System.out.println();

        System.out.println("Replaces Lisa with Homer along with her test scores");
        replaceStudent(arrayList,"Lisa", "Homer",0,0,0,0,0);
        Traverse(arrayList);
        System.out.println();

        System.out.println("Inserts Scratchy before Ralph");
        insertStudent(arrayList,"Ralph","Scratchy",123,456,789,987,654);
        Traverse(arrayList);
        System.out.println();

        System.out.println("Deletes Millhouse");
        deleteStudent(arrayList,"Millhouse");
        Traverse(arrayList);
        System.out.println();
    }
}
