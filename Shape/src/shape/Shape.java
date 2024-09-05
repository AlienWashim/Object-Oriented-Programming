
package shape;


public class Shape {
    String color;
    Shape(String color){
        this.color=color;
    }
    String getColor(){
        return color;
    }
    double area(double radius){
        //System.out.println(getColor());
      if(getColor().equalsIgnoreCase("Sphere")){
          double area=4*3.1416*radius*radius;
          return area;
      }else if(getColor().equalsIgnoreCase("Cube")){
          double area=6*radius*radius;
          return area;
      }
      else return 0;
    }
    double volume(double radius){
        //System.out.println(getColor());
        if(getColor().equalsIgnoreCase("Sphere")){
          double volume=(4/3)*3.1416*radius*radius*radius;
          return volume;
      }else if(getColor().equalsIgnoreCase("Cube")){
          return radius*radius*radius;
      }
      else return 0;
    }  
}
