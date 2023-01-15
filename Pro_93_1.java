import java.util.Arrays;

public class Pro_93_1 {
    public static void rec(char[] ch ,int n){
        if(n==1){
            return;
        }
        int count = 0;
        for(int i=0;i<n-1;i++){
            if(ch[i]<ch[i+1]){
                char temp = ch[i];
                ch[i]=ch[i+1];
                ch[i+1]=temp;
                count = count+1;

            }
        }
        if(count==0){
            return;
        }
        rec(ch,n-1);

    }
    public static void changer(String str){
        char[] ch = str.toCharArray();

        rec(ch,ch.length);
        StringBuilder strr = new StringBuilder(String.valueOf(ch));
        System.out.println(strr);
    }
    public static void main(String[] args) {
        String str = "program";
        changer(str);
    }
}
