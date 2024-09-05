
package item;


public class Multimedia extends Item{
    private int length;
    
    Multimedia(int id, String title, int length){
        super(id,title);
        this.length=length;
    }
    void setlength(int length){
        this.length=length;
    }
    int getlength(){
        return length;
    }
    @Override
    public String toString(){
        return "Multimedia Item : id = "+getid()+", title = "+gettitle()+", length = "+getlength()+" seconds";
    }
}
