
package exception_handling_lab_task6;


public class InvalidMarksException extends Exception{
    private int marks;
    InvalidMarksException(){};
    InvalidMarksException(int i){
        marks=i;
    }
    public String toString(){
        return "InvalidMarksException[" + marks+"]";
    }
    
}
