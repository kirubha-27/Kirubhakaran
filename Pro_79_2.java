public class Pro_79_2 {
    static int i=0,j=0;
    static boolean flag=true;

    public static boolean rec(int[][] a,int rows,int cols) {
        if (i >= rows) {
            return flag;
        }
        if (j < cols) {
            if(i == j && a[i][j] != 1){
                flag = false;
            }
            if(i != j && a[i][j] != 0){
                flag = false;
            }
            j++;
            rec(a, rows, cols);
        }

        j = 0;
        i++;

        rec(a, rows, cols);
        return flag;
    }
    public static void check(int[][] a,int rows,int cols){

        if(rows != cols){
            System.out.println("Matrix should be a square matrix");
        }
        else {
            if(rec(a,rows,cols))
                System.out.println("Given matrix is an identity matrix");
            else
                System.out.println("Given matrix is not an identity matrix");
        }
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
