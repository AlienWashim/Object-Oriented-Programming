package task4;

import java.util.Scanner;
import java.lang.Math;
public class Task4{
    Double X;
    double value;

    void calculator(){
    Scanner input = new Scanner (System. in);
    X=input.nextDouble();
    value = Math.log(X);
    System.out.println("The value of log("+X+") is : "+value);
    } 
    public static void main(String[] args) {
        System.out.println("Enter the value : ");
        Task4 calculation= new Task4();
        calculation.calculator();
    }
    
}
