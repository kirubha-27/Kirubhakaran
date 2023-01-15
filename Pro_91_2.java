import java.util.Arrays;

public class Pro_91_2 {
    public static void sort(String str){
        int max = 26;
        int ch[] = new int[max];
        for (int i = 0; i < str.length(); i++) {
            ch[str.charAt(i) - 'a']++;
        }
        for (int i =max-1;i>=0;i--) {
            for (int j=0;j<ch[i];j++)
            {
                System.out.print((char) ('a'+i));
            }
        }
    }
    public static void main(String[] args) {
        String str = "program";
        sort(str);
    }
}
