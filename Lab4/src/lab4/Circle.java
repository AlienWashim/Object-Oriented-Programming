package lab4;


public class Circle extends Shape {
    Double radius;
    Circle(){
        radius=1.0;
    }
    Circle(Double radius){
        this.radius=radius;
    }
    Circle(Double radius, String color, boolean filled){
        this.radius=1.0;
        this.color=color;
        this.filled=filled;
    }
    Double getArea(){
        return Math.PI*radius*radius;
    }
    Double getPerimeter(){
        return 2*Math.PI*radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
