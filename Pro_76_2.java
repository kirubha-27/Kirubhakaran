public class Pro_76_2 {
    static int i=0,j=0;

    public static void rec(int[][] a,int rows,int cols,int[][] res) {
        if (i >= rows) {
            return;
        }
        if (j < cols) {
            res[j][i]=a[i][j];
            j++;
            rec(a, rows, cols,res);
        }

        j = 0;
        i++;

        rec(a, rows, cols,res);
    }
    public static void transpose(int[][] arr,int m,int n){
        int[][] res = new int[n][m];
        rec(arr,m,n,res);
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