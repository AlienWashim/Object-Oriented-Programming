package lab3;

import java.util.Scanner;


public class Lab3 {

    public static void main(String[] args) {
    while(true){
        Scanner input = new Scanner (System. in);
    int X=input.nextInt();
    int sum=0;
    for(int i=1;i<X;i++){
    int mod=X%i;
    if(mod==0)
    sum=sum+i;
    }
    if(sum==X){
        System.out.println("Perfect Number");
    break;}
    else
        System.out.println("Not Perfect Number");
    }
    }
    
}
