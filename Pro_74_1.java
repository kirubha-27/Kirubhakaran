public class Pro_74_1 {
    public static void mul(int[][] a,int r1,int c1,int[][] b,int r2,int c2){
        if(c1!=r2){
            System.out.println("invalid operation");
            System.exit(0);
        }
        int[][] c = new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<r2;k++){
                    c[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[0].length;j++){
                System.out.printf("%4d",c[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] a = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        int[][] b = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        mul(a,a.length,a[0].length,b,b.length,b[0].length);
    }
}
