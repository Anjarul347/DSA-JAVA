/*
        1 2 3 4 5
        1 2 3 4 
        1 2 3
        1 2
        1
 */


import java.util.Scanner;

public class NumberTriangle2 {
     public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
        System.out.println("Enter how many row you want: ");
        int n = sc.nextInt();
        sc.close();

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
    
}