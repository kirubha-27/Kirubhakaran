import java.util.Arrays;

public class Pro_69_2 {

    public static void rotate(int[] arr,int r,int n){
        int p = 1;
        while (p <= r) {
            int first = arr[n-1];
            for (int i =n-1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = first;
            p++;
        }


    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        rotate(arr,7,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
