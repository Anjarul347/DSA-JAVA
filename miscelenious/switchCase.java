package miscelenious;

import java.util.Scanner;

public class switchCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int option;
        
        do {
            System.out.println("\n \n\nEnter 0 for exit the program");
            System.out.println("Enter 1 to deal with old syntax");
            System.out.println("Enter 2 to deal with new syntax");
            System.out.println("Enter 3 to deal with nested switch case in old syntax");
            System.out.println("Enter 4 to deal with nested switch case in new syntax");
            System.out.println("Enter 5 to deal with the syntax of Printing one value for many cases");

            System.out.println("\n\n Enter any one option from the above list");
            option = sc.nextInt();

            switch (option) {
                case 0:
                    System.out.println("Exitting........!");
                    break;
                case 1:
                    oldSyntax();
                    break;
                case 2:
                    newSyntax();
                    break;
                case 3:
                    nestedOldSyntax();
                    break;
                case 4:
                    nestedNewSyntax();
                    break;
                case 5:
                    printOneValueForManyCases();
                    break;
                default:
                    System.out.print("Invalid input, Please enter a valid input");
                    break;
            }

        } while (option != 0);
        sc.close();

    }

    // Simple switch case old syntax
    static void oldSyntax() {
        System.out.println("Enter any of one from the given fruits: Mango, Apple, Graps, Banana");
        Scanner sc = new Scanner(System.in);

        String fruits = sc.next();

        sc.close();

        switch (fruits) {

            case "Mango":
                System.out.println("This is king of fruits.");
                break;

            case "Apple":
                System.out.println("it is the little bit of sweet fruit.");
                break;
            case "Graps":
                System.out.println("It is a good choice for your diet");
                break;
            case "Banana":
                System.out.println("It is a long fruit.");
                break;
            default:
                System.out.println("Sorry, we don't have this kind of fruit in our store.");
                break;

        }

    }

    // Simple switch case new syntax
    static void newSyntax() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any of one from the given fruits: Mango, Apple, Graps, Banana");
        String fruits = sc.next();
        sc.close();
        switch (fruits) {

            case "Mango" -> System.out.println("This is king of fruits.");

            case "Apple" -> System.out.println("it is the little bit of sweet fruit.");

            case "Graps" -> System.out.println("It is a good choice for your diet");

            case "Banana" -> System.out.println("It is a long fruit.");

            default -> System.out.println("Sorry, we don't have this kind of fruit in our store.");
        }

    }

    // Nested switch case in old syntax
    static void nestedOldSyntax() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: From 1 to 5");
        int empId = sc.nextInt();

        switch (empId) {
            case 1:
                System.out.println("Sk Anjarul Hossain");
                break;
            case 2:
                System.out.println("Rahul Sharma");
                break;
            case 3:
                System.out.println("Pritam Kar");
                break;
            case 4:
                System.out.println("Enter Department name: Either IT or Management");
                String dept = sc.next();

                switch (dept) {
                    case "IT":
                        System.out.println("This is It Department");
                        break;
                    case "Management":
                        System.out.println("It is Management department");
                        break;
                    default:
                        System.out.println("You have not entered any department");
                        break;
                }
                break;

            case 5:
                System.out.println("Rohini Das");
                break;
            default:
                System.out.println("You entered wrong employee ID");
                break;
        }
        sc.close();

    }

    // Nested switch case in old syntax
    static void nestedNewSyntax() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID");
        int empId = sc.nextInt();

        switch (empId) {
            case 1 -> System.out.println("Sk Anjarul Hossain");
            case 2 -> System.out.println("Radhika Soni");
            case 3 -> System.out.println("Pritam Kar");
            case 4 -> {
                System.out.println("Enter Department Name:");
                String dept = sc.nextLine();
                switch (dept) {
                    case "IT" -> System.out.println("Information technology department");
                    case "Management" -> System.out.println("It is management department");
                    default -> System.out.println("You have not entered any departmebnt");
                }
            }

            default -> System.out.println("You have entered wrong emp ID");
        }
        sc.close();

    }

    // Printing one value into many cases
    static void printOneValueForManyCases() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of day to know that day is weekend or not: Enter any number from 1 to 7");
        int days = sc.nextInt();
        sc.close();
        switch (days) {
            case 1, 2, 3, 4, 5 -> System.out.println("This is WeekDay");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("You enter wrong input");
        }

    }

}
