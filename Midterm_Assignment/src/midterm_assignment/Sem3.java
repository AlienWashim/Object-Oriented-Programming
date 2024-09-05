package midterm_assignment;

import java.util.Scanner;

public class Sem3 extends Sem2{
    double gpa_3;
    public void GPA_S3(){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter Semester-3 gpa : ");
        gpa_3=sc.nextDouble();
    }
    
    public void SGPA(){
        double avg_gpa;
        avg_gpa =(gpa_1+gpa_2+gpa_3)/3;
        System.out.println("Your avarage GPA is : "+avg_gpa);
    }
}
