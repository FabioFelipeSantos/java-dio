import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        int numero1 = recolheNumeroDoUsuario(scan);

        try {
            int numero2 = recolheNumeroDoUsuario(scan);
            contar(numero1, numero2);
            scan.close();
        } catch (ParametrosInvalidosException e) {
            System.err.println("Parâmetros inválidos: o segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    static void contar(int num1, int num2) throws ParametrosInvalidosException {
        if (num2 < num1) {
            throw new ParametrosInvalidosException();
        }

        int quantidadeDeNumeros = num2 - num1;

        for (int i = 1; i <= quantidadeDeNumeros; i++) {
            System.out.println("Imprimindo número " + i);
        }
    }

    static int recolheNumeroDoUsuario(Scanner scanner) {
        System.out.print("Digite um número inteiro: ");
        return scanner.nextInt();
    }
}
