 abstract class AbstractDataBase1  {
    public void add(){
     System.out.println("Eklendi...");
    }
    public void delete(){
     System.out.println("Silindi...");
    }
     abstract void uptade();
     abstract void get();
 }
 class mysqlDataBase extends AbstractDataBase1 {
 
     @Override
     void uptade() {
         System.out.println("Mysql Güncellendi...");
         
     }
 
     @Override
     void get() {
         System.out.println("Mysql verileri alındı");
     }
 }
 class Mongodatabase extends AbstractDataBase1 {
 
     @Override
     void uptade() {
         System.out.println("Mongo Güncellendi...");
         
     }
 
     @Override
     void get() {
         System.out.println("Mongo verileri alındı");
     }
 }  
public class main1 {
    public static void main(String[] args) {
        AbstractDataBase1 abs1 = new mysqlDataBase();
        AbstractDataBase1 abs2 = new Mongodatabase();
        abs1.get();
        abs2.get();
    }
    
}
