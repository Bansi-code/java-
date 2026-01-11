public class java7 {
    public static void main(String[] args) {
        int a = 123456789;
        for(int i=0 ; i< 9;i++){
            int last_digit=a%10;
            a = a/10;
            System.out.print(last_digit);
        }
    }
}
