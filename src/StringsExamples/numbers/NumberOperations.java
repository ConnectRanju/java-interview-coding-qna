package StringsExamples.numbers;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;



public class NumberOperations {
    public static void main(String[] args) {

        //1.Remove Duplicates

        List<Integer> list = Arrays.asList(1,2,3,4,2,3,5);
        // list.stream().distinct().forEach(System.out::println);
        Set<Integer> set = new HashSet<>(list);
        List<Integer> list1 = set.stream().map(n -> n).toList();
        //System.out.println(list1);

    //2.Find Duplicates
        Set<Integer> seen=new HashSet<>();
    Set<Integer> duplicates= list.stream().filter(n->!seen.add(n)).collect(Collectors.toSet());
        //System.out.println(duplicates);

    //3.Find first non-repeated character in a string

        String input = "swiss miss";

        Character result = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println(result);


    }
}
