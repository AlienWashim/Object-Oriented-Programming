package area_tr.rect.cir_constructor;

import java.util.Scanner;


public class Area_TRRectCir_constructor {

    Area_TRRectCir_constructor(float r){
        double area=3.1416*r*r;
        System.out.println("Area of circle is: "+area);
    }
    
    Area_TRRectCir_constructor(float n, float m){
        float area=(n*m)/2;
        System.out.println("Area of triangle is: "+area);
    }
    
    Area_TRRectCir_constructor(float n, double m){
        double area=n*m;
        System.out.println("Area of rectangle is: "+area);
    }
    public static void main(String[] args) {
        System.out.print("Enter triangle's base & height: ");
        Scanner sc=new Scanner(System.in);
        float base=sc.nextFloat();
        float height=sc.nextFloat();
        Area_TRRectCir_constructor obj=new Area_TRRectCir_constructor(base,height);
        
        System.out.print("Enter rectabgle's length & breadth: ");
        float length=sc.nextFloat();
        double breadth=sc.nextDouble();
        Area_TRRectCir_constructor obj2=new Area_TRRectCir_constructor(length,breadth);
        
        System.out.print("Enter circle's radius: ");
        float r=sc.nextFloat();
        Area_TRRectCir_constructor obj3=new Area_TRRectCir_constructor(r);
    }
    
}
