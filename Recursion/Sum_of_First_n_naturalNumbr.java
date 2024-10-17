package Recursion;

import java.util.Scanner;

public class Sum_of_First_n_naturalNumbr {

    static int printNaturalNum(int n){
        if(n<1)
            return 0;
        else
            return printNaturalNum(n-1) + n;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many number you want");
        int n = sc.nextInt();
        sc.close();
        int sum = printNaturalNum(n);

        System.out.printf("The sum of first %d natural number is = %d",n,sum);
    }
}
