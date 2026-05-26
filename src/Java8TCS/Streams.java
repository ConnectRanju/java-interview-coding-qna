package Java8TCS;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Streams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        list.stream().filter(n->n%2==0).forEach(System.out::println);

       Supplier<Double> s= Math::random;
      Double d=  s.get();
        System.out.println("Random:" +d);
        Consumer<Integer> c=i-> System.out.println("i:"+i);
        c.accept(10);

        Predicate<Integer> p= (a)->a%2==0;
       Boolean b= p.test(10);
        System.out.println(b);
        Function<String,Integer> f= String::length;
                //str.length();
        System.out.println("String length:"+ f.apply("Java"));
    }
}
