import java.util.Arrays;

public class Pro_66_2 {
    public static void rotate(int[] arr,int r,int n){
        int p = 1;
        while (p <= r) {
            int last = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = last;
            p++;
        }


    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        rotate(arr,7,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
