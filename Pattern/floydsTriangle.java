/*
            1
            2 3
            4 5 6
            7 8 9 10
 */


import java.util.Scanner;

public class floydsTriangle {
     public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
        System.out.println("Enter how many row you want: ");
        int n = sc.nextInt();
        sc.close();
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                c+=1;
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
    
}
