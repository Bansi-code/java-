public class Java26 {
    public static int large(int arr[]){
        int large = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if (arr[i] > large) {
                large = arr[i];
            }
        }
        return large;
    }
    public static void main(String[] args){
        int arr[] = {1, 2, 103343, 533454,535345};
        System.out.println("The largest number is: " + large(arr));
    }
}
