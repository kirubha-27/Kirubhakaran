class Pro_11{
    static void rotate(int[][] arr){

        int l=0,r=arr.length-1;
        int t,b;
        while(l<r){
            for(int i=0;i<r-l;i++){
                t=l;
                b=r;
                int temp = arr[t][r-i];
                arr[t][r-i]=arr[b-i][r];
                arr[b-i][r]=arr[b][l+i];
                arr[b][l+i]=arr[t+i][l];
                arr[t+i][l]=temp;
            }
            l++;
            r--;
        }
    }
    public static void main(String[] args) {
        System.out.println("LEFT ROTATE FOR MULTIDIMENSIONAL ARRAY");
        int[][] arr = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("Before rotation");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.printf("%3d",arr[i][j]);
            }
            System.out.println();
        }
        rotate(arr);
        System.out.println("After rotation");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.printf("%3d",arr[i][j]);
            }
            System.out.println();
        }
    }
}