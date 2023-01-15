public class Pro_76_1 {
    public static void transpose(int[][] arr,int m,int n){
        int[][] res = new int[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[j][i] = arr[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.printf("%3d",res[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{5,6,7},
                {1,2,3},{5,6,7}};

        transpose(arr,arr.length,arr[0].length);
    }
}
