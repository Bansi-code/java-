public class java13 {
    public static boolean isprime(int n){
        if (n==1) {
            return true;
        }
        for(int i =2 ; i < n ; i++){
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] vars){
        int n = 1000;
        for( int i = 2 ; i <= n ; i++){
            if (isprime(i) == true) {
                System.out.print(i + "\t");
            }
        }

    }
}
