package Recursion;

import java.util.Scanner;

public class Factirial {
    static int fact(int n){
        if(n==1 || n==0)
        return 1;
        else
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int num  = sc.nextInt();

        sc.close();

        int factorial =fact(num);

        System.out.printf("The factorial of %d is = %d",num,factorial);
    }
}
