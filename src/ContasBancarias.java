/*
 Como gerente eu gostaria que meus usuários pudessem digitar o tipo de conta e o sistema imprimir qual a porcentagem de juros que aquela conta irá oferecer. Com o intuito de agilizar o accesso as informações.
 Os tipos de contas são:
 * CONTA_POUPANCA 0.05%
 * CONTA_CORRENTE 0.02%
 * CONTA_INVESTIMENTO 0.1%
 Caso a conta não exista, imprima "CONTA INEXISTENTE".
 */

import java.util.Scanner;

public class ContasBancarias {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tipo da sua Conta Bancaria:");
        String conta = input.nextLine();

        switch (conta) {
            case "CONTA_POUPANCA":
            System.out.println("0.05%");
            break;
            case "CONTA_CORRENTE":
            System.out.println("0.02%");
            break;
            case "CONTA_INVESTIMENTO":
            System.out.println("0.1%");
            break;
            default:
            System.out.println("CONTA INEXISTENTE");
        }
    }
}
