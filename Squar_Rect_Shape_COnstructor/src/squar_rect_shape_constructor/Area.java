package squar_rect_shape_constructor;

public class Area {
    float length;
    float breadth;

    Area(float length) {
        this.length = length;
    }
    Area(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public float Calculate_area() {
        if (breadth > 0) {
            return length * breadth;
        } else {
            return length * length;
        }
    }

    public float Calculate_perimeter() {
        if (breadth > 0) {
            return (2 * length) + (2 * breadth);
        } else {
            return 4 * length;
        }
    }
    public static void main(String[] args) {
        Area Rectangle = new Area(5, 7);
        System.out.println(Rectangle.Calculate_area());
        System.out.println(Rectangle.Calculate_perimeter());

        Area Square = new Area(4);
        System.out.println(Square.Calculate_area());
        System.out.println(Square.Calculate_perimeter());
    }
    
}
