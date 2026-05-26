package JavaQfromVeracity;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee implements Comparable {
    int i;
    String ram;
    int i1;
    public Employee(int i, String ram, int i1) {
        this.i=i;
        this.ram=ram;
        this.i1=i1;
    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 2, 9, 1, 7);
        Stream<Integer> sorted = list.stream().sorted(Comparator.naturalOrder());
        list.stream().sorted(Comparator.comparingInt(i-> (int) i).reversed()).forEach(System.out::println);
        list.sort(Comparator.naturalOrder());
        Collections.sort(list);

        int index = Collections.binarySearch(list, 5);
        System.out.println("Binary index: "+index);

//        ArrayList<Employee> al = new ArrayList<Employee>();
//        al.add(new Employee(102, "ram", 2000));
//        al.add(new Employee(103, "shyam", 3000));
//        al.add(new Employee(101, "sam", 10000));
//        al.add(new Employee(104, "sameer", 40000));
//        al.sort(Comparator.naturalOrder());
//        Collections.sort(al);


//        al.stream().sorted(Comparator.comparing(e->e.ram)).forEach(System.out::println);
//        al.stream().sorted().forEach(System.out::println);
        //sort list in ascending order of salary using sort method and Comparator


        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(7);
        al.add(5);
        al.add(16);
        al.add(7);
        al.add(16);
        //remove duplicates from list and display (insertion order should not change)

        List<Integer> collect = al.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);

        //List<Integer> list = Arrays.asList(5, 2, 9, 1, 5, 2, 7);

        List<Integer> result = new ArrayList<>(new LinkedHashSet<>(list));

        System.out.println(result);

        List<Integer>combined= new ArrayList<>();
        combined.addAll(list);
        combined.addAll(al);
        System.out.println(combined);
        List<Integer> lst2=Stream.concat(list.stream(), al.stream()).distinct().toList();
        List<Integer> lst3=Stream.concat(list.stream(), al.stream()).distinct()
                .filter(i->i>5).toList();
        System.out.println("List:" +lst3);

Set<Integer> hashSet=new HashSet<>();
hashSet.add(10);
hashSet.add(10);
hashSet.add(20);
        System.out.println("Hash Set: "+hashSet);

    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }


}
