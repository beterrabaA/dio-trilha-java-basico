package src;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        int numAgencia = sc.nextInt();
        System.out.println("Agora,digite sua agencia com digito! XXX-X");
        String agencia = sc.next();
        System.out.println("Agora,digite seu nome:");
        String nome = sc.next();
        sc.nextLine();
        System.out.println("Agora digite o valor depositado que ficara disponivel na sua conta");
        double saldo = sc.nextDouble();

        ContaBanco novaConta = new ContaBanco(numAgencia,agencia,nome,saldo);

        novaConta.saudacao();

    }
}
