enum Gunler1{   //Color.RED
    PAZARTESİ, //
    SALI, //1
    ÇARŞAMBA, //2
    PERŞEMBE, //3
    CUMA,
    CUMARTESİ,
    PAZAR
}

public class Gunler {
    public static void main(String[] args) {
        Gunler1 g = Gunler1.PAZARTESİ;
        System.out.println(g);
        System.out.println(g.compareTo(Gunler1.PERŞEMBE));
        System.out.println(g.ordinal());
        System.out.println(Gunler1.PAZAR.ordinal());

    }
}
