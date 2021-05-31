import java.util.Scanner;

/**
 * Created by Ritu on 10/11/16.
 */
public class UserInputExample {
    public static void main(String args[]) {

        //Creating Scanner instance to scan console for User input
        Scanner console = new Scanner(System.in);
        System.out.println("You want encrypt or decrypt \n1. Encrypt \n2. Decrypt");
        String option = console.nextLine();
        System.out.println("System is ready to accept input,\n please enter name : ");
        String name = console.nextLine();
        System.out.println("Hi " + name + ", Can you enter an int number now?");
        String number = console.nextLine();
        System.out.println("You have entered : " + number);
        System.out.println("Thank you");

    }
}
