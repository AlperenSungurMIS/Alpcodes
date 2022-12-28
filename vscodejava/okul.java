public class okul {

    int numara;
    String ad;
    int yas;

    void  goster () {
        System.out.println (numara + " 692 " + ad + " alperen " + yas + " 18 ");
    }  
     
    public static void  main (String args []) {    
    // nesnelerimizi oluşturduk 
    okul okul1 = new okul();
    okul okul2 = new okul();
    okul okul3 = new okul();
    //nesnelerimizin değerlerinin çıktısını verdik
    okul1.goster();  
    okul2.goster();
    okul3.goster();
    }  
    }  
    
    

