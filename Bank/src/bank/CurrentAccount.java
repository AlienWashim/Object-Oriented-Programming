package bank;

public class CurrentAccount extends Account {
         private double overdraftlimit; 

    public CurrentAccount(int accnum, double limit) {
        super(accnum);
        overdraftlimit = limit;
    }


    public double getLimit(){
        return overdraftlimit;
    }

    public void setLimit(double limit) { 
        overdraftlimit=limit; 
    }
     @Override
    public void withdraw (double limit) { 
        if ((overdraftlimit+super.getBalance())>=limit)
            super.withdraw(limit);
        else {
            System.out.println(" Limit Exceeded " );
            }
        }

         @Override
    public String toString(){
		return super.toString()+" Limit : "+overdraftlimit;
	}
}