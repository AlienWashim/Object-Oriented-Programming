package digit_cons_vow;

import java.util.Scanner;

public class Digit_Cons_Vow {

    
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        char find=sc.next().charAt(0);

        if(find>=48 && find<=57)
         System.out.println(find+" is a Digit");
        else if(find=='a' || find=='i'||find=='o'||find=='u'||find=='e'||find=='A' || find=='I'||find=='O'||find=='U'||find=='E')
           System.out.println(find+" is a Vowel");
        else if((find>='a' && find<='z')||(find>='A' && find<='Z') &&(find!='a' || find!='i'||find!='o'||find!='u'||find!='e'||find!='A' || find!='I'||find!='O'||find!='U'||find!='E'))
           System.out.println(find+" is a Consonant");
        else
            System.out.println(find+" is other");
    }
    
}
