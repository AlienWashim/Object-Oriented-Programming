package perfect_number;

import java.util.Scanner;

public class Perfect_Number {
    int X;
    public Perfect_Number(){
        Scanner sc = new Scanner(System.in);
        X=sc.nextInt();
    }

    
    public static void main(String[] args) {
        Perfect_Number obj=new Perfect_Number();
        int N=obj.X, sum=0;
        for(int i=1;i<N;i++){
        if(N%i==0)
            sum=sum+i;
        }
    if(sum==N)
        System.out.println(N+" is a Perfect Number");
    else
        System.out.println(N+" is not Perfect Number");
    }
    
}
