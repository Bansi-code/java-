public class java15 {

    public static void hollow_rectangle(int row , int  collum){
        for(int i = 1 ; i<= row ; i++){
            for(int j = 1 ; j <= collum ; j++){
                if ( i==1 || i ==row || j == 1 || j== collum) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void inveted_paramid(int row , int collum){
        for(int i = 1 ; i<= row ; i++){
            for(int j= 1 ; j<= collume ; j++){
                
            }
        }
    }

    public static void main(String[] args) {
        hollow_rectangle(2, 4);
    }
}
