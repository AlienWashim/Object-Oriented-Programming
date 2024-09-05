
package animal;

public class Cats extends Animal {
    void cats(){
        System.out.println("Cats meow");
    }
    void dogs(){
        System.out.println("Dogs bark");
    }
    public static void main(String[] args) {
        Animal obj=new Cats();
        obj.cats();
        obj.dogs();
    }
}
