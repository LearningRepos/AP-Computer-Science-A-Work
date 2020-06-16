import java.util.ArrayList;
public class ElectionTesterV4{
    Candidate Homer = new Candidate("Homer",0);
    Candidate Marge = new Candidate("Marge",1);
    Candidate Lisa = new Candidate("Lisa",2);
    Candidate Bart = new Candidate("Bart",3);
    Candidate Maggie = new Candidate("Maggie",5);

    private ArrayList<Candidate> arrayList = new ArrayList<Candidate>();

    public ElectionTesterV4(){
        arrayList.add(Homer);
        arrayList.add(Marge);
        arrayList.add(Lisa);
        arrayList.add(Bart);
        arrayList.add(Maggie);
    }

    public void candidateInfo(){
        for(int i =0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }

    public int voteSum(){
        int sum = 0;
        for(int i =0; i<arrayList.size(); i++){
            sum += arrayList.get(i).getVotes();
        }
        return sum;
    }

    public void table(){
        for(int i =0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i).getName() + "   " + arrayList.get(i).getVotes() + "   " + (arrayList.get(i).getVotes()/(double)voteSum())*100 + " percent of votes");
        }
    }

    public void replaceName(String fname, String iname){
        for(int i =0; i<arrayList.size(); i++){
            if(arrayList.get(i).getName().equals(fname)){
                arrayList.get(i).setName(iname);
            }
        }
    }

    public void replaceVote(String fname, int votes){
        for(int i =0; i<arrayList.size(); i++){
            if(arrayList.get(i).getName().equals(fname)){
                arrayList.get(i).setVotes(votes);
            }
        }
    }

    public void replaceVoteandName(String fname, int votes, String iname){
        for(int i =0; i<arrayList.size(); i++){
            if(arrayList.get(i).getName().equals(fname)){
                arrayList.get(i).setVotes(votes);
                arrayList.get(i).setName(iname);
            }
        }
    }

    public static void main(String[] args) {

        ElectionTesterV4 v4 = new ElectionTesterV4();

        System.out.println("Original Candidates");
        v4.candidateInfo();
        System.out.println();

        System.out.println("Original Votes Sum");
        System.out.println("Total number of votes are " + v4.voteSum());
        System.out.println();

        System.out.println("Original Vote Statistic Table");
        v4.table();
        System.out.println();
        System.out.println("**************************");

        System.out.println("Replaces Marge with Apu");
        v4.replaceName("Marge", "Apu");
        System.out.println("Voting Statistic Table with Apu in it");
        v4.table();
        System.out.println();

        System.out.println("Replaces Apus Votes from 1 to 10");
        System.out.println("Voting Statistic Table with Apu's 10 votes in it");
        v4.replaceVote("Apu", 10);
        v4.table();
        System.out.println();

        System.out.println("Replaces Maggie with Wailburn and votes from 4 to 1");
        v4.replaceVoteandName("Maggie", 1, "Wailburn");
        System.out.println("Voting Statistic Table with Willburn and his votes at 1");
        v4.table();
    }

}