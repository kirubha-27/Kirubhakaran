import java.util.Scanner;

class Pro_53{
    public static void print(String s){
        char[] ch = s.toCharArray();
        char temp;
        int cont=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='0'&&ch[i]<='9'){
                temp=ch[i-1];
                while(ch[i]>='0'&&ch[i]<='9'){
                    cont = cont*10 + (ch[i]-48);
                    i++;
                    if(i>=ch.length)
                        break;
                }
                for(int j=0;j<cont;j++){
                    System.out.print(temp);
                }
            }
            cont=0;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String s = sc.nextLine();
        print(s);
    }
}