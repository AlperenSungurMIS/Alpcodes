import java.util.HashMap;

public class hashmapornek {
    public static void main(String[] args) {
        // HashMap nesnesi oluşturma
HashMap<String, Integer> map = new HashMap<>();

// Değerleri ekleme
map.put("bir", 1);
map.put("iki", 2);
map.put("üç", 3);

// Değerleri alma
int deger1 = map.get("bir");  // değeri 1 olacaktır
int deger2 = map.get("iki");  // değeri 2 olacaktır
int deger3 = map.get("üç");   // değeri 3 olacaktır
    }
}
