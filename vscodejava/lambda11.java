

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lambda11 {
    public static void main(String[] args) {
        //ArrayList<Integer> liste = new ArrayList<>(Arrays.asList(0,1,2,5));
        List<Integer> liste = Arrays.asList(0,2,3,18,5,1,2,7);
        System.out.println(liste);

        
        List<Double> l2 = liste.stream().map(p->Math.sqrt(p+2)).collect(Collectors.toList());
        System.out.println(l2);

        List<Integer> l3 = liste.stream().map(p->(int)Math.pow(p,5)).collect(Collectors.toList());
        System.out.println(l3);



    }



}