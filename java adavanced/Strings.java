import java.util.Scanner;

public class Strings{
    public static void palindrom(String shr){
        int n = shr.length();
        for(int i=0 ; i < n ; i++ ){
            if (shr.charAt(i) != shr.charAt(n-1-i)) {
                System.out.println("string is not palindrom...");
                return;
            }
        }
        System.out.println("string is palindrom ....");
        return;
    }

    public static void displacement(String str){
        int n = str.length();
        int x = 0;
        int y = 0;
        for(int i = 0 ; i < n ; i++){
            switch (str.charAt(i)) {
                case 'n':
                    y++;
                case 's':
                    y--;
                case 'e':
                    x++;
                case 'w':
                    x--;
                default:
                    break;
            }
        }
        int dis = (int) Math.pow( Math.pow(x, 2) + Math.pow(y, 2), 0.5);
        System.out.println(dis);
    }
    public static void main(String[] args){
        //String shr = "Bansi";
        // System.out.println(shr);
        //Scanner sc = new Scanner(System.in);
        //shr = sc.next();
        // System.out.println(shr);
        palindrom("moofhfm");
        displacement("wneenesennn");
    }
}