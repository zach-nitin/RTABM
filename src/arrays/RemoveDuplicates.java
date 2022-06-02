package arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr1 [] = {10};
        System.out.println(removedup(arr1));

    }
    public static int removedup(int arr[]){
        int res = 1;
        for(int i=1; i< arr.length; i++) {
            if(arr[res] != arr[i]) {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }
}
