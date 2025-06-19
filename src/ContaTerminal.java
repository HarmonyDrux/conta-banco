import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o número da conta: ");
        var numero = scanner.nextInt();
        System.out.println("Por favor digite o número da agência: ");
        ;
        var agencia = scanner.next();
        String nome = "MARIO ANDRADE";
        Double saldo = 237.48;
        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque\n",
                nome, agencia, numero, saldo);
    }
}
