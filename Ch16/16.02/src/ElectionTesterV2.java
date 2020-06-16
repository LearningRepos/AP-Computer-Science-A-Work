import java.util.ArrayList;

public class ElectionTesterV2 {


        Candidate Homer = new Candidate("Homer",0);
        Candidate Marge = new Candidate("Marge",1);
        Candidate Lisa = new Candidate("Lisa",2);
        Candidate Bart = new Candidate("Bart",3);
        Candidate Maggie = new Candidate("Maggie",5);

        private ArrayList<Candidate> arrayList = new ArrayList<Candidate>();

        public ElectionTesterV2(){
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


        public static void main(String[] args) {

            ElectionTesterV4 v4 = new ElectionTesterV4();

            System.out.println("Raw Election Data:");
            v4.candidateInfo();
            System.out.println();

            System.out.println("Total Number of Votes Summed Up:");
            System.out.println("Total number of votes are " + v4.voteSum());
            System.out.println();

            System.out.println("Election Statistics");
            v4.table();
            System.out.println();

        }


}
