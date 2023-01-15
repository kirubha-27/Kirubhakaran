import java.util.HashMap;
import java.util.Map;

public class Pro_94_1 {
    public static void check(String s1,String s2){
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        if(ch1.length!=ch2.length) {
            System.out.println("false");
            return;
        }
        int[] freq = new int[256];
        for(int i=0;i<ch1.length;i++){
            freq[ch1[i]]++;
            freq[ch2[i]]--;
        }

        for(int i=0;i<256;i++){
            if(freq[i]!=0){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
    public static void main(String[] args) {
        String str1 = "tesingi8";
        String str2 = "gsintei";
        check(str1,str2);
    }
}
