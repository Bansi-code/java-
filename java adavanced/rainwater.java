public class rainwater {
    public static int rainwater(int arr[]) {
        if (arr.length == 1 || arr.length == 2) {
            return 0;
        }
        int water_level = 0;
        int area = 0;
        int total_area = 0;
        for(int i = 0 ; i < arr.length ; i++ ){
            int max_left = 0;
            int max_right = 0;
            for(int j = i-1; j >= 0 ; j--){
                if (max_left < arr[j]) {
                    max_left = arr[j];
                }
            }
            for(int k = i+1; k < arr.length ; k++){
                if (max_right < arr[k]) {
                    max_right = arr[k];
                }
            }
            water_level = Math.min(max_left, max_right);
            area = water_level - arr[i];
            area = (area > 0 ) ? area : 0 ;
            total_area = total_area +area;
        }
        return total_area;
    }
    public static void main(String[] args) {
        int bansi[] = {4,2,0,3,2,5};
        System.out.println(rainwater(bansi));
    }
}
