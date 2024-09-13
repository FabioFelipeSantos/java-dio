public class Main {
    public static void main(String[] args) {
        double num1 = 2;
        double num2 = -8;

        Calculator calc = new Calculator();

        double sum = calc.sum(num1, num2);
        System.out.println(sum);
    }
}
