package arrays;

public class LargestElementInArray {
    public static void main(String[] args) {
        int arr1 [] = {50,5,20,8};
        System.out.println(largest(arr1));
    }
    public static int largest(int[] arr) {
        //assign the first element as max
        int max = 0;
        //loop through the array
        for(int i = 1; i < arr.length; i++) {
            //if the next element(here it is the second element) is greater than max
            if(arr[i] > arr[max]) {
                max = i;
                return max;
            }
        }
        return max;
    }
}