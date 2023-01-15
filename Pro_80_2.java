public class Pro_80_2 {
    static int i=0,j=0,count=0;


    public static int rec(int[][] a,int rows,int cols) {
        if (i >= rows) {
            return count;
        }
        if (j < cols) {
            if(a[i][j] == 0)
                count++;
            j++;
            rec(a, rows, cols);
        }

        j = 0;
        i++;

        rec(a, rows, cols);
        return count;
    }
    public static void check(int[][] a,int rows,int cols){
        int size = rows*cols;
        int count = rec(a,rows,cols);

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
