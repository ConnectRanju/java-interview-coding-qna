package MapExample;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapExample {
    public static void main(String[] args) {

     // 1.flat map
        List<List<Integer>> list= Arrays.asList(
                Arrays.asList(12,2,3,4),
                Arrays.asList(67,4,5,62)
        );
       List<Integer> result= list.stream().
                flatMap(i->i.stream())
                        .toList();
       //Method reference
//        list.stream()
//                .flatMap(Collection::stream)
//                .collect(Collectors.toList());
        System.out.println(result);
        List<Integer> i=Arrays.asList(1,2,3,10);
        i.stream().filter(n->n%2==0).map((x->x*x)).forEach(System.out::println);
        Supplier<Double> s= ()->Math.random();
        s.get();
        System.out.println(s.get());
        Consumer<Integer> c=a-> System.out.println(a);
        c.accept(10);
        Function<Integer,Integer> f=a->a*a;
        System.out.println("FUnction"+f.apply(10));
        System.out.println("SUM: "+i.stream().mapToInt(n->n)
                .sum());
        Map< Boolean, List<Integer>> m=IntStream.rangeClosed(1,100).boxed()
                .collect(Collectors.partitioningBy(x->x%2==0));
        System.out.println(m.get(true));
        AtomicInteger sum;
        List<Integer> listN = Arrays.asList(1, 2, 2, 3, 3, 3);
        listN.stream().sorted().skip(1).findFirst().orElse(0);
        System.out.println("-----");
        Collections.sort(listN);

        Map<Integer, Long> freq = listN.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        System.out.println(freq);
        List<String> names = Arrays.asList("a", "bb", "c");
        names.sort(Comparator.comparing(String::length));
        System.out.println(names+"00000");
        Map<String, Integer> map = names.stream()
                .collect(Collectors.toMap(
                        Function.identity(),
                        String::length
                ));
        Map<String, Long> st=names.stream().collect(Collectors.

                groupingBy(x->x,Collectors.counting()));
    }

}
