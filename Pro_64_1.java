import java.util.Arrays;

public class Pro_64_1 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,5,6,7};
        int[] des = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            des[i] = arr[i];
        }
        System.out.println(Arrays.toString(des));
    }
}
