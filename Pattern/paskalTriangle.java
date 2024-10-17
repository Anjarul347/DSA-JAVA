import java.util.Scanner;

public class paskalTriangle{
    

   int fact(int n){
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial = factorial * i;
        }
        return (factorial);
    }
    int combination(int n, int r){
        return ((fact(n)/(fact((r))*fact(((n)-(r))))));
    }


    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
        System.out.println("Enter how many row you want: ");
        int n = sc.nextInt();
        sc.close();
        paskalTriangle a = new paskalTriangle();

        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++)
                System.out.print(" ");
        
            for(int j=0;j<=i;j++){
                
                System.out.print(a.combination(i,j)+" ");
            }
            System.out.println();
        }
    }
}
