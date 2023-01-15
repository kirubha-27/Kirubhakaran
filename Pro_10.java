import java.util.Arrays;


class Pro_10{
    static void sort(int[] arr,int n){
        int[] temp = arr.clone();
        Arrays.sort(temp);
        int s=0,l=n-1;
        boolean bool = true;
        for(int i=0;i<n;i++){
            if(bool){
                arr[i]=temp[l--];
            }else{
                arr[i]=temp[s++];
            }
            bool=!bool;
        }
    }
    public static void main(String[] args) {
        System.out.println("ALTERNATE SORTING");
        int[] arr = new int[]{1,2,3,4,5,6,7};
        sort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}