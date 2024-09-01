import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência 12!: ");
        String agencia = scanner.nextLine();
        
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a linha nova após o número da conta

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem final com os dados fornecidos
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
        "sua agência é " + agencia + ", conta " + numero +
        " e seu saldo R$ " + String.format("%.2f", saldo) + " já está disponível para saque.";

        System.out.println(mensagem);

        scanner.close();
    
    }
}
