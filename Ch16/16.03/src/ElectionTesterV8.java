//Name : Mihir Achyuta
//Date : 6/3/20
//Purpose : To traverse, insert, replace, and delete candidates from an array and arraylist
//PMR : Although this project was exhaustive but it made me more comfortable doing all these standard algorithms

import java.util.ArrayList;
public class ElectionTesterV8{
    Candidate Homer = new Candidate("Homer",0);
    Candidate Marge = new Candidate("Marge",1);
    Candidate Lisa = new Candidate("Lisa",2);
    Candidate Bart = new Candidate("Bart",3);
    Candidate Maggie = new Candidate("Maggie",5);

    private ArrayList<Candidate> arrayList = new ArrayList<Candidate>();

    public ElectionTesterV8(){
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

    public void insertIntoPosition(int position, String name, int votes){
        arrayList.add(position, new Candidate(name,votes));
    }

    public void findAndInsert(String findName, String name, int votes){
        int index = 0;
        for(int i =0; i<arrayList.size(); i++){
            if(arrayList.get(i).getName() == findName){
                index = i;
            }
        }
        insertIntoPosition(index,name,votes);
    }

    public void deleteByIndex(int index){
        arrayList.remove(index);
    }

    public void deleteByName(String name){
        int index = 0;
        for(int i =0; i<arrayList.size(); i++){
            if(arrayList.get(i).getName() == name){
                index =i;
            }
        }
        deleteByIndex(index);
    }

    public static void main(String[] args) {

        ElectionTesterV8 v8 = new ElectionTesterV8();

        System.out.println("Original Candidates");
        v8.candidateInfo();
        System.out.println();

        System.out.println("Original Votes Sum");
        System.out.println("Total number of votes are " + v8.voteSum());
        System.out.println();

        System.out.println("Original Vote Statistic Table");
        v8.table();
        System.out.println();
        System.out.println("**************************");

        System.out.println("Replaces Marge with Apu");
        v8.replaceName("Marge", "Apu");
        System.out.println("Voting Statistic Table with Apu in it");
        v8.table();
        System.out.println();

        System.out.println("Replaces Apus Votes from 1 to 10");
        System.out.println("Voting Statistic Table with Apu's 10 votes in it");
        v8.replaceVote("Apu", 10);
        v8.table();
        System.out.println();

        System.out.println("Replaces Maggie with Wailburn and votes from 4 to 1");
        v8.replaceVoteandName("Maggie", 1, "Wailburn");
        System.out.println("Voting Statistic Table with Willburn and his votes at 1");
        v8.table();
        System.out.println();

        System.out.println("Inserts Edna at position 2 with 0 votes");
        v8.insertIntoPosition(2,"Edna",0);
        v8.table();
        System.out.println();

        System.out.println("Inserts Moe before Apu with 6 votes");
        v8.findAndInsert("Apu","Moe",6);
        v8.table();
        System.out.println();

        System.out.println("Deletes candidate at index 1 which is Moe");
        v8.deleteByIndex(1);
        v8.table();
        System.out.println();

        System.out.println("Deletes Edna by name");
        v8.deleteByName("Edna");
        v8.table();
    }

}