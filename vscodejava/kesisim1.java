import java.util.Arrays;
import java.util.HashSet;

public class kesisim1 {
    public static void main(String[] args) {
        HashSet<Integer> A = new HashSet<>(Arrays.asList());
        HashSet<Integer> B = new HashSet<>(Arrays.asList());

        for(int i = 0;i<20;i++){

            A.add((int) (Math.random()*50+1));
            B.add((int) (Math.random()*50+1));
        }
        System.out.println(A);
        System.out.println(B);
        A.removeAll(B);
        System.out.println(A);
        A.retainAll(B);
        System.out.println(A);
        A.addAll(B);
        System.out.println(A);
    }
}
