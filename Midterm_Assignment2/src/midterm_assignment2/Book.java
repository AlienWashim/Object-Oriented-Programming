package midterm_assignment2;

import java.util.Scanner;


public class Book {
    private String Book_name;
    private long ISBN_number;
    private String Author_name;
    private String Publisher;
    private double Price;
    Book(String Book_name, long ISBN_number){
    this.Book_name=Book_name;
    this.ISBN_number=ISBN_number;
}
    String getBook_name(){
        return this.Book_name;
    }
    void setBook_name(String Book_name){
        this.Book_name=Book_name;
    }
    
    long getISBN_number(){
        return this.ISBN_number;
    }
    void setISBN_number(long ISBN_number){
        this.ISBN_number=ISBN_number;
    }
    
    Book(String Author_name, String Publisher,double Price){
    this.Author_name=Author_name;
    this.Publisher=Publisher;
    this.Price=Price;
}
        String getAuthor_name(){
        return this.Author_name;
    }
    void setAuthor_name(String Author_name){
        this.Author_name=Author_name;
    }
    
        String getPublisher(){
        return this.Publisher;
    }
    void setPublisher(String Publisher){
        this.Publisher=Publisher;
    }
    
    double getPrice(){
        return this.Price;
    }
    void setPrice(double Price){
        this.Price=Price;
    }
    
    void Price_update(){
        if(getPrice()<200)
            setPrice(((getPrice()*5)/100)+getPrice());
        else
            setPrice(((getPrice()*3)/100)+getPrice());
    }
    
    void Display(){
        System.out.println("Book Name: "+getBook_name());
        System.out.println("Book ISBN Number: "+getISBN_number());
        System.out.println("Book Author Name: "+getAuthor_name());
        System.out.println("Book Publisher Name: "+getPublisher());
        System.out.println("Book Price: "+getPrice());
    }
    public static void main(String[] args) {
        Book arr[];
        arr = new Book[10];

        Book obj=new Book("CSE1",202002034);
        obj.setAuthor_name("Washim");
        obj.setPublisher("Alien");
        obj.setPrice(500);
        arr[0]=obj;
        arr[0].Price_update();
        System.out.println("All information of book 1: ");
        arr[0].Display();
        System.out.println(" ");
        
        Book obj2=new Book("CSE2",202002035);
        obj2.setAuthor_name("Atiq");
        obj2.setPublisher("Alien2");
        obj2.setPrice(999);
        arr[1]=obj2;
        arr[1].Price_update();
        System.out.println("All information of book 2: ");
        arr[1].Display();
        System.out.println(" ");
        
        Book obj3=new Book("CSE3",202002036);
        obj3.setAuthor_name("Rabeya");
        obj3.setPublisher("Alien3");
        obj3.setPrice(499);
        arr[2]=obj3;
        arr[2].Price_update();
        System.out.println("All information of book 3: ");
        arr[2].Display();
        System.out.println(" ");
        
        Book obj4=new Book("CSE4",202002037);
        obj4.setAuthor_name("Kalam");
        obj4.setPublisher("Alien4");
        obj4.setPrice(299);
        arr[3]=obj4;
        arr[3].Price_update();
        System.out.println("All information of book 4: ");
        arr[3].Display();
        System.out.println(" ");
        
        Book obj5=new Book("CSE5",202002038);
        obj5.setAuthor_name("Nahid");
        obj5.setPublisher("Alien5");
        obj5.setPrice(150);
        arr[4]=obj5;
        arr[4].Price_update();
        System.out.println("All information of book 5: ");
        arr[4].Display();
        System.out.println(" ");
        
        Book obj6=new Book("CSE6",202002039);
        obj6.setAuthor_name("Borkot");
        obj6.setPublisher("Alien6");
        obj6.setPrice(190);
        arr[5]=obj6;
        arr[5].Price_update();
        System.out.println("All information of book 6: ");
        arr[5].Display();
        System.out.println(" ");
        
        Book obj7=new Book("CSE7",202002039);
        obj7.setAuthor_name("Karim");
        obj7.setPublisher("Alien7");
        obj7.setPrice(560);
        arr[6]=obj7;
        arr[6].Price_update();
        System.out.println("All information of book 7: ");
        arr[6].Display();
        System.out.println(" ");
        
        Book obj8=new Book("CSE8",202002040);
        obj8.setAuthor_name("Binod");
        obj8.setPublisher("Alien8");
        obj8.setPrice(460);
        arr[7]=obj8;
        arr[7].Price_update();
        System.out.println("All information of book 8: ");
        arr[7].Display();
        System.out.println(" ");
        
        Book obj9=new Book("CSE9",202002041);
        obj5.setAuthor_name("Noren");
        obj5.setPublisher("Alien9");
        obj5.setPrice(1500);
        arr[8]=obj9;
        arr[8].Price_update();
        System.out.println("All information of book 9: ");
        arr[8].Display();
        System.out.println(" ");
        
        Book obj10=new Book("CSE10",202002042);
        obj10.setAuthor_name("Lord Van");
        obj10.setPublisher("Alien10");
        obj10.setPrice(1899);
        arr[9]=obj10;
        arr[9].Price_update();
        System.out.println("All information of book 10: ");
        arr[9].Display();
        System.out.println(" ");
    }
    
}
