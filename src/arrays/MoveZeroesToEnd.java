package arrays;

import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int arr1 [] = {8,5,0,10,0,0};
        movezeroes(arr1);
    }

    public static void movezeroes(int arr[]) {
        int count = 0;
        for(int i =0; i< arr.length; i++) {
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
