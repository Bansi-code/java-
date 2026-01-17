public class java14 {

    public static int dectobin(int dec){
        int pow =0;
        int bin = 0;
        while (dec > 0) {
            bin = bin + (dec%2)*(int)Math.pow(10, pow);

            dec = dec/2;
            pow++;
        }
        return bin;
    }

    public static int bintodec(int n ){
        int dec=0;
        int pow = 0;
        while (n>0) {
            dec=dec + (n%10)*(int)Math.pow(2, pow);

            pow++;
            n = n/10;
        }
        return dec;
    }
    public static void main (String[] vars){
        System.out.println(bintodec(11100));
        System.out.println(dectobin(28));
    }
}
