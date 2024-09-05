
package testproject;

import java.util.Scanner;

public class TestProject {

    
    public static void main(String[] args) {
        System.out.print("Enter your name:");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        
        System.out.print("Enter your age:");
        
        double age=sc.nextDouble();
        
        System.out.println("Your name is :"+name+" and your age is:"+age);
    }
    
}
