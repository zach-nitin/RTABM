package searching;

public class IndexOfFirstOccurence {
    public static void main(String[] args) {
        int arr1[]={5,10,10,20,20};
        firstoccurence(arr1, 10);
    }

    static int firstoccurence(int arr[], int x) {
        int low = 0;
        int high = arr.length -1;

        while(low <= high) {
            int mid = (low + high) /2;
            if(arr[mid] > x)
                high = mid -1;
            else if(arr[mid] < x)
                low = mid +1;
            else{  // this is when arr[mid] == x
                if(mid==0 || arr[mid -1] != arr[mid])
                    return mid;
                else
                    high = mid -1;
            }
        }
        return -1;
    }
}

//Consider an array arr[] = {5,10,10,20,20}
//low = 0, high = 4

//1st iteration:
//mid = 2
//high = 1

//2nd iteration:
//mid = 0
//high = 1

//3rd iteration:
//mid = 1
//return 1
