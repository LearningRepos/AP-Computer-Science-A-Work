public class Students {
    private int score1;
    private int score2;
    private int score3;
    private int score4;
    private int score5;

    private String name;

    public Students(String name, int score1, int score2, int score3, int score4, int score5){
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.score4 = score4;
        this.score5 = score5;
    }

    public int getScore(int quizNum) {
        if (quizNum == 1) {
            return this.score1;
        } else if (quizNum == 2) {
            return this.score2;
        } else if (quizNum == 3) {
            return this.score3;
        } else if (quizNum == 4) {
            return this.score4;
        } else {
            return this.score5;
        }
    }

    public void setScore(int quizNum, int quizScore){
        if (quizNum == 1) {
            this.score1 = quizScore;
        } else if (quizNum == 2) {
            this.score2 = quizScore;
        } else if (quizNum == 3) {
            this.score3 = quizScore;
        } else if (quizNum == 4) {
            this.score4 = quizScore;
        } else {
            this.score5 = quizScore;
        }
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        return "The Student is " + getName() + " and their scores are " + this.score1 + " " + this.score2 + " "+ this.score3 + " " + this.score4 +" "+ this.score5 ;
    }

}
