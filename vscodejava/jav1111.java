import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class jav1111 {
  public static void main(String[] args) {
    // Örnek metin
    String text = "Java dilini öğrenmek Java programlama dünyasına giriş yapmanızı sağlar.";

    // Düzenli ifadeyi oluşturma
    Pattern pattern = Pattern.compile("Java");

    // Metni düzenli ifadeye göre eşleştirme
    Matcher matcher = pattern.matcher(text);

    // Eşleşen kelimeleri sayma
    int count = 0;
    while (matcher.find()) {
      count++;
    }

    // Sonuçları ekrana yazdırma
    System.out.println("Metin içinde " + count + " kez Java kelimesi geçmektedir.");
  }
}

