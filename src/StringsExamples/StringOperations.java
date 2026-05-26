package StringsExamples;

import java.util.Arrays;
import java.util.List;

public class StringOperations {
    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("Apple","banana","orange");


      //  fruits.stream().map(String::toUpperCase).forEach(System.out::println);
//Reverse a string
        String str = "hello";
        char[]reversed=new char[str.length()];
        char[]ch=str.toCharArray();
        int length=str.length()-1;
        for(int i=0;i<str.length();i++){
            reversed[i]=ch[length];
            length--;
        }
       System.out.println(reversed);
        reverseAString("Helllooo");

    }
    public static void reverseAString(String str){

        char[]original=str.toCharArray();
        int left=0;
        int right=str.length()-1;
        while (left<right){
            char temp=original[left];
            original[left]=original[right];
            original[right]=temp;
                 left++;
                 right--;


        }
        System.out.println(new String(original));

    }
}
