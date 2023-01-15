class Pro_41{
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,4,5,6,4,6,4,5};
        int[] arr2 = new int[arr.length];

       //arr2 = arr.clone();

        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
        }
        for(int j=0;j<arr2.length;j++){
            System.out.print(arr2[j]+" ");
        }
    }
}
