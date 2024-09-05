package bank;

public class Bank {
    Account arr[];
    int i=0;
    public static void main(String[] args) {
        Bank obj=new Bank();
        obj.OpenAccount("Current",2034);
        obj.update();
        obj.OpenAccount("Saving",2036);
        obj.update();
        obj.CloseAccount(2034);
        obj.CloseAccount(2036);
    }
    
    void OpenAccount(String account_type,int accnm){
    arr=new Account[2];
    if("Saving"==account_type){
    Account obj=new SavingsAccount(accnm,2);
    obj.deposit(2000);
    //obj.withdraw(500);
    arr[i]=obj;
    }
    else{
    Account obj=new CurrentAccount(accnm,500);
    obj.deposit(1000);
    obj.withdraw(1400);
    arr[i]=obj;
            }
    i++;
    }
    
    void CloseAccount(int accnm){

        System.out.println("Closing Account "+accnm);

    }
    void update()
    {
        for(Account i:arr)
        {
            if(i instanceof SavingsAccount){
                System.out.println("Interest "+((SavingsAccount) i).getInterest());
                
            }
            else{
                if(i instanceof CurrentAccount){
                    if(((Account) i).getBalance()<0){
                        System.out.println("Account "+((Account) i).getAccountNumber()+" is overdraft");
                    }
                }
            }     
       }
    }
}
