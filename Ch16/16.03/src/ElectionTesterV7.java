//Name : Mihir Achyuta
//Date : 6/3/20
//Purpose : To traverse, insert, replace, and delete candidates from an array and arraylist
//PMR : Although this project was exhaustive but it made me more comfortable doing all these standard algorithms
public class ElectionTesterV7 {
    Candidate Homer = new Candidate("Homer",0);
    Candidate Marge = new Candidate("Marge",1);
    Candidate Lisa = new Candidate("Lisa",2);
    Candidate Bart = new Candidate("Bart",3);
    Candidate Maggie = new Candidate("Maggie",4);

    private Candidate[] array = {Homer, Marge, Lisa, Bart, Maggie};

    public void candidateInfo(){
        for (Candidate c : array) {
            if (c != null) {
                System.out.println(c);
            }
        }
    }

    public int voteSum(){
        int sum = 0;
        for (Candidate c : array) {
            if (c != null) {
                sum += c.getVotes();
            }
        }
        return sum;
    }

    public void table(){
        for (Candidate c : array) {
            if (c != null) {
                System.out.println(c.getName() + "   " + c.getVotes() + "   " + (c.getVotes()/(double)voteSum())*100 + " percent of votes");
            }
        }
    }

    public void replaceName(String fname, String iname){
        for (Candidate c : array) {
            if (c != null) {
                if(c.getName().equals(fname)){
                    c.setName(iname);
                }
            }
        }
    }

    public void replaceVote(String fname, int votes){
        for (Candidate c : array) {
            if (c != null) {
                if(c.getName().equals(fname)){
                    c.setVotes(votes);
                }
            }
        }
    }

    public void replaceVoteandName(String fname, int votes, String iname){
        for (Candidate c : array) {
            if (c != null) {
                if(c.getName().equals(fname)){
                    c.setVotes(votes);
                    c.setName(iname);
                }
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

    public void deleteByLocation(int position){
        for(int i =position; i<array.length-1; i++){
            array[i] = array[i+1];
        }
        array[array.length-1] = null;
    }

    public void deleteByName(String name){
        int index = 0;
        for(int i =0; i<array.length-1; i++){
            if(array[i].getName() == name){
                index = i;
            }
        }
        deleteByLocation(index);
    }

    public static void main(String[] args) {
        ElectionTesterV7 v7 = new ElectionTesterV7();
        System.out.println("Original Candidates");
        v7.candidateInfo();
        System.out.println();

        System.out.println("Original Total Votes");
        System.out.println("Total number of votes are " + v7.voteSum());
        System.out.println();

        System.out.println("Original Voting Statistics Table");
        v7.table();
        System.out.println("**************************");

        System.out.println("Replaces Homer with Ralph");
        v7.replaceName("Homer", "Ralph");
        System.out.println("Voting Statistics Table with Ralph");
        v7.table();
        System.out.println();

        System.out.println("Replaces ralphs votes from 0 to 100");
        v7.replaceVote("Ralph", 100);
        System.out.println("Voting Statistics Table with Ralph's Votes at 100");
        v7.table();
        System.out.println();

        System.out.println("Replaces Maggie with Skinner and votes from 4 to 0");
        v7.replaceVoteandName("Maggie", 0, "Skinner");
        System.out.println("Voting Statistics Table with Skinner instead of Maggie with 0 votes");
        v7.table();
        System.out.println();
        System.out.println("**************************");

        System.out.println("Inserts Ned at index 2 with 10 votes");
        v7.insertIntoPosition(2,"Ned",10);
        v7.table();
        System.out.println();

        System.out.println("Inserts Millhouse before Lisa with 3 votes");
        v7.findAndInsert("Lisa","Millhouse",3);
        v7.table();
        System.out.println();

        System.out.println("Deletes Index 2 candidate which is Ned by index");
        v7.deleteByLocation(2);
        v7.table();
        System.out.println();

        System.out.println("Deletes Millhouse from Candiadates");
        v7.deleteByName("Millhouse");
        v7.table();
    }
}

