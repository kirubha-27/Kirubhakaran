import java.util.Arrays;

public class Pro_64_2 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,5,6,7};
        int[] des = Arrays.copyOf(arr,arr.length);

        System.out.println(Arrays.toString(des));
    }
}
