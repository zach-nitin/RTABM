package searching;

//Naive Solution
//public class BinarySearchIterativeApproach {
//    public static void main(String[] args) {
//        int arr1 [] = {10,10};
//        System.out.println(binsearch(arr1, 10));
//    }
//    static int binsearch(int arr[], int x){
//        for(int i=0; i < arr.length; i++) {
//            if(arr[i] == x) {
//                return i;
//            }
//        }
//        return -1;
//    }
//}

//Optimized Solution
public class BinarySearchIterativeAprroach{
    public static void main(String[] args) {
        int arr1 [] ={10,20,40,50,60};
        System.out.println(binsearch(arr1, 25));
    }

    static int binsearch(int arr[], int x) {
        int low=0;
        int high = arr.length-1;

        while(low <=high) {
            int mid = (low + high)/2;
            if(arr[mid] == x){
                return mid;
            }
            else if(arr[mid] > x)
                high = mid-1;
            else
                low = mid + 1;
        }
        return -1;
    }
}

