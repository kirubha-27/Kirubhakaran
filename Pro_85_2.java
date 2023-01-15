public class Pro_85_2 {
    static int i=0,j=0,sum_row=0,sum_col=0;

    public static void rec(int[][] a, int rows, int cols){

        if(i>=rows){
            return;
        }
        if(j<cols){
            sum_row+=a[i][j];
            sum_col+=a[j][i];
            j++;
            rec(a,rows,cols);
        }
        if(i<rows) {
            System.out.printf("sum of row%d is %d\n", i + 1, sum_row);
            System.out.printf("sum of col%d is %d\n", i + 1, sum_col);
            sum_row = 0;
            sum_col = 0;
            j = 0;
            i++;

            rec(a, rows, cols);
        }
    }
    public static void check(int[][] a,int rows,int cols){
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
