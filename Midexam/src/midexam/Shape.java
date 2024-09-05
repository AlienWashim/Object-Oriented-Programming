package midexam;

public class Shape {
 
    public static void main(String[] args) {
        Rectangle rect=new Rectangle(((20020034%20)+5),((20020034%10)+3));
        Square sq=new Square(((20020034%20)+5));
        System.out.println("Rectangle :");
        System.out.println("Area = " + rect.getArea());
        System.out.println("Perimeter = " + rect.getPerimeter());
        System.out.println("Square :");
        System.out.println("Area = " + sq.getArea());
        System.out.println("Perimeter = " + sq.getPerimeter());
    }
    
}
