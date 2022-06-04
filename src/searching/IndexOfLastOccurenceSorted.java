package searching;

public class IndexOfLastOccurenceSorted {
    public static void main(String[] args) {
        int arr1 [] = {5,10,10,10,10,20,20};
        System.out.println(lastoccurenceindex(arr1, 10));
    }
    static int lastoccurenceindex(int arr[], int x) {
        int low = 0;
        int high = arr.length -1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] > x) {
                high = mid -1;
            }
            else if(arr[mid] < x) {
                low = mid + 1;
            }
            else {
                if(mid==arr.length-1 || arr[mid] != arr[mid + 1])
                    return mid;
                else
                    low = mid + 1;
            }
        }
        return -1;
    }
}

//low = 0 high = 6

//1st iteration:
//mid = 3
//low = 4

//2nd iteration:
//mid = 5
//high = 4

//3rd iteration:
//mid = 4
//return 4