package lab4;

public class Lab4 {

    
    public static void main(String[] args) {
    Shape obj=new Shape();
    obj.setColor("Red");
    obj.setFilled(true);
    System.out.println(obj);
    Shape obj1=new Shape("Green", false);
    System.out.println(obj1);
    }
    
}
