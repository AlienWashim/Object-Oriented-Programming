package npr_ncr;

import java.util.Scanner;

public class nPr_nCr {
    int n;
    int r;
    public nPr_nCr(){
        Scanner sc=new Scanner(System.in);
        n = sc.nextInt();
        r = sc.nextInt();
    }
    static int factorial(int n){
        int i,fact=1;
        for(i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    
    public static void main(String[] args) {
        nPr_nCr obj=new nPr_nCr();
        int s = factorial(obj.n);
        int s2 = factorial(obj.r);
        int s3 = factorial(obj.n-obj.r);
        System.out.println("nPr = "+(s/s3)+" and nCr = "+(s/(s2*s3)));
        
    }
    
}
