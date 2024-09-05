
package pkg4marks;



public class ExceptionCreation {

     static double Area(double x){
        return Math.PI*x*x;
    }

    public static void main(String[] args) throws InvalidRadius {
        double x=202002034%9-5;
        try{
            if(x<0){
            throw new InvalidRadius(x);
        }else{
                System.out.println("Area is: "+Area(x));
        }
        }catch(InvalidRadius e){
                System.out.println("Exception: "+e);
                }
        
    } 
}
