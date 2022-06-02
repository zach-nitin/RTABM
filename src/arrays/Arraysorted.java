package arrays;

public class Arraysorted {
    public static void main(String[] args) {
        int arr1 [] ={100,20,200};
        System.out.println(arrsorted(arr1));
    }
    public static boolean arrsorted(int arr[]) {
        for(int i=1; i<arr.length; i++){
            if(arr[i] < arr[i-1])
                return false;
        }
        return true;
    }
}
