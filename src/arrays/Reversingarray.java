package arrays;

import java.util.Arrays;

public class Reversingarray {
    public static void main(String[] args) {
        int arr1 [] = {10,5,7,30};
        reverse(arr1);
    }
    public static void reverse(int arr[]){
        int lengthOfArray = arr.length;
        int low = 0;
        int high = lengthOfArray-1;
        while(low < high){
            int temp = arr[low];
            arr[low]= arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        System.out.println(Arrays.toString(arr)); //if you don't give Arrays.toString it will give a hash value.
    }
}

//Time Complexity of this program is: Theta(n)
//Auxiliary Space: Theta(1)