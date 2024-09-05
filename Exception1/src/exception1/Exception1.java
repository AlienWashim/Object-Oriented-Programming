
package exception1;


public class Exception1 {
    static void method1() throws IllegalAccessException{
        System.out.println("Inside");
        throw new IllegalAccessException("Demo");
    }

    public static void main(String[] args) {
        try{
            method1();
        } catch(IllegalAccessException event){
            System.out.println("Problem:"+event);
        }
        
        try{
        Test.compute(1);
        Test.compute(20);
        } catch(MyException e){
            System.out.println("Caught "+e);
            }
    }
    
}
