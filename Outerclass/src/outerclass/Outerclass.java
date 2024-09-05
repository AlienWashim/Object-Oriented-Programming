
package outerclass;

public class Outerclass {
    void display(){
        System.out.println("Outer class");
    }

    class inner{
    void display(){
        System.out.println("Inner class");
    }
}
    public static void main(String[] args) {
        Outerclass obj=new Outerclass();
        obj.display();
        Outerclass.inner in=obj.new inner();
        in.display();
    }
    
}
