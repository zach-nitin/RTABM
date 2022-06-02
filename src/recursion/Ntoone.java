package recursion;

public class Ntoone {
    public static void main(String[] args){
        recu(5);
    }
    static void recu(int n) {
        if(n == 0)
            return;
        else {
            System.out.println(n);
            recu(n-1);

        }

    }
}
