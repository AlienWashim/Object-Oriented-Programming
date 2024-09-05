package lab_task_interface;

class D implements C{
    
    public void display1(){
        System.out.println("A");
    }
    
    public void display2(){
        System.out.println("B");
    }
    
    public void display3(){
        System.out.println("C");
    }
    
    public static void main(String[] args) {
        D obj=new D();
        obj.display1();
        obj.display2();
        obj.display3();
    }
}
