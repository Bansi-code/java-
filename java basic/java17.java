import java.util.*;

public class java17 {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        System.out.println(bintodec(n));
    }

    public static int bintodec(int n){
        int bin = 0;
        int pow = 0;
        int r =0;
        while (n>0) {
            r = n%2;
            bin = bin + r*(int)Math.pow(10,pow) ;
            pow ++;
            n = n/2;

        }
        return bin;
    }
}
