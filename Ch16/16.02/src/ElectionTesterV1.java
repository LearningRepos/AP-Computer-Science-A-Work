public class ElectionTesterV1 {
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


        public static void main(String[] args) {
            ElectionTesterV3 v3 = new ElectionTesterV3();
            System.out.println("Raw Election Data:");
            v3.candidateInfo();
            System.out.println();

            System.out.println("Total Number of Votes Summed Up:");
            System.out.println("Total number of votes are " + v3.voteSum());
            System.out.println();

            System.out.println("Election Statistics");
            v3.table();
            System.out.println("**************************");

        }

}
