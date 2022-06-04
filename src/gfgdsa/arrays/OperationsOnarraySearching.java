package gfgdsa.arrays;

//Returning the index of the element found in the array. Here 'x' is the element to ve found and its position to be returned.
public class OperationsOnarraySearching {
    public static void main(String[] args) {
        int arr1 [] = {20,5,7,25};
        System.out.println(search(arr1, 5));
    }
    public static int search(int arr[], int x) {
        for (int i=0; i<arr.length; i++){
            if(arr[i] == x)
                return i;
        }
        return -1;
    }
}
// Time Complexity - 0(n)