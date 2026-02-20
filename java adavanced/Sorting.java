import java.lang.reflect.Array;

public class Sorting {
    public static void Bobblesort(int array[]) {
        for(int i = 0 ; i< array.length -1 ; i++){
            for(int j = 0 ; j < array.length -1-i ; j++){
                if (array[j] > array[j+1]) {
                    array[j] = array[j] + array[j+1];
                    array[j+1] = array[j]-array[j+1];
                    array[j] =  array[j]-array[j+1];
                }
            }
        }
    }
    public static void selectionsort(int arr[]) {
        for(int i = 0 ; i <arr.length ; i++ ){
            int minmum =i;
            for(int j = i + 1 ; j < arr.length ; j++){
                if (arr[minmum] > arr[j]) {
                    minmum = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minmum];
            arr[minmum] = temp;
        }
    }
    public static void insertionsort(int arr[]) {
        for(int i=1;i<arr.length-1 ; i++){
            int curr = arr[i];
            int prev = i -1;
            while (prev>=0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] =curr;
        }
    }


    public static void printarr(int arr[]) {
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args ){
        int bansi[] = {1,2,4,3,2,3,2,44,4};
        Bobblesort(bansi);
        int bansi1[] = {1,2,4,3,2,3,2,44,4};
        System.out.print("By Bobble sorting :" );
        printarr(bansi1);
        selectionsort(bansi);
        System.out.print("By selection sorting :");
        printarr(bansi);
        int bansi3[] = {1,2,4,3,2,3,2,44,4};
        insertionsort(bansi3);
        printarr(bansi3);

    }
}
