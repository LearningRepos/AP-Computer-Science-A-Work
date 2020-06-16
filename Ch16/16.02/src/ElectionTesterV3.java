public class ElectionTesterV3{
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

    public static void main(String[] args) {
        ElectionTesterV3 v3 = new ElectionTesterV3();
        System.out.println("Original Candidates");
        v3.candidateInfo();
        System.out.println();

        System.out.println("Original Total Votes");
        System.out.println("Total number of votes are " + v3.voteSum());
        System.out.println();

        System.out.println("Original Voting Statistics Table");
        v3.table();
        System.out.println("**************************");

        System.out.println("Replaces Homer with Ralph");
        v3.replaceName("Homer", "Ralph");
        System.out.println("Voting Statistics Table with Ralph");
        v3.table();
        System.out.println();

        System.out.println("Replaces ralphs votes from 0 to 100");
        v3.replaceVote("Ralph", 100);
        System.out.println("Voting Statistics Table with Ralph's Votes at 100");
        v3.table();
        System.out.println();

        System.out.println("Replaces Maggie with Skinner and votes from 4 to 0");
        v3.replaceVoteandName("Maggie", 0, "Skinner");
        System.out.println("Voting Statistics Table with Skinner instead of Maggie with 0 votes");
        v3.table();
        System.out.println();
        System.out.println("**************************");


    }
}