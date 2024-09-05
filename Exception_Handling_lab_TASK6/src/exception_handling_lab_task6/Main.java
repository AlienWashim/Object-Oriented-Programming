
package exception_handling_lab_task6;

import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       try{
           System.out.print("Enter marks: ");
           int m=sc.nextInt();
        if(m<0 || m>100){
            throw new InvalidMarksException(m);
        }
    } catch(InvalidMarksException e){
           System.out.println("Caught "+e);
       }
    }
    
}
