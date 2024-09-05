package task.pkg5;

import java.util.Scanner;
import java.lang.Math;

public class Task5{
    int X;
    double sine,cosine;

    void calculator(){
    Scanner input = new Scanner (System. in);
    X=input.nextInt();
    Double redians=Math.toRadians(X);
    sine=Math.sin(redians);
    cosine=Math.cos(redians);
    System.out.println("The value of sin "+X+" is : "+sine);
    System.out.println("The value of cosine "+X+" is : "+cosine);
    } 
    public static void main(String[] args) {
        System.out.println("Enter the value : ");
        Task5 calculation= new Task5();
        calculation.calculator();
    }
    
}
