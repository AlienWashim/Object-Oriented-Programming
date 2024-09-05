
package problem.pkg1;

import java.util.Scanner;


public class Problem1 {
    String array;
    int array2;
    static int count;

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int S=sc.nextInt();
        String array[]=new String[S];
        int array2[]=new int[S];
        for(int i=0;i<S;i++){
            String name=sc.next();
           array[i]=name;
           int score=sc.nextInt();
           array2[i]=score;
        }
        int max=array2[0];
        for(int i=1;i<S;i++){
            if(array2[i]>max){
                max=array2[i];
                count=i;
            }else{
                max=max;
            }
        }
        System.out.println(array[count]);
    }
    
}
