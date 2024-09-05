package task1;

public class Student{
    Student(){
    System.out.println("This is default constructor");
    }
    Student(String name, int ID){
    System.out.println("This is parameterized constructor : Name : "+name+" and ID : "+ID);
    }

    public static void main(String[] args) {
       Student cons1= new Student();
        String name="Washim";
       Student cons2= new Student(name,34); 
    }
    
}
