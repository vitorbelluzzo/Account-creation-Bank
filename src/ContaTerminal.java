import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite o número da sua conta:");
        int Numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência:");
        String Agencia = scanner.next();

        System.out.println("Por favor, digite seu Nome:");
        String NomeCliente = scanner.next();

        System.out.println("Por favor, digite seu Sobrenome:");
        String SobrenomeCliente = scanner.next();

        System.out.println("Por favor, digite seu saldo:");
        double Saldo = scanner.nextDouble();

        System.out.println("Olá " + NomeCliente + " " + SobrenomeCliente
                + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque.");

    }
}
