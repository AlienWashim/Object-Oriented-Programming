
package midexam;

public class Square {
    double length;
    double breadth;

    Square(double length)
    {
        this.length = length;
    }

    double getArea()
    {
        return length * length;
    }

    double getPerimeter()
    {
        return (4*length);
    }
}
