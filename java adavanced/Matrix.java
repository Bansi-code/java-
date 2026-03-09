import java.util.*;
public class Matrix {
    public static void scan_2D_arr(int arr[][] ){
        int n = arr.length ;
        int m = arr[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i =0 ; i < n ; i++){
            for(int j = 0 ; j< m ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void print_2D_array(int arr[][] ){
        int n = arr.length ;
        int m = arr[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i =0 ; i < n ; i++){
            for(int j = 0 ; j< m ; j++){
                System.out.print( arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void search(int arr[][] , int key){
        int n = arr.length ;
        int m = arr[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i =0 ; i < n ; i++){
            for(int j = 0 ; j< m ; j++){
                if (arr[i][j] == key) {
                    System.out.println("found at (" + i + " , " + j+")" );
                }
            }
        }
    }

    public static void spiral(int matrix[][]){
        int sc/*start colum */ = 0;
        int sr = 0 ;
        int er = matrix.length-1;
        int ec = matrix[0].length-1;

        while (er >= sr && ec >= sc) {
            for(int j = sc ; j <= ec ; j++){
                System.out.print(matrix[sr][j]);
            }
            for(int i = sr + 1 ; i <= er ; i++){
                System.out.print(matrix[i][ec]);
            }
            for(int j = ec - 1 ; j >= sc ; j--){
                System.out.print(matrix[er][j]);
            }
            for(int i = er -1 ; i > sr  ; i--){
                System.out.print(matrix[i][sc]);
            }
            sr++;
            sc++;
            ec--;
            er--;
        }
    }

    public static void sortedarr(int arr[][] , int key){
        int row =0 ; int col = arr[0].length -1 ;
        while (row < arr.length && col >= 0) {
            if (key == arr[row][col]) {
                System.out.println("key found at (" + row + "," + col + ")" );
                return;
            }
            else if (key < arr[row][col]) {
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key does not founded!");
    }
    public static void main (String[] args){
        int bansi[][] = {{10 , 20 , 30 , 40} , {15,25,35,45} , {27,29,37,48} ,{32,33,39,50}  };
        print_2D_array(bansi);
        spiral(bansi);
        System.out.println();
        sortedarr(bansi, 33);
    }
}
