/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author mmmz
 */
public class CustomerAccount extends Customer  {

    
    
    
    
   // Function to deposit money to the account 

    /** function to deposite amount to account 
     *
     * @param amount
     */

     public static void deposit(double amount){
   
   balance=balance+amount;
   }
 
    /**function to withdraw amount frome account
     *
     * @param amount
     */
    
 public static void withdraw (double amount){
 
 balance=balance-amount;
 }
 /*
 *method to return balance 
 *
 */
 public static double getBalance(){
 return balance;
 
 
 } 
     
}
