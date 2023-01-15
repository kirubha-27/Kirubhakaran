import java.util.Scanner;

class Pro_59_2{
    public static int print(String s1,String s2){

	  //using sliding windows
        
	  int j=0;
        for(int i=s2.length()-1;i<s1.length();i++){
            if(s1.charAt(j)==s2.charAt(0)&&s1.charAt(i)==s2.charAt(s2.length()-1)){
                String temp = s1.substring(j,i+1);
                if(s2.equals(temp)){
                    return j;
                }
            }
            j++;
        }
        return -1;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String 1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter the String 2: ");
        String s2  = sc.nextLine();
        System.out.println();
        System.out.println(print(s1,s2));


    }
}