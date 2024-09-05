package lab5_12july;


public class Bank{
    Account arr[];
    Bank(){
    arr=new Account[5];
    arr[0]=new SavingsAccount(2034,10);
    arr[1]=new CurrentAccount(2035,2000);
    arr[2]=new Account(2036);
    SavingsAccount obj=new SavingsAccount(2034, 16);
        obj.deposit(100);
        obj.withdraw(50);
        obj.addInterest(15);
        arr[3]=obj;
    }
    
    void update()
    {
        for(Account i:arr)
        {
            if(i instanceof SavingsAccount){
                System.out.println(((SavingsAccount) i).getInterest());
                
            }
            else{
                System.out.println("((CurrentAccount) i).getLimit");   
                }
            }     
       }
    }
