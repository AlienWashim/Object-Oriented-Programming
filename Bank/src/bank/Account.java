package bank;

/**
   A class for bank accounts.
   
   This class provides the basic functionality of accounts.
   It allows deposits and withdrawals but not overdraft
   limits or interest rates.   
*/

public class Account
{
    private double bal;  //The current balance
    private int accnum;  //The account number
    
    
    public Account(int a)
    {    
	bal=0.0;
	accnum=a;
    }
    
    public void deposit(double sum)
    {
	if (sum>0)
	    bal+=sum;    
	else
	    System.err.println("Account.deposit(...): "
			       +"cannot deposit negative amount.");    
    }
    
    public void withdraw(double sum)
    {
	if (sum>0)
	    bal-=sum;    
	else
	    System.err.println("Account.withdraw(...): "
			       +"cannot withdraw negative amount.");    
    }
    
    public double getBalance()
    {
	return bal;
    }
    
    public int getAccountNumber()
    {
	return accnum;
    }
    
    public String toString()
    {
	return "Account number " + accnum + ": " + "Balance = " + bal+"tk";    
    }
    
}