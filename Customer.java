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
public  class  Customer {
   
    private  String customerName;
   private  String email;
   private  String address;
   private  String nationlID;
   private  String mobileNumber;
  public  static double balance=0.0;
   public static int accountNumber;
  
   public void setName(String customerName){
        
       this.customerName= customerName;

  
   }
   
    
  
    public  String getName(){
        return customerName;
    }
     public  void setEmail(String email){
        
       this.email= email;
  
   }
  
    public  String getEmail(){
        return email;
    }
    public  void setAddress(String address){
        
      this. address= address;
  
   }
  
    public  String getAddress(){
        return address;
    }
    public void setNationlID(String nationlID){
        
       this.nationlID= nationlID;
  
   }
  
    public String getNationlID(){
        return nationlID;
    }
    public void setMobileNumber(String mobileNumber){
        
       this.mobileNumber= mobileNumber;
       
  
   }
  
    public String getMobileNumber(){
        return mobileNumber;
    }
    @Override
    public String toString(){
       return "You have entered :\ncustomer name: "+customerName+"\ncustomer email: "+email+"\ncustomer address"+address+"\ncustomer nationlID: "+nationlID+"\ncustomermobole number: "+mobileNumber ;

 
 }
    
    
    public static int AccountNumber(){
   accountNumber++;
   return accountNumber;
   }
      
 
}
