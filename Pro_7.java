import java.util.Scanner;

class Pro_7{
    public static void main(String[] args) {
        System.out.println("PATTERN PRINTING");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length;i++){
            for(int j=0;j<ch.length;j++){
                if(i==j||j==ch.length-i-1)
                    System.out.print(ch[i]);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}