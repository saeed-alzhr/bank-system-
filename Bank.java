/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import static bank.Customer.accountNumber;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author mmmz
 */
public class Bank {
 public static int count=1; //to count loan 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       System.out.printf("\t**********************************************\n");
        System.out.printf("\t\tWelcome to My Bank \n");
        System.out.printf("\tStudent #1: Saeed Hassan Al-zharani,44200780,Group 4 \n");
        System.out.printf("\t**********************************************\n");
        System.out.println("Please enter the number of your choice (enter 8 to exit)");
         System.out.println("--------------------------------------------------------------");
      
        //print the menu for one time only 
        System.out.println("1.Create a new customer account");
        System.out.println("2.Deposit an amount to an existing account ");
        System.out.println("3.Withdraw an amount from an existing account ");
        System.out.println("4.Check an existing account ");
        System.out.println("5.Loan oprations  ");
        System.out.println("6.Exit ");
        System.out.println("");
        System.out.println("Please choose a choice between 1 and 6");
          Vector<Customer> customers=new Vector<>();
        //initial value for num 
          int num=0; 
        Scanner in= new Scanner(System.in);
        while(num!=6){
        //take the user choice and implement the choice case 
        num=in.nextInt();
  
          
           switch (num) {
               case 1 -> {
                   
                   
                   
                   Scanner in1=new Scanner(System.in);//scane the user information
                   for(int i2=0;i2<1;i2++){
                       System.out.println("please enter the new customer name:");
                       String name =in1.nextLine();
                       //check if the name has number and print error if it true
                       boolean i = name.matches(".*\\d.*");
                       if(i==true){
                           System.err.println("custmoer name can not have any number\n please try again:");
                           name=in1.nextLine();//clear the scanner buffer and assign a new valid value
                       }
                       
                       System.out.println("please enter the new customer email:");
                       String email =in1.nextLine();
                       
                       System.out.println("please enter the new customer address:");
                       String address =in1.nextLine();
                       
                       System.out.println("please enter the new customer nationlID:");
                       String nationalID=in1.nextLine();
                       boolean checkErr2=nationalID.matches("-?\\d+");
                       if(checkErr2==false){
                           System.err.println("custmoer nationalID can not have any lettrs\n please try again:");
                           nationalID=in1.nextLine();//clear the scanner buffer and assign a new valid value
                       }
                       
                       System.out.println("please enter the new customer mobilenumber:");
                       String mobilenumber=in1.nextLine();
                       boolean checkErr3=mobilenumber.matches("-?\\d+");
                       if(checkErr3==false){
                           System.err.println("custmoer mobilenumber can not have any lettrs\n please try again:");
                           mobilenumber=in1.nextLine();//clear the scanner buffer and assign a new valid value
                       }
                       
                       
                       Customer t =new Customer();
                       //set customer information 
                       t.setName(name);
                       t.setEmail(email);
                       t.setAddress(address);
                       t.setNationlID(nationalID);
                       t.setMobileNumber(mobilenumber);
                       customers.add(t);//adding a new opject to the vector 
                       
                       System.out.println(t);
                       System.out.println("This is the account number: "+CustomerAccount.AccountNumber()+"\n");
                       
                   }
                   
                   break;
                   
               }
               case 2 ->{
                    double  amount;
                   Scanner in2=new Scanner(System.in);
                   System.out.println("Enter the Number account that you want deposite to ");
                   //checking accunt number                              
                  if(accountNumber!=in2.nextInt()){
                     System.out.println("");
                     System.err.println("\n number account dose not found\n plasse try agean\n");
                     System.out.println("--------------------------------------------------------");
                      break;
                    }
          
                   System.out.println("Enter the amount that you want deposite to ");
                   amount=in2.nextDouble();
                   if(amount>0){
                       CustomerAccount.deposit(amount);
                       System.out.println("Your balance is: "+CustomerAccount.getBalance());
                   }else System.err.println(" a negative amount cant be deposit!!\n");
                   break;
                   
               }
               case 3 ->{
                   Scanner in2=new Scanner(System.in);
                   System.out.println("Enter the Number account that you want withdraw From");
                    //checking accunt number                              
                  if(accountNumber!=in2.nextInt()){
                     System.out.println("");
                     System.err.println("\n number account dose not found\n plasse try agean\n");
                     System.out.println("--------------------------------------------------------");
                      break;
                    }
                   double amount;
                   System.out.println("Enter the amount that you want withdraw From: ");
                   amount=in2.nextDouble();
                   double checkDrawBa=CustomerAccount.getBalance();
                   //check if the amuont is negative or bigger than the balance
                   if(amount>0&&amount<checkDrawBa){
                       CustomerAccount.withdraw(amount);
                       System.out.println("Your balance is: "+CustomerAccount.getBalance());
                   }else System.err.println(" A negative amount cant be withdraw!!\nor the amount is more then the balance");
                         System.out.println("--------------------------------------------------------------");                   
                   break;
                   
               }
               case 4 ->{
                   Scanner in2=new Scanner(System.in);
                   System.out.println("Enter the Number account that you want to check balance");
                   //checking accunt number                              
                  if(accountNumber!=in2.nextInt()){
                     System.out.println("");
                     System.err.println("\n number account dose not found\n plasse try agean\n");
                     System.out.println("--------------------------------------------------------");
                      break;
                    }
                   System.out.println("Your balance is: "+CustomerAccount.getBalance());
                   break;
                   
               }
               case 5 -> {
                   
                   Scanner in2=new Scanner(System.in);
                   Loan L=new Loan();
                   
                           
                               System.out.println("Enter the Number account that you want to get a new loan for");                           
                                   //checking accunt number                              
                  if(accountNumber!=in2.nextInt()){
                     System.out.println("");
                     System.err.println("\n number account dose not found\n plasse try agean\n");
                     System.out.println("--------------------------------------------------------");
                      break;
                    }
                               if(count==1){
                               System.out.println("How much is the new loan");
                               int CustLoan= in2.nextInt();//get the loan an amount
                               L.setLoanAmount(CustLoan);
                               System.out.println("What is the month period");
                               int LoanPer= in2.nextInt();//get the loan period
                               L.setLonePeriod(LoanPer);
                               System.out.println("What is the loan rate ");
                               double rate;
                               rate=in2.nextDouble();//get loan rate
                               //set loan methods 
                               L.setInterestRate(CustLoan,rate);
                               L.getTotalPayment();
                               L.getMonthlyPayment();
                               System.out.println("--------------------------------------------------------------");
                               System.out.println(" Enter the number account that you want to Check a loan for ");
                                //checking accunt number                              
                  if(accountNumber!=in2.nextInt()){
                     System.out.println("");
                     System.err.println("\n number account dose not found\n plasse try agean\n");
                     System.out.println("--------------------------------------------------------");
                      break;
                    }
                               System.out.println(L);
                               System.out.println("--------------------------------------------------------------");
                               System.out.println(" Enter the number account that you want to pay for loan ");
                               //checking accunt number                              
                  if(accountNumber!=in2.nextInt()){
                     System.out.println("");
                     System.err.println("\n number account dose not found\n plasse try agean\n");
                     System.out.println("--------------------------------------------------------");
                      break;
                    } 
                               System.out.println("Enter the amount that you want to pay");
                               L.PayForLoan(in2.nextInt());
                               System.out.println("Your curant Total Payable Amount is");
                               System.out.println(L.GetPayForLoan());
                               count++;//update that a customer can not have tow loan in the same time
                               }else System.err.println(" this account alradey has a loan\n you can not take two loans in the same time");//check aexisting loan 
                          break;
                          }
                         
                   //default for chosing unused choice 
                    default ->{
                  System.err.println("Not valid choice");  
            
                      }   
                   
           }     
        
        //keep print the menu until the user choose exit
        System.out.println("--------------------------------------------------------------");
        System.out.println("1.Create a new customer account");
        System.out.println("2.Deposit an amount to an existing account ");
        System.out.println("3.Withdraw an amount from an existing account ");
        System.out.println("4.Check an existing account ");
        System.out.println("5.Loan oprations  ");
        System.out.println("6.Exit ");
        System.out.println("");
        System.out.println("Please choose a choice between 1 and 6 ");
        }
        
    }
}  

