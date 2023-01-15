class Pro_39{
    public static void main(String[] args) {
        int[] arr = new int[]{1,7,3,6,64,-6,26,3,6,65};
        int min=Integer.MAX_VALUE;
        for (int j : arr) {
            if (j < min)
                min = j;
        }
        System.out.println("The smallest element in array is "+min);
    }
}