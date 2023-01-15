class Pro_52{
    public static void recur(String[] str,int i,int n){
        if(i==n) {
            return;
        }else{
            recur(str,i+1,n);
            System.out.print(str[i]+" ");
        }
    }

    public static void main(String[] args) {
        String str = "one two three";
        String[] str1 = str.split("\\s");
        recur(str1,0,str1.length);
    }
}