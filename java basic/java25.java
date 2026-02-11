public class java25 {
    public static void main(String[] args){
        int n = 13;
        for (int i =1 ;i <=n ;i++){
            for (int j=1 ;j<=n-i ;j++){
                System.out.print(" ");
            }
            for (int h=1 ;h<=n ; h++){
                if (i==1 || i==n || h== 1 ||h == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
