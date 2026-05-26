import java.util.HashSet;
import java.util.Set;

public class ArraysExample {
  // FInd Missing number
    public static void main(String[] args) {
        int[]arr={1,2,4,1,5,6};
        int n=arr.length+1;
        int actual=0;
        int expected=n*(n+1)/2;
        for(int num:arr){
            actual+=num;
        }
        System.out.println(expected-actual);
        findDuplicateNumber(arr);
        twoSum(arr,9);
        findSecondLargestElement(arr);
    }
//Find Second Largest Number
    private static void findSecondLargestElement(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        System.out.println("Second Largest: " + second);
    }

    //Two sum
    private static void twoSum(int[] arr, int target) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==target){
                System.out.println(i+":"+j);
            }
            }
        }
    }

    //FIndDuplicate
    private static void findDuplicateNumber(int[] arr) {
        Set<Integer> set=new HashSet<>();
        for(int n:arr){
            if(!set.add(n)){
                System.out.println(n);
                break;
            }
        }

    }



}
