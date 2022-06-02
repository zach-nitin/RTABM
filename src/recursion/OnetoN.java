package recursion;

public class OnetoN {
    public static void main(String[] args) {
        recurs(5);
    }

    static void recurs(int n) {
        if(n==0)
            return;
        else {
            recurs(n-1);
            System.out.println(n);
        }

    }
}
