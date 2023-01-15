import java.util.Scanner;


class Pro_57{
    static void pattern(String str){
        char[] ch = str.toCharArray();
        int n = ch.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    System.out.print(ch[i]);
                } else if (j==n-i-1&&i!=n/2) {
                    System.out.print(ch[n-i-1]);
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        pattern(str);
    }
}