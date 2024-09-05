package leap_year_or_not;

import java.util.Scanner;

public class Leap_year_or_Not {

    
    public static void main(String[] args) {
    System.out.println("Enter any year : ");
    Scanner sc=new Scanner(System.in);
    int X=sc.nextInt();
    int rem=0;
    if(X%4==0){
        if(X%100==0){
            if(X%400==0)
            rem=1;
            else
                rem=0;
        }
        else
            rem=1;
    }
    else
        rem=0;
    
    if(rem==1)
        System.out.println("Leap year");
    else
        System.out.println("Not Leap year");
    }
    
}
