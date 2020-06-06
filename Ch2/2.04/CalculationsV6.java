// Name : Mihir Achyuta
//Date : 08/22/19
//Description : I am using variables , a combination of ints and doubles, to do arithmetic on the computer . These include Additon, Subtration, Division, Multiplication, and the modulus operator.  

public class CalculationsV6 {
public static void main(String[] args) {
		
 // Addition
	System.out.println("Addition");
	
	int iNum1 = 25;
	int iNum2 = 9;
	System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
    
	double iNum3 = 43.21;
	double iNum4 = 3.14;
	double iNum5 = 10.0;
	System.out.println( iNum3 + " + " + iNum4 + " + " + iNum5 + " = " + (iNum3 + iNum4 +iNum5) );
    System.out.println();
    
    // Subtraction
    System.out.println("Subtraction");
    
    int iNum6 = 11;
    int iNum7 = 9;
    int iNum8 = 25;
    System.out.println( iNum6 + " - " + iNum7 + " - " + iNum8 + " = "  + (11 - 9 - 25) );
    
    double iNum9 = 3.14;
    double iNum10 = 10.0;
    System.out.println( iNum9 + " - " + iNum10 + " = " + (3.14 - 10.0) );
    System.out.println();
    
    // Multiplication
    System.out.println("Multiplication");
    
    int iNum11 = 25;
    int iNum12 = 9;
    System.out.println( iNum11 + " * " + iNum12 + " = " + (25 * 9) ); 
    
    double iNum13 = 3.14;
    double iNum14 = 10.0;
    double iNum15 = 10.0;
    System.out.println( iNum13 + " * " + iNum14 + " * " + iNum15 + " = " + (3.14 * 10.0 * 10.0) );
    System.out.println();
    
    // Division
    System.out.println("Division");
    
    int iNum16 =9;
    int iNum17 = 25;
    System.out.println( iNum16 + " / " + iNum17 + " = "  + (9 / 25) );
    
    double iNum18 = 43.21;
    double iNum19 = 10.0;
    
    System.out.println( iNum18 + " / " + iNum19 + " = " + (43.21 / 10.0) );
    System.out.println();
     
    // Modulus operator
    System.out.println("Modulus");
    
    int iNum20 = 11;
    int iNum21 = 9;
    System.out.println( iNum20 + " % " + iNum21 + " = " + (11 % 9) );
   
    double iNum22 = 10.0;
    double iNum23 = 3.14;
    System.out.println( iNum22 + " % " + iNum23 + " = " + (10.0 % 3.14) );
    System.out.println();
    
    System.out.println( "iNum22/iNum5 + iNum13*iNum9 = " + iNum22/iNum5 + iNum13*iNum9);
    System.out.println( "iNum11*iNum7 + iNum15%iNum6 = " + iNum11*iNum7 + iNum15%iNum6);
    System.out.println( "iNum23 + iNum3 / iNum12%iNum5 =  " + (iNum23 * iNum3) / ((iNum12%iNum5))  );
    System.out.println();
    
    System.out.println( "iNum22/iNum23 +  iNum25*iNum18 = " + (iNum22/iNum23) + (iNum2*iNum18));
    System.out.println( "iNum18*iNum22 - iNum1 + iNum2 = " + (iNum18*iNum22 - iNum1 + iNum2) );
    System.out.println( "iNum19 + iNum22 * + iNum13*iNum9= " + iNum19 + iNum22 * + iNum15*iNum7);
    
   
	





}
}