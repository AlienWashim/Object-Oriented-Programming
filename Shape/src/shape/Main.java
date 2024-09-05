
package shape;


public class Main {
    
    public static void main(String[] args) {
        Shape obj=new Shape("Sphere");
        System.out.println("Area of Sphere:"+obj.area(3)+" Volume of Sphere: "+obj.volume(6));
        Shape obj2=new Shape("Cube");
        System.out.println("Area of Cube:"+obj2.area(3)+" Volume of Cube: "+obj2.volume(4));
        
    }
}
