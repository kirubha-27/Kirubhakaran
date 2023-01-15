import java.util.Arrays;

class Pro_46{
    public static void rightRotate(int[] arr,int n){
        int temp = arr[n-1];
        for(int i=n-2;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        rightRotate(arr,arr.length);
        System.out.println(Arrays.toString(arr));

    }
}