public class java28{
    public static int revers(int arr[]) {
        int start = 0 , end = arr.length -1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return 0;
    }
    public static void main(String[] args ){
        int bansi[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        revers(bansi);
        for(int i = 0; i < bansi.length; i++){
            System.out.print(bansi[i] + " ");
    }
}
}