package arrays;

import java.util.ArrayList;

//This is from GFG
public class ValueEqualToIndexValue {

    public static void main(String[] args) {
        int arr1[] = {15,2,45,12,7,6};;
        System.out.println(valueEqualToIndexValue(arr1,5));
    }
    static ArrayList<Integer> valueEqualToIndexValue(int arr[], int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i + 1 == arr[i]) {
                list.add(i + 1);
            }
        }
        return list;
    }
}
