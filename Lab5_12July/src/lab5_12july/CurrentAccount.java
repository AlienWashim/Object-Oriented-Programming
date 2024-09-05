package lab5_12july;

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
        if (limit <= overdraftlimit)
            withdraw(limit);
        else { 
            System.out.println(" Limit Exceeded " );
        }

    }
    public String toString(){
		return super.toString()+" Limit : "+overdraftlimit;
	}
}
