
package Denomination;
import java.util.Scanner;

public class Currency {
    private int denomination[];
    private int size;
    private int amount;
    Scanner sc = new Scanner(System.in);
    
    public void enterDenomination(){
        // enter the denomination
        System.out.println(" Enter the size of currency denomination");
        size = sc.nextInt();
        denomination = new int[size];
        // enter the denominations
        
        System.out.println(" Enter the currency denominations value ");
        for(int i=0; i<size; i++){
            denomination[i] = sc.nextInt();
        }
         // Enter the amount
         System.out.println("Enter the amount you want to pay ");
         amount = sc.nextInt();
       
         //Sort the denominations using merge sort
         MergeSorter  ms = new MergeSorter();
         ms.sort(denomination,0,size-1);
       
         // Calculate the denominations
         calculateDenomination den = new calculateDenomination();
         den.calculateNoOfCurrencyNotes(denomination, amount, size);
    }


    public static void main(String args[]) {
       Currency cur = new Currency();
       cur.enterDenomination();
    }
}
