
package exception_handling3_lab7;

public class AgeOutOfRangeException extends Exception{
     private int age;
    AgeOutOfRangeException(int age){
        this.age=age;
    }
    public String toString(){
        return "AgeOutOfRangeException[" + age+"]";
    }

}
