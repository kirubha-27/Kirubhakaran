class Pro_61_1{
    static void print(int[] a,int i){
        if(i==a.length)
            return;
        print(a,i+1);
        System.out.print(a[i]+" ");
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        print(a,0);
    }
}