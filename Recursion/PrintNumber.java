package Recursion;

public class PrintNumber {
    static void printNum(int n){
            if(n==0){
                return;
            }
            
            printNum(n-1);
            System.out.println(n);


        }

    public static void main(String[] args) {
        int n = 5;

        printNum(n);

        
    
    }
}
