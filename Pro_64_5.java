import java.util.Arrays;

public class Pro_64_5 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,5,6,7};
        int[] des = Arrays.copyOfRange(arr,0,arr.length);

        System.out.println(Arrays.toString(des));
    }
}
