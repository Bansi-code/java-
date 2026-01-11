import java.util.*;
public class java5 {
    public static void main (String arr[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter A:");
        int a = sc.nextInt();
        System.out.println("Enter B");
        int b = sc.nextInt();
        System.out.println("Enter opreter");
        char opreter = sc.next().charAt(0);
        switch (opreter) {
            case '+':
                System.out.println(a+b);
                break;
            case '-': System.out.println(a-b); break;
            case '*' : System.out.println(a*b); break;
            case '/' : System.out.println(a/b); break;
        
            default:  System.out.println("wrong input");
                break;
        }
        
    }
}
