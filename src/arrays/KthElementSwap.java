package arrays;

import java.util.Arrays;

//GFG
public class KthElementSwap {
    public static void main(String[] args) {
        int arr1 [] = {1,2,3,4,5,6,7,8};
        kthelementswap(arr1, 8 , 3);
    }
    public static void kthelementswap(int arr[], int n, int k){

            int temp = arr[k-1];
            arr[k-1] = arr[n-k];
            arr[n-k] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
