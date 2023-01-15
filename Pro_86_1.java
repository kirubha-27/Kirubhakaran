public class Pro_86_1 {
    public static void printer(char[] ch,int n){
        for(int i=0;i<n;i++){
            System.out.print(ch[i]+" ");
        }
    }
    public static void main(String[] args) {
        char[] ch = {'a','b','c','d','e','f'};
        printer(ch,ch.length);
    }
}
