import java.util.Locale;
import java.util.Scanner;

        public class ContaTerminal {
        //Armazenamento do programa    
    
        public static void main(String[] args) { 
        // Porta de entrada do programa    


        // Criando o objeto scanner para interação com usuário
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência!");
        int numero = scanner.nextInt(); // Solicitando o n° da agência

        System.out.println("Por favor, digite o número da Conta!");
        String agencia = scanner.next(); // Solicitando o n° da conta

        System.out.println("Por favor, digite seu nome!");
        String nomeCliente = scanner.next(); // Solicitando o nome do cliente

        System.out.print("Por favor, digite o saldo da Conta: ");
        double saldo = scanner.nextDouble(); // Solicitando o saldo do cliente

         // Fechando o scanner
         scanner.close();

        // Imprimindo os dados obtidos pelo usuario
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
        "sua agência é " + agencia + ", conta " + numero + 
        " e seu saldo: " + saldo + 
        " já está disponível para saque.");

    }
}
