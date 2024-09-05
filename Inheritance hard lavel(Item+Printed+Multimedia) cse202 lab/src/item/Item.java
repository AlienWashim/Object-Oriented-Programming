
package item;


public class Item {
    private int id;
     private String title;
    public Item (int id, String title) {
        this.id=id;
        this.title=title;
    }
    
    void setid(int id){
        this.id=id;
    }
    int getid(){
        return id;
    }
    void settitle(String title){
        this.title=title;
    }
    String gettitle(){
        return title;
    }
    @Override
    public String toString(){
        return "Item : id = "+getid()+" title = "+gettitle()+"";
    }  
}
