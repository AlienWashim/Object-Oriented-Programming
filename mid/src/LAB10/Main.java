
package LAB10;

import java.util.Random;
import java.util.Scanner;


public class Main extends Thread{
    int start,end,id,found;
    static int data,array[];
    
    Main(int i,int start,int end){
        this.start=start;
        this.end=end;
        this.id=i;
    }

    public void run(){
        for(int i=start;i<end;i++){
            if(array[i]==data){
                System.out.println("Found In thread "+this.id+" and generated id is "+i);
            }
            try{
                sleep(10);
            }catch(InterruptedException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        array=new int[200];
        for(int j=0;j<200;j++){
        Random rand = new Random();
        int rand_int1 = rand.nextInt(200);
        array[j]=rand_int1;
        //System.out.println("Location "+(j)+" data="+array[j]);
        }

        System.out.print("Enter searching element: ");
        data=sc.nextInt();
        int start=0;
        
        for(int i =1;i<=5;i++){
            Main t = new Main(i,start,start + 40);
            start = start + 40;
            t.start();
        }
    }
    
}
