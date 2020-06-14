public class Prime {
    int low;
    int high;

    //using the this keyword to assign instance variables
    public Prime(int low, int high){
        this.low = low;
        this.high = high;
    }

    public void Calculate(){
        //number of prime number counter initialized
        int count = 0;

        //adding + 1 to the lower limit since I dont want the lower limit to be part of prime
        while (this.low+1  < this.high) {
            boolean bool = false;

            for(int i = 2; i <= (this.low+1)/2; i++) {
                // if the number is divisible than anything other than 1, stop the loop and true
                if((this.low+1) % i == 0) {
                    bool = true;
                    break;
                }
            }

            //if no number is divisible other than itself and 1 then it is prime so print it out
            if((this.low+1) == 1){

            }
            else if (!bool){
                System.out.print((this.low+1) + " ");
                //count incremented to show how many prime numbers will be printed
                count++;
            }
            //incrementing the lower limit by 1 every time to slowly get out of while loop
            this.low++;
        }
        //Printing prime number total
        System.out.println("Prime number count: " + count);
    }}


