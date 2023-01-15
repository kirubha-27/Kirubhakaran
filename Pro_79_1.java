public class Pro_79_1 {
    public static void check(int[][] a,int rows,int cols){
        boolean flag = true;
        if(rows != cols){
            System.out.println("Matrix should be a square matrix");
        }
        else {
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < cols; j++){
                    if(i == j && a[i][j] != 1){
                        flag = false;
                        break;
                    }
                    if(i != j && a[i][j] != 0){
                        flag = false;
                        break;
                    }
                }
            }

            if(flag)
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
