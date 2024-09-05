
package exception_handling3_lab7;

import java.util.Scanner;

public class GPA{
    static int age;
    static double GPA;
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        GPA res=new GPA();
        
        try{
            System.out.print("Enter your age:");
            age=sc.nextInt();
            if(age>25){
            System.out.println("You are older than the requested age (25 years), you are "+age+"!!!”.");
            throw new AgeOutOfRangeException(age);
        }
        } catch(AgeOutOfRangeException e){
            System.out.println("Exception: "+e);
        }
        
        try{
            System.out.print("Enter your GPA:");
         GPA=sc.nextDouble();
        if(GPA<2.5){
            System.out.println("Your GPA is not sufficient to apply for this job (2.5)");
            throw new LowGpaException();
        }
            
        } catch(LowGpaException e){
            System.out.println("Exception: "+e);
        }
        res.result();
    }
    
    void result(){
        if(age<25 && GPA>2.5){
            System.out.println("Your application is accepted and is under study");
        }
    }
    
}
