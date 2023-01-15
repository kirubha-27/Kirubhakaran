import java.util.Arrays;

public class Pro_64_4 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,5,6,7};
        int[] des = new int[arr.length];
        System.arraycopy(arr,0,des,0,arr.length);

        System.out.println(Arrays.toString(des));
    }
}
