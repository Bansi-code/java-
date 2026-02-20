public class java31 {
    public static void subset(int arr[]){
        int conut = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i ; j < arr.length ; j++){
                int sum =0;
                for(int k =i ; k <= j ; k++){
                    sum = sum +arr[k];
                }
                if (sum > conut) {
                    conut=sum;
                }
            }
            
        }
        System.out.print(conut);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,3,-4,5};

        subset(arr);
    }
}
