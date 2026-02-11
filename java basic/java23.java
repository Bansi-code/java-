public class java23 {
    public static void main (String[] args){
        int count =1;
        int n=10;
        for(int i =1 ; i<=n ; i++){
            for(int j=1 ; j<=2*n ; j++){
                if(j <= i || j >= 2*n -i+1){
                System.out.print("*");}
                else{System.out.print(" ");}
            }
            System.out.println();
        }
        for(int i =n ; i>=1 ; i--){
            for(int j=1 ; j<=2*n ; j++){
                if(j <= i || j >= 2*n -i+1){
                System.out.print("*");}
                else{System.out.print(" ");}
            }
            System.out.println();
        }
    }
}
