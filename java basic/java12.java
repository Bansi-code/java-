import java.util.*;
public class java12{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(min(n)/min(r)/min(n-r));
        
    }
    public static int min(int a  ){
        int fac =1;
        for(int i = a ; i>1 ; i--){
            fac = fac * i;
        }
        return fac;
    }
}