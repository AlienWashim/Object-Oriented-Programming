
package exception1;

class MyException extends Exception{
    int a;
    
    MyException(int i) { a = i;}
    @Override
    public String toString (){
        return "MyException[" + a+"]";}
        }

class Test{
    static void compute (int a) throws MyException{
        if(a>10)
        throw new MyException(a);
        System.out.println("Normal Exit");
    }
}