//Name : Mihir Achyuta
//Date : 6/3/20
//Purpose : To traverse, insert, replace, and delete candidates from an array and arraylist
//PMR : Although this project was exhaustive but it made me more comfortable doing all these standard algorithms
public class ElectionTesterV5 {
    Candidate Homer = new Candidate("Homer",0);
    Candidate Marge = new Candidate("Marge",1);
    Candidate Lisa = new Candidate("Lisa",2);
    Candidate Bart = new Candidate("Bart",3);
    Candidate Maggie = new Candidate("Maggie",4);

    private Candidate[] array = {Homer, Marge, Lisa, Bart, Maggie};

    public void candidateInfo(){
        for(int i =0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    public int voteSum(){
        int sum = 0;
        for(int i =0; i<array.length; i++){
            sum += array[i].getVotes();
        }
        return sum;
    }

    public void table(){
        for(int i =0; i<array.length; i++){
            System.out.println(array[i].getName() + "   " + array[i].getVotes() + "   " + (array[i].getVotes()/(double)voteSum())*100 + " percent of votes");
        }
    }

    public void replaceName(String fname, String iname){
        for(int i =0; i<array.length; i++){
            if(array[i].getName().equals(fname)){
                array[i].setName(iname);
            }
        }
    }

    public void replaceVote(String fname, int votes){
        for(int i =0; i<array.length; i++){
            if(array[i].getName().equals(fname)){
                array[i].setVotes(votes);
            }
        }
    }

    public void replaceVoteandName(String fname, int votes, String iname){
        for(int i =0; i<array.length; i++){
            if(array[i].getName().equals(fname)){
                array[i].setVotes(votes);
                array[i].setName(iname);
            }
        }
    }

    public void insertIntoPosition(int position, String name, int votes){
        for(int i = array.length-1; i>position; i--){
            String temp = array[i-1].getName();
            int tomp = array[i-1].getVotes();
            array[i].setName(temp);
            array[i].setVotes(tomp);
        }
        array[position].setName(name);
        array[position].setVotes(votes);
    }

    public void findAndInsert(String findName, String name, int votes){
        int index = 0;
        for(int i =0; i<array.length; i++){
            if(array[i].getName() == findName){
                index = i;
            }
        }
        insertIntoPosition(index,name,votes);
    }

    public static void main(String[] args) {
        ElectionTesterV5 v5 = new ElectionTesterV5();
        System.out.println("Original Candidates");
        v5.candidateInfo();
        System.out.println();

        System.out.println("Original Total Votes");
        System.out.println("Total number of votes are " + v5.voteSum());
        System.out.println();

        System.out.println("Original Voting Statistics Table");
        v5.table();
        System.out.println("**************************");

        System.out.println("Replaces Homer with Ralph");
        v5.replaceName("Homer", "Ralph");
        System.out.println("Voting Statistics Table with Ralph");
        v5.table();
        System.out.println();

        System.out.println("Replaces ralphs votes from 0 to 100");
        v5.replaceVote("Ralph", 100);
        System.out.println("Voting Statistics Table with Ralph's Votes at 100");
        v5.table();
        System.out.println();

        System.out.println("Replaces Maggie with Skinner and votes from 4 to 0");
        v5.replaceVoteandName("Maggie", 0, "Skinner");
        System.out.println("Voting Statistics Table with Skinner instead of Maggie with 0 votes");
        v5.table();
        System.out.println();
        System.out.println("**************************");

        System.out.println("Inserts Ned at index 2 with 10 votes");
        v5.insertIntoPosition(2,"Ned",10);
        v5.table();
        System.out.println();

        System.out.println("Inserts Millhouse before Lisa with 3 votes");
        v5.findAndInsert("Lisa","Millhouse",3);
        v5.table();
    }
}
