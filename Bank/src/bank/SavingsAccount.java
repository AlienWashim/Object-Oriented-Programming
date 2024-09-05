package bank;

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
        double x=(getBalance()*this.interest)/100;
        return x;
    }
    public void setInterest(double interest){
        this.interest=interest/100;
    }
    public void  addInterest (double interest){
		double x=super.getBalance()*interest;
		super.deposit(x);
	}
    @Override
    public String toString(){
		return super.toString()+" Interest : "+interest;
	}
    
}