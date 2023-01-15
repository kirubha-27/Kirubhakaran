public class Pro_95_2 {
    public static void check(String str, int n){
        int j=n-1;
        for(int i=0;i<n;i++){
            if(str.charAt(i)!=str.charAt(j--)){
                System.out.println(str+" is not palindrome");
                return;
            }
        }
        System.out.println(str+" is palindrome");
    }
    public static void main(String[] args) {
        String str1 = "porop";
        String str2 = "porrpp";
        check(str1,str1.length());
        check(str2,str2.length());
    }
}
