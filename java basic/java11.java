public class java11 {
    public static void main(String[] args){
    int n=26;
    char ch = 'z' ;
    for(int i = 1 ; i <= n ; i++){
        for(int j = 1 ; j <=i ; j++){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }
}
}