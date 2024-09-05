
package task6;

import java.util.Scanner;

public class Main{

    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       try{
           int m=sc.nextInt();
           MyException.method(m);
       } catch(InvalidMarksException e){
           System.out.println("Caught "+e);
       }
    }
    
}