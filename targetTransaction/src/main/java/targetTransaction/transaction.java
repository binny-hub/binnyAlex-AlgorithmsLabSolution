/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package targetTransaction;
import java.util.Scanner;

public class transaction {
    private int []Transactions;
    private int size;
    private int noOfTargets;
    Scanner sc= new Scanner(System.in);
    
    // enter the values 
    public void enterValues(){
        System.out.println(" Enter the size of transaction array ");
        size = sc.nextInt();
        Transactions = new int[size];
        System.out.println(" Enter the values of array ");
        for(int i=0; i<size; i++){
           Transactions[i] =sc.nextInt();
        }
        // Enter the total number of targets to be achieved
        System.out.println("Enter the total no of targets that needs to be achieved");
        noOfTargets = sc.nextInt();
    }
    
    // functions to calculate the total number of transactions required
    public void targetAchievables(){
        long target;
        while(noOfTargets!=0){
             System.out.println();
             
             System.out.println(" Enter the value of target ");
             target = sc.nextLong();
             long totalTarget =0;
             int flag =0;
             
             // Finding the target achieved
             for(int j=0; j<size; j++){
                 
                 totalTarget += Transactions[j];
                 
                 if(totalTarget >= target){      // checking if sum >= target
                     
                     System.out.println(" Target achieved after "+ (j+1)+ " transactions ");
                     
                     flag=1;
                     break;
                 }
                 
             }
             if (flag ==0){
                System.out.println(" Given target is not achieved ");
             }
            noOfTargets--; 
        }
    }
    
    public static void main(String args[]) {
        transaction tr = new transaction();
        tr.enterValues();
        tr.targetAchievables();
                    
    }
}
