class Bilgisayarlar {
    void islemci() {
        System.out.println("Bilgisayarlardaki işlemciler:");
    }
}
class laptop1 extends Bilgisayarlar {
    void islemci() {
        System.out.println("laptop1'in işlemcisi intel i3");
    }
}
class laptop2 extends Bilgisayarlar {
    void islemci() {
        System.out.println("laptop2'nin işlemcisi intel i5");
    } 
}  
public class polymorp1 { 
    public static void main(String[] args) {
        laptop1 l1 = new laptop1();
        l1.islemci();
        laptop2 l2 = new laptop2();
        l2.islemci();
    }
}
   