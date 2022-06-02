package arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int arr1[] = {20,5,7,25};
        System.out.println(lsearch(arr1, 4, 17));
    }
    public static int lsearch(int arr[], int n, int x) {
        for(int i = 0; i < n; i++) {
            if(arr[i] == x)
                return 1;
        }
        return -1;
    }
}

