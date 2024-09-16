import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("What's your first name? ");
        String firstName = scan.next() + " ";

        System.out.print("What's your last name? ");
        String lastName = scan.next();

        System.out.print("What's your age? ");
        int age = scan.nextInt();

        System.out.print("What's your hight? ");
        double hight = scan.nextDouble();

        scan.close();

        System.out.println(
                "\nYour name is " + firstName + lastName + ". You're " + age + " years old and is " + hight
                        + " m high.");
    }
}
