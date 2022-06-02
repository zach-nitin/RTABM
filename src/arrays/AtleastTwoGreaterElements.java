package arrays;

import java.util.Arrays;

public class AtleastTwoGreaterElements {
    public static void main(String[] args) {
        int arr1[] = {2,-6,3,5,1};
        twogreaterlements(arr1);
    }
    public static void twogreaterlements(int arr[]) {
        int first = arr[0];
        int second = arr[0];
        for(int i=0; i < arr.length; i++){
            if(arr[i] > first) {
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second)
                second = arr[i];
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < second) {  // go till the second last largest element in the array. Only print elements before that.
                System.out.println(arr[i] + "");
            }
        }
    }
}
