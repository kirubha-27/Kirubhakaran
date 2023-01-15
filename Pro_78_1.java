public class Pro_78_1 {
    public static void add(int[][] a,int[][] b){
        int[][] c = new int[a.length][a[0].length];
        if(a.length!=b.length||a[0].length!=b[0].length){
            System.out.println("Not possible");
            return;
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                c[i][j] = a[i][j]-b[i][j];
            }
        }
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[0].length;j++){
                System.out.printf("%3d",c[i][j]);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int[][] a = {{1,2,3,4},
                {2,3,4,5},
                {4,6,3,5},
                {2,5,7,8}};
        int[][] b = {{3,4,5,6},
                {3,4,2,1},
                {6,7,5,4},
                {9,6,2,1}};
        add(a,b);
    }
}