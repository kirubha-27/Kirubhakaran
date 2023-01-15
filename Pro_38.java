class Pro_38{
    public static void main(String[] args) {
        int[] arr = new int[]{1,7,3,6,64,26,3,6,65};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max = arr[i];
        }
        System.out.println("The largest element in array is "+max);
    }
}