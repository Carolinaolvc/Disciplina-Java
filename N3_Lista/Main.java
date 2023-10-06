import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Banco b = new Banco();
        double saldo;
        double deposito_att, saque_att, transf_att;

        System.out.printf("Bem-vindo(a) ao Banco Quero-Tudo-Que-E-Seu. Escolha uma das opções a seguir: \n"+
        "Tecle 1 para Consultar saldo.\n"+
        "Tecle 2 para Depositar.\n"+
        "Tecle 3 para Sacar. \n"+
        "Tecle 4 para Transferir. \n");

        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.printf("O seu saldo é de: R$ %.2f", b.saldo);
                break;
            case 2:
                System.out.printf("Insira o valor que deseja depositar:");
                    deposito_att = sc.nextDouble();
                    b.deposito(deposito_att);
                    System.out.printf("Seu saldo atual é de: R$ %.2f", b.saldo);
                    break;
            case 3:
                System.out.printf("Seu saldo é de R$ %.2f. Digite quanto deseja sacar: ",b.saldo);
                    saque_att = sc.nextDouble();
                    b.saque(saque_att);
                    System.out.printf("Seu saldo atual é de: R$ %.2f", b.saldo);
                    break;
            case 4:
                System.out.printf("Seu saldo é de R$ %.2f. Digite quanto deseja trasnferir: ",b.saldo);
                    transf_att = sc.nextDouble();
                    b.transferencia(transf_att);
                    System.out.printf("Seu saldo foi atualizado para: R$ %.2f.", b.saldo);
                    break;
            default:
                System.out.println("Insira uma opção válida");
                break;
        }
    }
}
