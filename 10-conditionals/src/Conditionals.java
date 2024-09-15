public class Conditionals {
    public static void main(String[] args) throws Exception {
        double balance = 25.0;
        double withdrawal = 120;

        if (withdrawal <= balance) {
            balance -= withdrawal;
        }

        System.out.println(balance);
    }
}
