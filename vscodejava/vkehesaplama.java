import java.util.Scanner;

public class vkehesaplama {
    public static void main(String[] args) {

        double boy,kilo,vKE ;
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        boy=scan.nextDouble();
        System.out.print("Lütfen kilonuzu kilogram cinsinden giriniz: ");
        kilo=scan.nextDouble();
        vKE=kilo/(boy*boy);
        System.out.println("vücut kitle indeksiniz : "+ vKE);
        if (vKE<18.5){
            System.out.println("zayıf");
        }else if (vKE>=18.5 && vKE<=24.9) {
            System.out.println("ideal");
        }else if (vKE>=25.0 && vKE<=29.9) {
            System.out.println("şişman");
        }else if (vKE>=30.0 && vKE<=34.9) {
            System.out.println("obez");
        }else if (vKE>=35.0) {
            System.out.println("aşırı obez");
        }

    }
}