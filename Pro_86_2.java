public class Pro_86_2 {

    public static void printer(char[] ch,int i,int n){
        if(i>=n){
            return;
        }
        System.out.print(ch[i]+" ");
        printer(ch,i+1,n);
    }
    public static void main(String[] args) {
        char[] ch = {'a','b','c','d','e','f'};
        printer(ch,0,ch.length);
    }
}
