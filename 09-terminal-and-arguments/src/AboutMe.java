import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter your name: ");
        String name = scanner.next();

        System.out.println("Enter your last name: ");
        String lastName = scanner.next();

        System.out.println("What is your age? ");
        int age = scanner.nextInt();

        System.out.println("What is your hight? ");
        double height = scanner.nextDouble();

        scanner.close();

        System.out.println("Hi! My name is " + name + " " + lastName);
        System.out.println("I am " + age + " years old, and my height is " + height + "m.");
    }
}
