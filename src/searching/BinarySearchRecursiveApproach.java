package searching;

public class BinarySearchRecursiveApproach {
    public static void main(String[] args) {
        int arr1[] = {10,20,30,40,50,60,70};
        System.out.println(bsearch(arr1, 0,6,25));
    }
    static int bsearch(int arr[], int low, int high, int x) {
        if(low > high)
            return -1;

        int mid = (low + high) / 2;

        if(arr[mid] == x)
            return mid;

        else if(arr[mid] > x)
            return bsearch(arr,low, mid-1, x);
        else
            return bsearch(arr, mid+1,high,x);

    }

}
