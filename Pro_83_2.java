public class Pro_83_2 {
    static int i=0,j=0;

    public static void rec(int[][] a,int rows,int cols){
        if(i>=rows){
            return;
        }
        if(j<cols){
            if(j<i){
                System.out.printf("%3d",0);
            }else{
                System.out.printf("%3d",a[i][j]);
            }
            j++;
            rec(a,rows,cols);
        }
        if(i<cols) {
            j = 0;
            System.out.println();
            i++;

            rec(a, rows, cols);
        }
    }
    public static void check(int[][] a,int rows,int cols){
        if(rows != cols){
            System.out.println("Matrix should be a square matrix");
            return;
        }
        System.out.println("Upper triangular matrix: ");
        rec(a,rows,cols);
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
