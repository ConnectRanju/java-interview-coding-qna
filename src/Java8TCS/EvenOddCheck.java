package Java8TCS;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EvenOddCheck {
    public static void main(String[] args) {
        /*List<Integer> evenNumbers= IntStream.rangeClosed(1,100)
                .filter(e->e%2==0)
                .boxed()
                .toList();*/

        Map<Boolean, List<Integer>> map=IntStream.rangeClosed(1,100)
                .boxed()
                .collect(Collectors.partitioningBy(i->i%2==0));

        List<Integer> even=map.get(true);
        List<Integer> odd=map.get(false);
        System.out.println("Even Numbers:" +even);
        System.out.println("Odd Numbers: " +odd);

   //Find Running sum


    }
}
