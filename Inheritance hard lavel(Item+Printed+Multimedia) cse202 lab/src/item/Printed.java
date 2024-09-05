
package item;


public class Printed extends Item{
     private int pages;
    
    Printed(int id, String title, int pages){
        super(id,title);
        this.pages=pages;
    }
    void setpages(int pages){
        this.pages=pages;
    }
    int getpages(){
        return pages;
    }
    @Override
    public String toString(){
        return "Printed Item : id = "+getid()+", title = "+gettitle()+", no of pages = "+getpages();
    }
}
