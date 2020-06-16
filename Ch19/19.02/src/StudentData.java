//Name : Mihir Achyuta
// Date :6/11/20
//Purpose : to use assertions and properly throw exceptions
//PMR : This assigment was very new to me. I never knew that you could throw your own error in a Java program and I thought that errors were limited by the compiler. I had no idea we could throw our own errors in certain situations.

public class StudentData {
    private String firstName;
    private String lastName;
    private double[] assignmentScores;
    private String letterGrade;

    public StudentData(String firstName, String lastName, double[] assignmentScores){
        if(firstName.isEmpty()){
            throw new IllegalArgumentException("First Name Empty");
        }
        else{
            this.firstName = firstName;
        }
        if(lastName.isEmpty()){
            throw new IllegalArgumentException("Last Name Empty");
        }
        else{
            this.lastName = lastName;
        }
        this.assignmentScores = assignmentScores;
        letterGrade = getGrade(assignmentScores);
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String fname){
        firstName = fname;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lname){
        lastName = lname;
    }

    public double[] getAssignmentScores(){
        return assignmentScores;
    }

    public String getLetterGrade(){
        return letterGrade;
    }

    public String scoresString(double[] assignmentScores)
    {
        String a = "";
        for(int i = 0; i < assignmentScores.length; i++)
        {
            a += assignmentScores[i] + "  ";
        }
        return a;
    }
    public void toString(double[] scores)
    {
        System.out.println(getFirstName() + " " + getLastName() + "     " + scoresString(scores) + "  " + getLetterGrade());
    }

    public String getGrade(double[]array){
        if(array.length == 0)
        {
            throw new IllegalArgumentException("Array of Scores Empty");
        }

        double count =0;
        double sum = 0;
        for(int i=0; i<array.length; i++){
            sum+= array[i];
            count++;
        }
        double average = sum/count;
        if(average>=90.0){
            return "A";
        }
        else if(average>=80.0){
            return "B";
        }
        else if(average>=70.0){
            return "C";
        }
        else if(average>=60.0){
            return "D";
        }
        else{
            return "F";
        }
    }

}
