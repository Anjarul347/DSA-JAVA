package miscelenious;

import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int option;

        do{
            System.out.println("\n \n\nEnter 0 for exit the program");
            System.out.println("Enter 1 to deal with old syntax");
            System.out.println("Enter 2 to deal with new syntax");
            System.out.println("Enter 3 to deal with nested switch case in old syntax");
            System.out.println("Enter 4 to deal with nested switch case in new syntax");
            System.out.println("Enter 5 to deal with the syntax of Printing one value for many cases");
   
            System.out.println("\n\n Enter any option");
            option = sc.nextInt();
   
            switch (option){
               case 0:
                   System.out.println("Exitting........!");
                   break;
               case 1:
                   System.out.println("Anj");
                   break;
               case 2:
                   System.out.println("Man");
                   break;
               case 3:
                   System.out.println("San");
                   break;
               case 4:
                  System.out.println("Vanja");
                   break;
               case 5:
                   System.out.println("Khanja");
                   break;
               default:            
                   System.out.print("Invalid input, Please enter a valid input");
                   break;  
               }    
   
               
           }while( option != 0);


           sc.close();
    }

    
}
