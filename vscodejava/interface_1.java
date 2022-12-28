interface su_sisesi {
    String renk = "Mavi";

    void doldur();
}
public class interface_1 implements su_sisesi {
    public static void main(String[] args) {
        System.out.println(renk);
        interface_1 interf = new interface_1();
        interf.doldur();
    }
    @Override
    public void doldur() {
        System.out.println("Su şisesi dolduruldu");
        
        
    }
 
    
}
