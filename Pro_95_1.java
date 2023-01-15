public class Pro_95_1 {
    public static void check(String str, int n){
        int l=0,r=n-1;
        while (l<r){
            if(str.charAt(l)!=str.charAt(r)){
                System.out.println(str+" not palindrome");
                return;
            }
            l++;
            r--;
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
