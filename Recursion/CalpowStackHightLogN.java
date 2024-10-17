
// print x^n (Stack height  = Logn)


package Recursion;

public class CalpowStackHightLogN {

    static int calPower(int x,int n){
        if(x==0){
            return 0;
        }

        if(n==0){
            return 1;
        }
        
        // For even num
        if(n % 2==0){
            return calPower(x, n/2) * calPower(x, n/2);
        }

         // For odd num
        else{
           
            return x * calPower(x, n/2) * calPower(x, n/2);
        }
    }
    public static void main(String[] args) {
        int x = 2, n=10;
        System.out.println("Result is : "+calPower(x,n)); 
        
    }
}
