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
public class Loan extends Customer{
     public   double InterestRate;
  private  int numberOfMonths;
  private   double loanAmount;
  private   double TotalPayableAmount;
  private  double MonthlyPayment; 
  

 

  public   void setLoanAmount(double CustLoan) {
    loanAmount = CustLoan;
    balance =loanAmount+balance ;
    
  }
  

  
  public double getLoanAmount() {
    return loanAmount;
  }
  
 public  void setLonePeriod(int LoanPer) {
    numberOfMonths = LoanPer;
    
  }

  public int getLonePeriod() {
    return numberOfMonths;
  }
  public   void setInterestRate(double CustLoan,double rate) {
    InterestRate = CustLoan*(rate/100);
      TotalPayableAmount = CustLoan+InterestRate;
       MonthlyPayment =TotalPayableAmount/numberOfMonths;
  }

 
  public double getInterestRate() {
    return InterestRate;
  }
public double getTotalPayment() {
      
   
    return TotalPayableAmount;    
  }
 
 
 

 
  public double getMonthlyPayment() {
    
    return MonthlyPayment;
    
  }

    /**
     *retur the loan information
     * @return
     */
    @Override
     public  String toString(){
         return "\n your loan amount is :"+loanAmount+"$"+"\n your loan period is: "+numberOfMonths+"\n your Total payable amount is :"+TotalPayableAmount+"$"+"\n your monthly payment: "+MonthlyPayment+"$"+"\n your Interest Rate will be :"+InterestRate+"$"+"\n";

}
  public void PayForLoan(int payAmount){
  
  TotalPayableAmount=TotalPayableAmount-payAmount;
  }
  public double  GetPayForLoan(){
  return TotalPayableAmount;
  }

    
}
