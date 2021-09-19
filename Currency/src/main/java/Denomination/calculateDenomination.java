package Denomination;
// Calculate the denomination

public class calculateDenomination {
    
    public void calculateNoOfCurrencyNotes(int []denomination,int amount, int size){
        
       int noOfCurrencyNotes;
       System.out.println();
       System.out.println("Your payment approach in order to give min no of notes will be ");
       int i = size-1;
       
       while(amount !=0 && i>=0){   
           
           noOfCurrencyNotes = amount/denomination[i];
           if (noOfCurrencyNotes !=0){
               
               System.out.println( denomination[i] + ":" + noOfCurrencyNotes);
               amount = amount%denomination[i];
             
           }
           i--;
        }
    }
    
}
