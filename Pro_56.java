

class Pro_56{
    public static void print(int n){
        int i,j=0,count=0,ter=0;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                count++;
            }
            if(count>=n) {
                ter = i;
                break;
            }
        }
        System.out.println(ter);
        System.out.println(count);
        count=1;
        for(int k=0;k<ter;k++){
            for(int s=k+1;s<ter;s++){
                System.out.print(" ");
            }
            for(int m=0;m<=k;m++){
                System.out.printf("%d ",count++);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {


       print(30);
    }
}
