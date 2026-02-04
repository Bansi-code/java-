public class java16 {

    public static int bintodec(int n){
        int pow = 0;
        int dec=0;
        while (n > 0) {
            int lastnum = n % 10;
            dec = dec + (lastnum * (int)Math.pow(2, pow));
            pow++;
            n = n / 10; 

            
        }
        return dec;
    }
    public static void main(String[] args) {
        System.out.println(bintodec(101101));
    }
}
