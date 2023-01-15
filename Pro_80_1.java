public class Pro_80_1 {
    public static void check(int[][] a,int rows,int cols){
        int size = rows*cols;
        int count = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(a[i][j] == 0)
                    count++;
            }
        }

        if(count > (size/2))
            System.out.println("Given matrix is a sparse matrix");
        else
            System.out.println("Given matrix is not a sparse matrix");
    }

    public static void main(String[] args) {
        int[][] a = {
                {1,0,0,0},
                {0,1,0,0},
                {0,0,1,0},
                {0,0,0,1}};
        check(a,a.length,a[0].length);
    }
}
