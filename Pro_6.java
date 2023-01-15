import java.util.Scanner;

class Pro_6{
    public static void main(String[] args) {
        System.out.println("SPLIT 4 GROUPS BASED ON ROLL NUMBER");
        Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the number of students: ");
        int no_student = sc.nextInt();
	  System.out.print("Enter number of groups: ");
        int no_group = sc.nextInt();
	  System.out.print("Enter the initial roll Number: ");
        int roll_no = sc.nextInt();
        int n=no_student/no_group;

        for(int i=1;i<=no_group;i++){
            System.out.println("Group "+i+":");
            for(int j=0;j<n;j++){
                System.out.println((roll_no+i-1)+(j*4));
            }
        }
    }
}