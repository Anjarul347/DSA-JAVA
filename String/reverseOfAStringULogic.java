package String;

import java.util.*;

public class reverseOfAStringULogic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any String to reverse the String:-");
        String OriginalString=sc.nextLine();
        sc.close();
        String ReverseString=Reverse(OriginalString);

        System.out.println("The Reverse String is "+ ReverseString);
        
       

        
    }

    public static String Reverse(String input){
        char[] str=input.toCharArray();

        int Length=str.length;
        for(int i=0;i<Length/2;i++){
            char temp=str[i];
            str[i]=str[Length-1-i];
            str[Length-1-i]=temp;
        }

        return new String(str);
    }
    
}
