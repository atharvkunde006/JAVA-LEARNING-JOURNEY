
import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        if (age >= 12)
            System.out.println("you are tennager.");

        else if (age < 9)
            System.out.println("You are child");
        else
            System.out.println("you are chutiya");

    }
}
