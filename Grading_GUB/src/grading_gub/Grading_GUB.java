package grading_gub;

import java.util.Scanner;

public class Grading_GUB {
    
    public static void main(String[] args) {
        String grade="";
        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();
        int limit[]={0,40,45,50,55,60,65,70,75,80,100};
        String[] grades={"F","D","C","C+","B-","B","B+","A-","A","A+"};
        for(int i=0;i<limit.length-1;i++){
            if(mark>=limit[i] && mark<limit[i+1]){
                System.out.println("Marks is : "+mark+" and Grade is : "+grades[i]);
            break;}
        }
    }
    
}
