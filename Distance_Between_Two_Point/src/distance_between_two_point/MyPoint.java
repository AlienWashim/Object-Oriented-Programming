package distance_between_two_point;


public class MyPoint {
    int x,y;
    
    MyPoint(){
        x=0;
        y=0;
    }
    
    MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }
    void setX(int x){
        this.x=x;
    }
    int getX(){
       return x;
    }
    void setY(int y){
        this.y=y;
    }
    int getY(){
       return y;
    }
    public String toString(String s){
        return s+" : "+"("+x+","+y+")";
    }
    public double distance(int x,int y){
        double n=(this.x-x)*(this.x-x);
        double m=(this.y-y)*(this.y-y);
        return Math.sqrt(n+m);
    }
    
    public double distance(MyPoint obj){
        double n=(obj.getX()-x)*(obj.getX()-x);
        double m=(obj.getY()-y)*(obj.getY()-y);
        return Math.sqrt(n+m);
    }
    
    public double distance(){
        double n=(0-x)*(0-x);
        double m=(0-y)*(0-y);
        return Math.sqrt(n+m);
    }
}
