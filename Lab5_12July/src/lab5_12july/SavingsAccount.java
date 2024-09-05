package lab5_12july;

public class SavingsAccount extends Account{
    private double interest;
    SavingsAccount(int x){
        super(x);
    }
    public SavingsAccount(int accnum, double interest){
        super(accnum);
        this.interest=interest;
    }
    public double getInterest(){
        double x=super.getBalance()*interest;
        return x;
    }
    public void setInterest(double interest){
        this.interest=interest;
    }
    public void  addInterest (double interest){
		double x=super.getBalance()*interest;
		super.deposit(x);
	}
    public String toString(){
		return super.toString()+" Interest : "+interest;
	}
    
}
