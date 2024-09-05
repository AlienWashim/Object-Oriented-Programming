package task01;

import java.util.Scanner;

public class Task01{
    int x;
    int y;
    public Task01(){
        Scanner sc=new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
    }
    static int factorial(int n){
        int i,fact=1;
        for(i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    
    public static void main(String[] args) {
        Task01 obj=new Task01();
        int m = factorial(obj.x);
        int m2 = factorial(obj.y);
        int m3 = factorial(obj.x-obj.y);
        System.out.println("nPr = "+(m/m3)+" and nCr = "+(m/(m2*m3)));
        
    }
    
}
