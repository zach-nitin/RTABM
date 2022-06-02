package arrays;

import java.util.Arrays;

public class Leftrotatearraybyone {
    public static void main(String[] args) {
        int arr1[] = {2,3,4,5,5};
        leftrotate(arr1);
    }
    public static void leftrotate(int arr[]){
        int temp = arr[0];
        for(int i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length -1 ] = temp;
        System.out.println(Arrays.toString(arr));
        }
}



