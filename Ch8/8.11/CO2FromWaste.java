/** Copyright 
//Name : Mihir Achyuta
//Date : 12/19/19
 //Purpose : to calculate carbon dioxide used in 1 year
*/


public class CO2FromWaste {
//private instance variables declared
    private int People;

    private boolean Cans;
    private boolean Glass;
    private boolean Plastic;
    private boolean Paper;
    
       
    private double grossWasteEmission;
    private double wasteReduction;
    private double netWasteEmission;
//constructor reassigning values
    public CO2FromWaste(int ppl, boolean paper, boolean plastic, boolean glass, boolean cans) {

        People = ppl;
        Cans = cans;
        Glass = glass;
        Plastic = plastic;
        Paper = paper;

    }
//returning various variables
    public int People() {
        return People;
    }
    
    public boolean Cans() {
        return Cans;
   
    }
    
    public boolean Glass() {
        return Glass;
    }
   
    public boolean Plastic() {
        return Plastic;
    }
   
    public boolean Paper() {
        return Paper;
    }



  //specific waste conserved
    public void calcWasteReduction() {
        wasteReduction = 0;

        if (Paper) {
            wasteReduction += (People * 184);
        }

        if (Plastic) {
            wasteReduction += (People * 25.6);
        }

        if(Glass){
            wasteReduction += (People * 46.6);
        }
        if(Cans){
            wasteReduction += (People * 165.8);
        }
    }

  
//people * constant 1018 is total waste generated
    public void calcGrossWasteEmission() {
        grossWasteEmission = (People * 1018);
    }


//waste generated is total waste - conserved waste
    public void calcNetWasteEmission(){
        calcGrossWasteEmission();
        calcWasteReduction();
        netWasteEmission = grossWasteEmission - wasteReduction;
    }

//returns values
    
    public double getNetWasteEmission() {
        return netWasteEmission;
    }
    
    public double getGrossWasteEmission() {
        return grossWasteEmission;
    }

    public double getWasteReduction() {
        return wasteReduction;
    }


}