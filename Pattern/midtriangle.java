   /*               *
                   ***
                  *****
                 *******
 */

import java.util.Scanner;

public class midtriangle {
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
        System.out.println("Enter how many row you want: ");
        int n = sc.nextInt();
        sc.close();
        int p,k=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            p=k+2;
            for(k=1;k<p;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
