public class Pro_83_1 {
    public static void check(int[][] a,int rows,int cols){
        if(rows != cols){
            System.out.println("Matrix should be a square matrix");
            return;
        }
        System.out.println("Lower triangular matrix: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(j < i)
                    System.out.printf("%3d",0);
                else
                    System.out.printf("%3d",a[i][j]);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {8, 7, 6, 5},
                {9, 10,11,12},
                {16,15,14,13}};
        check(a,a.length,a[0].length);
    }
}
