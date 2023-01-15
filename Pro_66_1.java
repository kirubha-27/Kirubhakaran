import java.util.Arrays;

public class Pro_66_1 {
    public static void rotate(int[] arr,int r,int n){
        for(int i=0;i<r;i++){
            for(int j=0;j<n-1;j++){
                arr[j]=arr[j]^arr[j+1];
                arr[j+1]=arr[j]^arr[j+1];
                arr[j]=arr[j]^arr[j+1];
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        rotate(arr,7,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
