package gfgdsa.arrays;

public class OperationsOnArrayDelete {
    public static void main(String[] args) {
        int arr1[] = {3,8,12,5,6};
        System.out.println(delete(arr1, 22,5));
    }
    static int delete(int arr[], int x, int n) {
        //Traverse through the array
        int i;
        for(i=0; i< n ; i++) {
            //Check if element is matching arr[i]
            if (arr[i] == x)
                break;
        }
        if(i == n)
            return n;

        for (int j=i; j<n-1; j++)
            arr[j] = arr[j+1];
        return (n-1);
    }
}
