import java.util.Arrays;

class Pro_43{
    public static void leftRotate(int[] arr,int r,int n){
        r=r%n;
        int[] temp = new int[r];

        for(int i=0;i<r;i++){
            temp[i]=arr[i];
        }
        for(int i=r;i<n;i++){
            arr[i-r]= arr[i];
        }
        for(int i=n-r;i<n;i++){
            arr[i]=temp[i-(n-r)];
        }

    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        leftRotate(arr,2,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
