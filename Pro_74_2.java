public class Pro_74_2 {
    public static int i=0,j=0,k=0;
    public static void rec(int[][] a,int r1,int c1,int[][] b,int r2,int c2,int[][] c){
        if(i>=r1){
            return;
        }
        if(j<c1){
            if(k<r2){
                c[i][j] += a[i][k]*b[k][j];
                k++;
                rec(a,r1,c1,b,r2,c2,c);
            }
            k=0;
            j++;
            rec(a,r1,c1,b,r2,c2,c);
        }
        j=0;
        i++;
        rec(a,r1,c1,b,r2,c2,c);
    }
    public static void mul(int[][] a,int r1,int c1,int[][] b,int r2,int c2){
        if(c1!=r2){
            System.out.println("invalid operation");
            System.exit(0);
        }
        int[][] c = new int[r1][c1];
        rec(a,r1,c1,b,r2,c2,c);
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
