package lab4;

public class Rectangle extends Shape{
    double width,height;
    Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }
    Rectangle(double width, double height, String color, boolean filled){
        this.width=width;
        this.height=height;
        this.color=color;
        this.filled=filled;
    }
    Rectangle(){
        this.width=1.0;
        this.height=1.0;
    }
    Double getArea(){
        return Math.PI*width*height;
    }
    Double getPerimeter(){
        return 2*(width+height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
}
