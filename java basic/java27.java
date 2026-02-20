public class java27 {
    public static int binnarysearch(int arr[] , int key ){
        int start =0;
        int end = arr.length - 1 ;
        int mid =0;
        while (start <=end ){
            mid = (start + end) / 2 ;
            if (mid == key) {
                return mid ;
            }
            if(mid < key){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return -1 ;
    }
    public static void main (String[] args){
        int arr[] = {1,2,3,4,5};
        int key = 1;
        System.out.println(binnarysearch(arr, key));

    }
}
