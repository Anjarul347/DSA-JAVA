
/*         
        *
        **
        ***
        ****
        *****
 */





import java.util.Scanner;


public class leftTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter how many row you want: ");
        int n = sc.nextInt();
        sc.close();

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
 }

