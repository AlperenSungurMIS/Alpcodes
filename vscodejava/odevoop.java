import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class odevoop {
    public static void main(String[] args) {
        
        List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(l);
        List<Integer> l1 = l.stream().map(p->p+5).collect(Collectors.toList()); //a
        System.out.println(l1);
        List<Integer> l2 = l.stream().filter(p->p>2 && p<8).collect(Collectors.toList()); //b
        System.out.println(l2);
        Optional<Integer> l3 = l.stream().reduce((p1,p2)->p2-p1); //c
        System.out.println(l3);
        List<Integer> l4 = l.stream().map(p->p%2==0?p+1:p-1).collect(Collectors.toList()); //d
        System.out.println(l4);
        List<Integer> l5 = l.stream().filter(p->p%2==0).collect(Collectors.toList()); //E
        System.out.println(l5);
        Optional<Integer> l6 = l.stream().reduce((p1,p2)->p1<p2?p1:p2); //f
        System.out.println(l6);
    }
    
}
