package arrays;

//GFG
public class SecondLargest {
    public static void main(String[] args) {
        int arr1[] = {12, 35, 1, 10, 34, 1};
        System.out.println(seclarg(arr1));
    }

    public static int seclarg(int arr[]) {
        int first = arr[0];
        int second = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > first) {
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        return  second;
    }
}
