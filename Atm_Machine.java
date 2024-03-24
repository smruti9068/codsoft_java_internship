import java.util.Scanner;

 class Bank_Account {
   private double balance;
   //this class stores the bank balance of the user bank balance
   
   //Using getter and setter method
   public double getBalance() {
	   return balance; }
   public Bank_Account(double balance) {
	   this.balance=balance;
   }
   public void deposit(double amount) {
	   balance=balance+amount;//balance+=amount
	   System.out.print("Amount deposited successfully!!");
	   System.out.println("Current balance= "+ balance);
   }
   public boolean withdraw(double amount) {
	   if(balance>=amount) {
		   balance=balance-amount;//balance-=amount
		   System.out.println("Withdrawal successful!!");
	   System.out.println("Current balance= "+ balance);
	   return true;}
	   else {
		   System.out.println("insufficient funds!! Withdrawal Unsuccessful");
		   return false;  }
   }
}
 public class Atm_Machine{
	 private Bank_Account bank_account;/*Connect the ATM class with the user's bank
	                                   account class to access and modify the account balance*/
	 public Atm_Machine(Bank_Account bank_account) {
		 this.bank_account=bank_account;}
	 public void display() {
		 System.out.println("0.Exit");
		 System.out.println("1.Withdraw");
		 System.out.println("2.Deposit");
		 System.out.println("3.Check Balance");}
	 
	 public void checkBalance() {
		 System.out.println("Your Current Balance= "+ bank_account.getBalance()); }
	 
	 public void withdraw(double amount) {
		 if(bank_account.withdraw(amount)) 
			 System.out.println("Please collect your cash!!"); }
	 
	 public void deposit(double amount) {
		 bank_account.deposit(amount);
		 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank_Account account=new Bank_Account(10000);
		Atm_Machine atm=new Atm_Machine(account);
     Scanner sc=new Scanner(System.in);
     int choice;
     do {
     System.out.println("Enter your choice");//here choice states that what you have to do (deposit,withdraw or check balance)
    atm.display();
     choice=sc.nextInt();
     switch(choice) {
     case 1: 
    	 System.out.println("Enter amount to withdraw: ");
    	 double withdraw_amt=sc.nextDouble();
    	 atm.withdraw(withdraw_amt);
    	 break;
     case 2:
    	 System.out.println("Enter amount to be deposited: ");
    	 double deposit_amt=sc.nextDouble();
    	 atm.deposit(deposit_amt);
    	 break;
     case 3:
    	 atm.checkBalance();
    	 break;}
      }while(choice!=0);
     sc.close();
     }
	}


