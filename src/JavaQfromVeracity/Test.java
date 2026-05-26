package JavaQfromVeracity;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;

public class Test {
    public static void main(String[] args) {
        List<Integer> lst= Arrays.asList(21,31,23,43,21,1,2);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        //sc.nextLine();
        int[] num= {2,1,3,4,5};
        for (int j : num) {
            try {
                System.out.println(j);
            } catch (ArithmeticException ex) {
                System.out.println("Exception");
            }


        }
        System.out.println( lst.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).toList());
    }
}
