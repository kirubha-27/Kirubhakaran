
class Pro_45{
    public static void print(int[] arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        print(arr,arr.length);
    }
}