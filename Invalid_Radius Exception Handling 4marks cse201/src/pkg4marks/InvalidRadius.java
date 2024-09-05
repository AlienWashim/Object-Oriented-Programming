
package pkg4marks;


public class InvalidRadius extends Exception{
        private double x;
    InvalidRadius(double x){
        this.x=x;
    }

    public String toString(){
        return "InvalidRadius As" + x+"is a negative number";
    }

}

