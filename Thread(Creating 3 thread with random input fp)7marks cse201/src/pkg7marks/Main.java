import java.util.Random;
import java.util.Scanner;

class Thread3 extends Thread{ 
	int x;
	public Thread3(int m) {
		this.x = m;
	}
    public void run(){           
      System.out.println("Third thread, "+x+" : " + fct(x));
    }    
    long fct(int number){
    	long i,fact=1;
    	for(i=1;i<=number;i++){
    	fact=fact*i;
    	}
    	return fact;
    }
} 

class Thread2 extends Thread{ 
	int x;
	public Thread2(int m) {
		this.x = m;
	}
    public void run(){           
      System.out.println("Second thread, "+x+" : "+ getDivisors(x));
    }    
    String getDivisors(int number){
    	String t="";
    	for (int i=1;i<=number;i++){
    		if(number%i==0){
    			t+=" "+i;
    		}
    	}
    	return t;
    }
    
} 
class Thread1 extends Thread{ 
    public void run(){  
    	 int i=1;
    	 while (i==1){
		     Scanner obj = new Scanner(System.in); 
		     String s = obj.nextLine();
		     Random rand = new Random();
		     int ab = rand.nextInt(35);
		     if (s.equals("d")){
		    	 new Thread2(ab).start();
		     }else if(s.equals("f")){
		    	 new Thread3(ab).start();
		     }
		     try {
				Thread.sleep(1000);
		     } catch (InterruptedException e) {	e.printStackTrace();}
    	 }
    }                                   
}                                                                                       
                                                                                                
public class Main{
     public static void main(String [] a){
    	 Thread1 obj = new Thread1();
    	  obj.start();
     }
}