

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class l3_lambda_filter {
    public static void main(String[] args) {
        // Filtreleme


        List<Integer> l = Arrays.asList(12,25,60,27,57,82,98);
        System.out.println(l);
        List<Integer> l1 = l.stream().filter(p->p%4<3 && p>25).collect(Collectors.toList());
        System.out.println(l1);
        List<Integer> l2 = l.stream().map(p->p%2==0?p/2 : (p+1)/2).collect(Collectors.toList());
        System.out.println(l2);


        List<Integer> l3 = l.stream().filter(p->p<50).collect(Collectors.toList());
        System.out.println(l3);

        List<Integer> l4 = l.stream().filter(p->p>20 && p<80).collect(Collectors.toList());
        System.out.println(l4);

    }



}

