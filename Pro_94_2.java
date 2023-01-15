import java.util.Arrays;

public class Pro_94_2 {
    public static boolean check(String s1,String s2){
        s1=s1.replaceAll("\\s","");
        s2=s2.replaceAll("\\s","");

        if(s1.length()!=s2.length()){
            return false;
        }else {
            char[] arr1 = s1.toLowerCase().toCharArray();
            char[] arr2 = s2.toLowerCase().toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return (Arrays.equals(arr1,arr2));
        }
    }
    public static void main(String[] args) {
        String str1 = "tesingi";
        String str2 = "gsintei";
        if(check(str1,str2)){
            System.out.println("The strings are anagram");
        }else{
            System.out.println("The strings are not anagram");
        }
    }
}
