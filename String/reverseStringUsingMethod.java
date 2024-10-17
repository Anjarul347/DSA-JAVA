// To Reverse of a given String by using stringbuilder function

package String;

import java.util.Scanner;

public class reverseStringUsingMethod {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to reverse the String:-");
        StringBuilder sb=new StringBuilder("Anjar");
        sc.close();
        for(int i=0;i>sb.length()/2;i++){
            int front = i;
            int back = sb.length()-1-i;

            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);


            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        
        System.out.println("The reverse String is "+sb);
        
    }
    
}
