//Fibonacci series till nth term



//first method
package Recursion;

import java.util.Scanner;

// public class FibanacciSeries {
//       static int fibo(int n){
    
//         if(n<=1)
//            return n;
//         return fibo(n-1) + fibo(n-2);

//       }

//       public static void main(String[] args) {
//         System.out.println("Enter the number of terms you want in Fibonacci Series:");
//         Scanner scanner = new Scanner(System.in);
//         int num = scanner.nextInt();
//         scanner.close();
//         for(int i=0;i<num;i++)
//             System.out.println(fibo(i));

//       }
// }















//2nd method 










// public class FibanacciSeries {

//     static int m1= 0, m2=1, m3;
//       static void fibo(int n){
       
//         if(n>2)
//          {
//             m3 = m1+m2;
//             m1 = m2;
//             m2 = m3;
//             System.out.print(m3+" ");
//             fibo(n-1);
//          }
         

        
        
//       }

//       public static void main(String[] args) {
//         System.out.println("Enter the number of terms you want in Fibonacci Series:");
//         Scanner scanner = new Scanner(System.in);
//         int num = scanner.nextInt();
//         scanner.close();

//         System.out.print("0 1 ");
//         fibo(num);
            

//       }
// }
















//3rd method

public class FibanacciSeries {

    
     public static void fibo(int a, int b, int n){
       
        if(n==0)
         {
           return  ;
         }

         int c = a + b;
         System.out.print(c +" ");
         
         fibo(b, c, n-1);
        
        
      }

      public static void main(String[] args) {
        System.out.println("Enter the number of terms you want in Fibonacci Series:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();


        int a=0, b=1;

        System.out.printf("%d %d ",a,b);
            
        fibo(a, b, num-2);
      }
}