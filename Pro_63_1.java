public class Pro_63_1 {
    public static void print(int[] arr){
        int max = Integer.MIN_VALUE;
        int min  = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            min=Math.min(min,arr[i]);
        }

        System.out.println("The largest element is "+max);
        System.out.println("The smallest element is "+min);
    }
    public static void main(String[] args) {
        int[] arr = {1,22,3,4,56,44,56};
        print(arr);
    }
}
