
package item;


public class Main {
    public static void main(String[] args) {
        Item item[]=new Item[4];
        item[0]=new Item(34,"CSE202");
        item[1]=new Item(34,"CSE202");
        item[2]=new Printed(35,"CSE203",999);
        item[3]=new Multimedia(34,"CSE204",1200);
        printItems(item);
        
        
    }
    public static void printItems(Item item[]){
            System.out.println("202002034");
            for(int i=0;i<4;i++){
                System.out.println(item[i].toString());
            }
        }
}
