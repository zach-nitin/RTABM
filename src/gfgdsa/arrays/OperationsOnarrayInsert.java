package gfgdsa.arrays;

public class OperationsOnarrayInsert {
    public static void main(String[] args) {
        int arr1 [] = {5,10,20};
        System.out.println(insert(arr1, 7,2,5, 4));
    }

    public static int insert(int arr[], int x, int pos, int cap, int n){
        if(n == cap)
            return n;

        int idx = pos -1;

        for(int i = n -1; i>= idx; i--) { // to shift position to +1 index position
            arr[i+1] = arr[i];
        }
        arr[idx] = pos;
        return n + 1;
    }
}
